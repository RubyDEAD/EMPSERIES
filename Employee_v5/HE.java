public class HE extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;

    public HE() {
    }

    public HE(float totalHoursWorked, double ratePerHour, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HE(float totalHoursWorked, double ratePerHour, int month, int date, int year) {
        super(month, date, year);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HE(float totalHoursWorked, double ratePerHour, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HE(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HE(float totalHoursWorked, double ratePerHour, String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, lName, empID, month, date, year, month2, date2, year2);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {

        double salary = (totalHoursWorked > 40) ? this.ratePerHour * 40 + (this.ratePerHour * 1.50)
                : totalHoursWorked * ratePerHour;

        return salary;
    }

    ;
    
    /**
     *
     */
    @Override
    public void display() {
//        System.out.println(empName);
//        System.out.println(empID);
//        System.out.println(bDay);
//        System.out.println(dateHired);
//        System.out.println(this + "\n" + "Salary : " + this.computeSalary());
        System.out.println(this + super.toString() + "\nSalary: " + this.computeSalary());

    }

    @Override
    public String toString() {
        return "\ntotalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour;
    }

    public static void main(String[] args) {
        HE emp1 = new HE();
        emp1.display();
        HE emp2 = new HE(100, 15);
        emp2.display();
        HE emp3 = new HE(15, 1200, 4, 5, 1999);
        emp3.display();
        HE emp4 = new HE(20, 15, "Reitz", "Laure", "Andriano", 123, 2, 3, 2001);
        emp4.display();
        HE emp5 = new HE(5, 1000, "John", "Loloy", 123123, 3, 5, 2004, 23, 8, 2004);
        emp5.display();
        HE emp6 = new HE(19, 1500, "Ambot", "Wala", "Alam", 4234, 1, 14, 1999, 1, 4, 1990);
        emp6.display();
    }
}