public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    @Override
    public PdfDocument clone() {
        try {
            return (PdfDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for PdfDocument", e);
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}