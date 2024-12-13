

public class PE extends Employee {

    private int piecesFinished;
    private double ratePerPiece;

    public PE(int piecesFinished, double ratePerPiece, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PE(int piecesFinished, double ratePerPiece, int month, int date, int year) {
        super(month, date, year);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PE(int piecesFinished, double ratePerPiece, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PE(int piecesFinished, double ratePerPiece) {
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PE(int piecesFinished, double ratePerPiece, String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, lName, empID, month, date, year, month2, date2, year2);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PE() {
    }

    public PE(String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
    }

    public int getPiecesFinished() {
        return piecesFinished;
    }

    public void setPiecesFinished(int piecesFinished) {
        this.piecesFinished = piecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {

        int bonus = piecesFinished / 100;
        double salary = ((piecesFinished + bonus) * ratePerPiece) + (bonus * (10 * ratePerPiece));

        return salary;
    }

   
    @Override
    public void display() {

        System.out.println(this + super.toString() + "\n" + "Salary : " + this.computeSalary());
    }

    ;

    @Override
    public String toString() {
        return "\npiecesFinished=" + piecesFinished + ", ratePerPiece=" + ratePerPiece;
    }


    public static void main(String[] args) {
           PE pe1 = new PE(500, 5.5, "John", "A.", "Doe", 1001, 7, 15, 2020, 10, 15, 2023);
           pe1.display();
   
           PE pe2 = new PE(400, 4.5, 3, 5, 2021);
           pe2.display();
   
           PE pe3 = new PE(350, 4.0, "Jane", "B.", "Smith", 1002, 6, 10, 2022);
           pe3.display();
   
           PE pe4 = new PE(600, 6.0);
           pe4.display();
   
           PE pe5 = new PE(450, 5.0, "Alex", "Johnson", 1003, 5, 25, 2020, 12, 31, 2023);
           pe5.display();
   
           PE pe6 = new PE();
           pe6.setPiecesFinished(300);
           pe6.setRatePerPiece(3.5);
           pe6.display();
   
           PE pe7 = new PE("Emily", "C.", "Williams", 1004, 2, 20, 2021);
           pe7.setPiecesFinished(500);
           pe7.setRatePerPiece(4.5);
           pe7.display();
       }
    }
