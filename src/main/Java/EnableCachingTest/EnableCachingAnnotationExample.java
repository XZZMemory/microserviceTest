package EnableCachingTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnableCachingAnnotationExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CachingConfig.class);
        ctx.refresh();
        Book book = ctx.getBean(Book.class);
        // calling getBook method first time.
        System.out.println(book.getBook(1));
        // calling getBook method second time. This time, method will not
        // execute.
        System.out.println(book.getBook(1));
        // calling getBook method third time with different value.
        System.out.println(book.getBook(2));
        ctx.close();
    }
}
