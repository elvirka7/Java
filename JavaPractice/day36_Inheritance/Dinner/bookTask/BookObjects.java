package day36_Inheritance.Dinner.bookTask;

import java.util.ArrayList;
import java.util.Arrays;

public class BookObjects {
    public static void main(String[] args) {

        EBook book1 = new EBook();
        book1.setInfo("Finacist", "roman", "Theodor Dreizer", 125);
        book1.setInfo("large", 32);

        System.out.println(book1);
        book1.readBook();

        System.out.println("______________________");
        AudioBook book2 = new AudioBook();
        book2.setInfo("Control Your mind", "Parenting","Eric Robertson", 30);
        book2.setInfo(33, "Amelia Dreizen");
        System.out.println(book2);
        book2.listen();

        System.out.println("_______________________");
        Book [] bookshopping  = {book1, book2};
        ArrayList<Book> booklist = new ArrayList<>(Arrays.asList(book1, book2));

        System.out.println("Elvira's book shopping list: "+bookshopping[0].title +", "+ bookshopping[1].title);
        System.out.println("Azada's book shopping list: "+ booklist.get(0).title + ", "+booklist.get(1).title);
    }
}
