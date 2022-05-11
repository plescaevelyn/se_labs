package lab4;

class Book extends Author {
    String name;
    Author author;
    double price;
    int qtyInStock;

    public Book(String name, String email, char gender, String name1, Author author, double price) {
        super(name, email, gender);
        this.name = name1;
        this.author = author;
        this.price = price;
        this.qtyInStock = 0;
    }

    public Book(String name, String email, char gender, String name1,Author author, double price, int qtyInStock) {
        super(name, email, gender);
        this.name = name1;
        this.author = author;
        this.price = price;
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
    //TODO modify this
    public String toString(){
        return this.name + " by " + name + "(" +  ") at ";
    }
}
