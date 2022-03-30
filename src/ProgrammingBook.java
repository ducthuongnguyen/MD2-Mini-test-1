public class ProgrammingBook extends Book {
    private String language;
    private String framework;
    static int totalPriceProgramBook;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
        totalPriceProgramBook += price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public static int countBookByLanguage(ProgrammingBook[] books, String language) {

        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getLanguage().equals(language)) {
                count++;
            }
        }
        return count;
    }
}
