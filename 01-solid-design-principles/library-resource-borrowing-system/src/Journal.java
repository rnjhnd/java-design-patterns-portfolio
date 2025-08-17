public class Journal implements Borrowable {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "Journal";
    }

    @Override
    public String getTitle() {
        return title;
    }
}