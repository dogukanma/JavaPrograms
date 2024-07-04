/*
 * @author Dogukan Unal
 * @date 04.07.2024
 * https://academy.patika.dev/tr/courses/java-102/odev-fixture-generator
 * Doesn't work. Needs fix.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FixtureCreator {
  public static void main(String[] args) {
    String[] arr = { "Galatasaray", "Besiktas", "Bursaspor", "Fenerbahce", "Basaksehir", "Trabzonspor", "Boluspor" };
    System.out.println(arranger(arr));
  }

  public static String arranger(String[] arr) {
    String[] evenArr = arr.clone();
    Set<Map<String, String>> set = new HashSet<>();
    if (arr.length % 2 != 0) {
      evenArr = new String[arr.length + 1];
      System.arraycopy(arr, 0, evenArr, 0, arr.length);
      evenArr[arr.length] = "Bay";
    }
    int matchPerRound = evenArr.length / 2;

    for (int i = 0; i < evenArr.length; i++) {
      for (int j = i + 1; j < evenArr.length - 1; j++) {
        Map<String, String> map = new HashMap<>();
        map.put(evenArr[i], evenArr[j]);
        Map<String, String> reverseMap = new HashMap<>();
        reverseMap.put(evenArr[j], evenArr[i]);
        set.add(map);
        set.add(reverseMap);
      }
    }

    Set<Map<String, String>> usedMaps = new HashSet<>();
    boolean check = true;
    int round = 1;
    String str = "";
    while (check) {
      System.out.println(str);
      Set<Map<String, String>> usedInRound = new HashSet<>();
      str = "\nRound " + round++;
      for (int i = 0; i < matchPerRound; i++) {
        // System.out.println("First for");
        for (Map<String, String> e : set) {
          // System.out.println("Second for");
          if (!usedMaps.contains(e) && !usedInRound.contains(e)) {
            for (Map<String, String> localMap : usedInRound) {
              // System.out.println("Third for");
              if (localMap.containsKey(e.keySet().toArray()[0])
                  || localMap.containsValue(e.get(e.keySet().toArray()[0]))) {
                continue;
              } else {
                str += "\n" + e.keySet().toArray()[0] + " vs " + e.get(e.keySet().toArray()[0]);
              }
            }
          }
        }
      }
    }

    for (Map<String, String> usedMap : set) {
      if (!usedMaps.contains(usedMap)) {
        check = true;
        break;
      } else {
        check = false;
      }
    }

    return str;
  }

}
