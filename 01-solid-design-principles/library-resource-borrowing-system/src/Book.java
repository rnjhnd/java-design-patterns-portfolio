public class Book implements Borrowable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "Book";
    }

    @Override
    public String getTitle() {
        return title;
    }
}