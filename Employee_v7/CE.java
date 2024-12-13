
public class CE extends Employee {

    private double totalSales;

    public CE() {
    }

    public CE(double totalSales, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.totalSales = totalSales;
    }

    public CE(double totalSales, int month, int date, int year) {
        super(month, date, year);
        this.totalSales = totalSales;
    }

    public CE(double totalSales, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
        this.totalSales = totalSales;
    }

    public CE(double totalSales) {
        this.totalSales = totalSales;
    }

    public CE(double totalSales, String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, lName, empID, month, date, year, month2, date2, year2);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double computeSalary() {

        double rate = (totalSales < 10000) ? 0.05 : (totalSales < 100000) ? 0.10 : (totalSales < 1000000) ? 0.20 : 0.30;
        return totalSales * rate;
    }

    @Override
    public void display() {
        System.out.println(this + super.toString() + "\nSalary: " + this.computeSalary());

    }

    @Override
    public String toString() {
        return "totalSales=" + totalSales;
    }

}
