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

    public double computeSalary() {

        double rate = (totalSales < 10000) ? 0.05 : (totalSales < 100000) ? 0.10 : (totalSales < 1000000) ? 0.20 : 0.30;
        return totalSales * rate;
    }

    @Override
    public void display() {
        System.out.println("\n" + this + super.toString() + "\nSalary: " + this.computeSalary());

    }

    @Override
    public String toString() {
        return "totalSales=" + totalSales;
    }

    public static void main(String[] args) {
          CE ce1 = new CE(50000, "John", "A.", "Doe", 2001, 5, 12, 2020, 10, 15, 2023);
          ce1.display();
  
          CE ce2 = new CE(12000, 3, 14, 2021);
          ce2.display();
  
          CE ce3 = new CE(75000, "Jane", "B.", "Smith", 2002, 6, 10, 2022);
          ce3.display();
  
          CE ce4 = new CE(9500);
          ce4.display();
  
          CE ce5 = new CE(450000, "Alex", "Johnson", 2003, 2, 22, 2019, 12, 31, 2023);
          ce5.display();
  
          CE ce6 = new CE();
          ce6.setTotalSales(85000);
          ce6.display();
    }

}
