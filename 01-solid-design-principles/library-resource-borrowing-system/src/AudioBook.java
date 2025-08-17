public class AudioBook implements Borrowable {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "Audio Book";
    }

    @Override
    public String getTitle() {
        return title;
    }
}