package homework;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class BookList {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();

        booksList.add(new Book("one","gülsün",900, LocalDate.now());
        booksList.add(new Book("two", "demir", 300, now()));
        booksList.add(new Book("three", "bakır", 900, now()));
        booksList.add(new Book("four", "ayşe", 20, now()));
        booksList.add(new Book("five", "fatma", 330, now()));
        booksList.add(new Book("six", "ali", 380, now()));
        booksList.add(new Book("seven", "asi", 100, now()));
        booksList.add(new Book("eight", "beki", 500, now()));
        booksList.add(new Book("nine", "sina", 200, now()));
        booksList.add(new Book("ten", "umut", 600, now()));

        Map<String, String> bookNameAndAuthorName  = booksList.stream().collect(Collectors.toMap(homework::getBookName, homework::getAuthorName));

        /*Map<String, String> bookNameAndAuthorName = new HashMap<>();
        booksList.stream().forEach(book -> bookNameAndAuthorName.put(book.getBookName(), book.getAuthorName()));
*/
        for(Map.Entry<String,String> entry : bookNameAndAuthorName.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------------------");

        List<Book> booksPageNumberGreaterThanHundred = booksList.stream().filter(book -> book.getTotalPage() >= 100).collect(Collectors.toList());
        for(Book book : booksPageNumberGreaterThanHundred){
            System.out.println(book);
        }

    }
}