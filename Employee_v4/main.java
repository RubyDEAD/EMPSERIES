public class main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster(10);
        
        roster.addEmployee(new BPCE(30000, 50000, "John", "A.", "Doe", 3001, 5, 12, 2020, 10, 15, 2023));
        roster.addEmployee(new CE(50000, "John", "A.", "Doe", 2001, 5, 12, 2020, 10, 15, 2023));
        roster.addEmployee(new HE(20.0F, 15.0D, "Reitz", "Laure", "Andriano", 123, 2, 3, 2001)); // Full details
        roster.addEmployee(new PE(500, 5.5, "John", "A.", "Doe", 1001, 7, 15, 2020, 10, 15, 2023));


        System.out.println("Displaying all employees in the roster:");
        roster.Display();
    }
}
