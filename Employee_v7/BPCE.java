
public class BPCE extends CE {

    private double baseSalary;

//    private String empName;
//    private int empID;
    public BPCE() {

    }

    public BPCE(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BPCE(double baseSalary, double totalSales, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(totalSales, fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.baseSalary = baseSalary;
    }

    public BPCE(double baseSalary, double totalSales, String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(totalSales, fName, lName, empID, month, date, year, month2, date2, year2);
        this.baseSalary = baseSalary;
    }

    public BPCE(double baseSalary, double totalSales, int month, int date, int year) {
        super(totalSales, month, date, year);
        this.baseSalary = baseSalary;
    }

    public BPCE(double baseSalary, double totalSales, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(totalSales, fName, mName, lName, empID, month, date, year);
        this.baseSalary = baseSalary;
    }

    public BPCE(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;

    }

    @Override
    public void display() {
        System.out.println(super.toString());
        super.display();

    }

    @Override
    public String toString() {
        return "baseSalary=" + baseSalary;
    }

}