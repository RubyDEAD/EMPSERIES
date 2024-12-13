public class main {
    public static void main(String[] args) {
        // Create an instance of EmployeeRoster
        EmployeeRoster roster = new EmployeeRoster();

        // Add employees to the roster
        roster.Add(new HE(25, 40, "John", "Doe", 101, 5, 15, 1985, 3, 10, 2020)); // Hourly Employee
        roster.Add(new PE(10, 200, "Jane", "Smith", 102, 7, 12, 1992, 4, 1, 2018)); // PieceWorker Employee
        roster.Add(new CE(50000, "Alice", "Johnson", 103, 8, 22, 1990, 6, 5, 2019)); // Commission Employee
        roster.Add(new BPCE(30000, 100000, "Bob", "Brown", 104, 10, 15, 1987, 12, 10, 2015)); // Based Plus Commission Employee

        // Display all employees
        System.out.println("Initial Employee Roster:");
        roster.displayAllEmployee();

        // Count employees by type
        System.out.println("\nEmployee Counts by Type:");
        System.out.println("Hourly Employees: " + roster.countHE());
        System.out.println("PieceWorker Employees: " + roster.countPE());
        System.out.println("Commission Employees: " + roster.countCE());
        System.out.println("Based Plus Commission Employees: " + roster.countBPCE());

        // Display employees by type
        System.out.println("\nEmployees by Type:");
        roster.displayHE();
        roster.displayPWE();
        roster.displayCE();
        roster.displayBPCE();

        // Delete an employee
        System.out.println("\nDeleting employee with ID 103...");
        Employee deleted = roster.delete(103);
        if (deleted != null) {
            System.out.println("Deleted Employee: " + deleted.getEmpName());
        } else {
            System.out.println("Employee with ID 103 not found.");
        }

        // Display the roster after deletion
        System.out.println("\nUpdated Employee Roster:");
        roster.displayAllEmployee();
    }
}
