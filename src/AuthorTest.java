/**
 * Created by student on 11.03.2015.
 */
public class AuthorTest {
    public static void main(String[] args) {
        Author a1 = new Author ("Alex","MyMail@mail.ru", 'M');
        Author a2 = new Author ("Vasco","sfdcd@dsaf.ru");

        System.out.println(a1);
        System.out.println(a2);

        a1.setEmail("QEWRTY@mail.ru");

        System.out.println(a1);
    }
}
