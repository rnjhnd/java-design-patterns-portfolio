public class Student {
    private String name;
    private String studentNo;

    public Student(String name, String studentNo) {
        this.name = name;
        this.studentNo = studentNo;
    }

    public void borrowResource(Borrowable borrow) {
        System.out.println("================= Borrowing Transaction =================");
        System.out.println("Student Name : " + name);
        System.out.println("Student No.  : " + studentNo);
        System.out.println("Resource     : " + borrow.getResourceType() + " - (" + borrow.getTitle() + ")");
        System.out.println("=========================================================\n");

    }
}