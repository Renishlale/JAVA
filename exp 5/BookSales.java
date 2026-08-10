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
}

public class BookSales extends BookInfo {
    int noofcopiesold;

    BookSales(String a, String t, String p, int pr, int s, int c) {
        super(a, t, p, pr, s);
        noofcopiesold = c;
    }

    void RevenueGenerated() {
        System.out.println("Revenue = " + (price * noofcopiesold));
    }

    void AllShow() {
        System.out.println("Author = " + author);
        System.out.println("Title = " + title);
        System.out.println("Publisher = " + publisher);
        System.out.println("Price = " + price);
        System.out.println("Stock = " + stock);
        System.out.println("Copies Sold = " + noofcopiesold);
    }

    public static void main(String[] args) {
        BookSales b = new BookSales(
            "James", "Java", "ABC", 500, 20, 10
        );

        b.AllShow();
        b.RevenueGenerated();
    }
}
