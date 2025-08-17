public class TestProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Dominic Santos", "22-16901-257");
        Student student2 = new Student("Lara Mendoza", "22-15678-429");
        Student student3 = new Student("Miguel Tan", "22-19988-135");
        Student student4 = new Student("Bianca Reyes", "22-18759-342");

        Borrowable book = new Book("Introduction to Java");
        Borrowable journal = new Journal("AI Research Journal");
        Borrowable audioBook = new AudioBook("Learn Java by Listening");
        Borrowable eJournal = new EJournal("Digital Journal of AI Innovations");

        student1.borrowResource(book);
        student2.borrowResource(journal);
        student3.borrowResource(audioBook);
        student4.borrowResource(eJournal);
    }
}