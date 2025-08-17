public class EJournal implements Borrowable {
    private String title;

    public EJournal(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "E-Journal";
    }

    @Override
    public String getTitle() {
        return title;
    }
}