class Book {
    String author, title, publisher;

    Book(String a, String t, String p) {
        author = a;
        title = t;
        publisher = p;
    }
}

class BookInfo extends Book {
    int price, stock;

    BookInfo(String a, String t, String p, int pr, int s) {
        super(a, t, p);
        price = pr;
        stock = s;
    }

    void show() {
        System.out.println(author + " " + title + " " + publisher);
        System.out.println(price + " " + stock);
        System.out.println();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        BookInfo b1 = new BookInfo("James", "Java", "ABC", 500, 20);
        BookInfo b2 = new BookInfo("Dennis", "C", "XYZ", 400, 15);
        BookInfo b3 = new BookInfo("Bjarne", "C++", "PQR", 600, 10);

        b1.show();
        b2.show();
        b3.show();
    }
}
