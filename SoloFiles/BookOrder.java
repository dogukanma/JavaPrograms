/*
 * @author Dogukan Unal
 * @date 04.07.2024
 * https://academy.patika.dev/tr/courses/java-102/odev-collection-book
*/

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class BookOrder {
  public static void main(String[] args) {
    
    BookByAlphabet book1 = new BookByAlphabet("The Great Gatsby", 218, "F. Scott Fitzgerald", new Date());
    BookByAlphabet book2 = new BookByAlphabet("Moby Dick", 635, "Herman Melville", new Date());
    BookByAlphabet book3 = new BookByAlphabet("Elma", 328, "George Orwell", new Date());
    BookByAlphabet book4 = new BookByAlphabet("Armut", 328, "George Orwell", new Date());
    BookByAlphabet book5 = new BookByAlphabet("Portakal", 328, "George Orwell", new Date());

    Set<BookByAlphabet> books = new TreeSet<>();
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);

    for (BookByAlphabet book : books) {
        System.out.println(book);
    }


    Date date = new Date();
    Set<BookByPage> bbp = new TreeSet<>();
    BookByPage b1 = new BookByPage("dfgdfsb1 book classical", 100, "Senior", date);
    BookByPage b2 = new BookByPage("dfgR2 book musical", 200, "Freshman", date);
    BookByPage b3 = new BookByPage("GdfsgF3 book historical", 400, "Prep", date);
    BookByPage b4 = new BookByPage("C3dsg5 book", 300, "Junior", date);
    BookByPage b5 = new BookByPage("Dasd01 book classical", 500, "Sophomore", date);
    bbp.add(b1);
    bbp.add(b4);
    bbp.add(b3);
    bbp.add(b2);
    bbp.add(b5);
    for (BookByPage bookByPage : bbp) {
      System.out.println(bookByPage);
    }
  }
}

class BookByAlphabet implements Comparable<BookByAlphabet> {
  private String name;
  private int pageNumber;
  private String author;
  private Date releaseDate;

  BookByAlphabet(String name, int pageNumber, String author, Date releaseDate) {
    this.name = name;
    this.pageNumber = pageNumber;
    this.author = author;
    this.releaseDate = releaseDate;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    String str = String.format("%s(%d) written by %s. Released in ", name, pageNumber, author);
    str += releaseDate;
    return str;
  }

  @Override
  public int compareTo(BookByAlphabet o) {
    return this.getName().compareTo(o.getName());
  }
}

class BookByPage implements Comparable<BookByPage> {
  private String name;
  private int pageNumber;
  private String author;
  private Date releaseDate;

  BookByPage(String name, int pageNumber, String author, Date releaseDate) {
    this.name = name;
    this.pageNumber = pageNumber;
    this.author = author;
    this.releaseDate = releaseDate;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  @Override
  public String toString() {
    String str = String.format("%s(%d) written by %s. Released in ", name, pageNumber, author);
    str += releaseDate;
    return str;
  }

  @Override
  public int compareTo(BookByPage o) {
    return Integer.compare(this.getPageNumber(), o.getPageNumber());
  }
}