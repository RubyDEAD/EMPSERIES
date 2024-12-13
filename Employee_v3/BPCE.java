public class BPCE extends CE {

    private double baseSalary;


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
        return "\nbaseSalary=" + baseSalary;
    }


    public static void main(String[] args) {
        BPCE bpce1 = new BPCE(30000, 50000, "John", "A.", "Doe", 3001, 5, 12, 2020, 10, 15, 2023);
        bpce1.display();

        BPCE bpce2 = new BPCE(35000, 12000, "Jane", "Doe", 3002, 6, 14, 2019, 8, 20, 2022);
        bpce2.display();

        BPCE bpce3 = new BPCE(40000, 80000, 3, 14, 2021);
        bpce3.display();

        BPCE bpce4 = new BPCE(45000, 95000, "Mike", "B.", "Smith", 3003, 4, 10, 2022);
        bpce4.display();

        BPCE bpce5 = new BPCE(25000, 450000);
        bpce5.display();

        BPCE bpce6 = new BPCE();
        bpce6.display();
    }
}
