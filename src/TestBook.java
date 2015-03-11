/**
 * Created by student on 11.03.2015.
 */
public class TestBook {

    public static void main(String[] args) {

        Author a1 = new Author ("Alex","MyMail@mail.ru", 'M');
        Book b1 = new Book("QWERTY", 500, a1);
        Author a2 = new Author ("Vasco","sfdcd@dsaf.ru");
        Book b2 = new Book("Harry Potter", 1000, a2, 123);

        System.out.println(b1);
        System.out.println(b2);


    }
}
