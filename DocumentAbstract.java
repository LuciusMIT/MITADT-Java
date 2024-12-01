abstract class Document {
    String title;
    String author;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void printContent();
}

class Book extends Document {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    void printContent() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: This is a fictional or non-fictional book that contains chapters and pages.");
    }
}

class Article extends Document {
    public Article(String title, String author) {
        super(title, author);
    }

    @Override
    void printContent() {
        System.out.println("Article Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: This is an article, typically published in a magazine or journal.");
    }
}

class Report extends Document {
    public Report(String title, String author) {
        super(title, author);
    }

    @Override
    void printContent() {
        System.out.println("Report Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: This is a report, usually with detailed findings and data.");
    }
}

class Main {
    public static void main(String[] args) {
        Document book = new Book("The Great Adventure", "John Doe");
        Document article = new Article("Modern Java Programming", "Jane Smith");
        Document report = new Report("Annual Sales Analysis", "Michael Brown");

        book.printContent();
        System.out.println();
        article.printContent();
        System.out.println();
        report.printContent();
    }
}
