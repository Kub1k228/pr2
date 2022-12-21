package java.lesson.pr2;

public class AuthorTest {
    public static void main(String[] args) {
        Author a1 =new Author("Ivan Popov","ivPopov@somewhere.com",'m');
        System.out.println(a1);
        a1.setEmail("ivPopov@somewhere.ru");
        System.out.println(a1);

    }
}
