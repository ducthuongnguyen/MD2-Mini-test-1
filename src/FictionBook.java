public class FictionBook extends Book {
    private String category;
    static int totalPriceOfFictionBook;

    public FictionBook() {
    }


    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
        totalPriceOfFictionBook += price;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
