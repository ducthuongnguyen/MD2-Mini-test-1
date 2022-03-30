import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook(001, "Blockchain for Business", 59, "Jai Singh Arun", "JavaScript", "Angular");
        programmingBooks[1] = new ProgrammingBook(002, "Clean Code: A Handbook of Agile Software Craftsmanship", 99, "Robert C. Martin", "Java", "Spring");
        programmingBooks[2] = new ProgrammingBook(003, "Introduction to Algorithms", 79, "Thomas H. Cormen", "Java", "Spark");
        programmingBooks[3] = new ProgrammingBook(004, "The Pragmatic Programmer", 100, "Andrew Hunt", "Python", "Flask");
        programmingBooks[4] = new ProgrammingBook(005, "Head First Design Patterns: A Brain-Friendly Guide", 199, "Eric Freeman", "C++", ".NET");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(111, "The Maid", 99, "Nita Prose", "Mystery");
        fictionBooks[1] = new FictionBook(112, "Olga Dies Dreaming", 89, "Xochitl Gonzalez", "Fairy-tale love story");
        fictionBooks[2] = new FictionBook(113, "To Paradise", 75, "Hanya Yanagihara", "Epidemic ");
        fictionBooks[3] = new FictionBook(114, "Violeta", 24, "Isabel Allende", "Historical fiction");
        fictionBooks[4] = new FictionBook(115, "The Magnolia Palace", 99, "Fiona Davis", "Historical fiction");

        //Tính giá tiền của 10 cuốn sách
        System.out.println("Total price of 10 books is:" + FictionBook.totalPriceOfFictionBook + ProgrammingBook.totalPriceProgramBook);

        // Đếm số sách ProgrammingBook có language là "Java"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter language of programming books to find:");
        String language = input.nextLine();
        System.out.println("There "+ ProgrammingBook.countBookByLanguage(programmingBooks,language) +" book(s) using "+ language +" language in Programing books.");
    }
}
