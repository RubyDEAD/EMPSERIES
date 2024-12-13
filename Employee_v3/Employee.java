public class Employee {

    private Name empName;
    private int empID;
    private Date bDay;
    private Date dateHired;

    public Employee(String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        this.empName = new Name(fName, mName, lName);
        this.empID = empID;
        this.bDay = new Date(month, date, year);
        this.dateHired = new Date(month2, date2, year2);
    }

    public Employee(int month, int date, int year) {
        this.bDay = new Date(month, date, year);
        this.dateHired = new Date(10, 2, 2024);
    }

    public Employee(String fName, String mName, String lName, int empID, int month, int date, int year) {
        this.empName = new Name(fName, mName, lName);
        this.empID = empID;
        this.bDay = new Date();
        this.dateHired = new Date(month, date, year);
    }

    public Employee(String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        this.empName = new Name(fName, lName);
        this.empID = empID;
        this.bDay = new Date(month, date, year);
        this.dateHired = new Date(month2, date2, year2);
    }

    public Employee() {
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int EmpID) {
        this.empID = EmpID;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void display() {
        System.out.println(this.toString());
        empName.display();
        bDay.display();
        dateHired.display();

    }

    @Override
    public String toString() {
        return "\nempName=" + empName + " \nempID=" + empID + ", \nbDay=" + bDay + ", \ndateHired=" + dateHired;
    }

    public static void main(String[] args) {
    
        Employee emp1 = new Employee("John", "A.", "Doe", 101, 5, 15, 1985, 3, 10, 2020);
        emp1.display();

        Employee emp3 = new Employee("Jane", "B.", "Smith", 102, 7, 12, 1992);
        emp3.display();

      
    }
}
