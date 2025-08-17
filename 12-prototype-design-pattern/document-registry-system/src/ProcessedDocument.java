public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        PdfDocument pdf1 = registry.createPdfDocument();
        pdf1.setFileName("annual_report_2024.pdf");
        pdf1.setAuthor("Acme Corp");
        pdf1.setPageCount(150);
        pdf1.open();

        System.out.println();

        TextDocument text1 = registry.createTextDocument();
        text1.setFilePath("meeting_notes.txt");
        text1.setEncoding("UTF-8");
        text1.setWordCount(250);
        text1.open();

        System.out.println();

        SpreadsheetDocument spreadsheet1 = registry.createSpreadsheetDocument();
        spreadsheet1.setSpreadsheetName("sales_data_q1.xlsx");
        spreadsheet1.setRowCount(1000);
        spreadsheet1.setColumnCount(20);
        spreadsheet1.open();

        System.out.println();

        PdfDocument pdf2 = registry.createPdfDocument();
        pdf2.setFileName("summary_report.pdf");
        pdf2.setAuthor("Acme Corp");
        pdf2.setPageCount(30);
        pdf2.open();
    }
}