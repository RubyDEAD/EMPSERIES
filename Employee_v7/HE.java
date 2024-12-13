
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

    @Override
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
        return "totalHoursWorked=" + totalHoursWorked + ", \nratePerHour=" + ratePerHour;
    }

}
