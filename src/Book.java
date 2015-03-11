/**
 * Created by student on 11.03.2015.
 */
public class Book {

    private String name;
    private double price;
    private Author author;
    private int qtyInStock = 0;

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public Book(String name, double price, Author author, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author:" + author +
                '}';
    }
}


