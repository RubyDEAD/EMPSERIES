public class main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();

        // Add employees
        roster.Add(new HE(25, 40, "John", "Doe", 101, 5, 15, 1985, 3, 10, 2020));
        roster.Add(new PE(10, 200, "Jane", "Smith", 102, 7, 12, 1992, 4, 1, 2018));
        roster.Add(new CE(50000, "Alice", "Johnson", 103, 8, 22, 1990, 6, 5, 2019));
        roster.Add(new BPCE(30000, 100000, "Bob", "Brown", 104, 10, 15, 1987, 12, 10, 2015));

        // Display all employees
        roster.displayAllEmployee();

        // Count employees by type
        System.out.println("\nNumber of Hourly Employees: " + roster.countHE());
        System.out.println("Number of Pieceworker Employees: " + roster.countPE());
        System.out.println("Number of Commission Employees: " + roster.countCE());
        System.out.println("Number of BPCE Employees: " + roster.countBPCE());

        // Display employees by type
        roster.displayHE();
        roster.displayPWE();
        roster.displayCE();
        roster.displayBPCE();

        // Delete an employee and display the roster again
        System.out.println("\nDeleting employee with ID 103...");
        roster.delete(103);
        roster.displayAllEmployee();
    }
}
