

public class EmployeeRoster {
    
    private Employee[] emplist;
    private int count;
    private int max;

    public EmployeeRoster(int max) {
        this.emplist = new Employee[max];
        this.count = 0;
        this.max = max;
    }
    
    public Employee[] getEmplist() {
        return emplist;
    }

    public void setEmplist(Employee[] emplist) {
        this.emplist = emplist;
    }

    public int getCount() {
        return count;
    }

  

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    public boolean addEmployee(Employee emp){
        
        if(count < max){
        emplist[count] = emp;
        count++;
            return true;
        }else{
            return false;
        }
       
    }
    
     public Employee removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (emplist[i].getEmpID() == id) {
                Employee removedEmployee = emplist[i];

                // Shift elements left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    emplist[j] = emplist[j + 1];
                }
                emplist[count - 1] = null; // Clear the last element
                count--; // Decrease the count
                return removedEmployee;
            }
        }
        return null; // Return null if not found
    }
    
    public int countHE(){
        int HeCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof HE){
                HeCount++;
            }
        }
        
        return HeCount;
    }
    
     public int countPE(){
        int PeCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof PE){
                PeCount++;
            }
        }
        
        return PeCount;
    }
     
     
      public int countCE(){
        int CeCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof CE && !(emplist[i] instanceof BPCE)){
                CeCount++;
            }
        }
        
        return CeCount;
    }
      
      
      
      
      
       public int countBPCE(){
        int BpceCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof BPCE){
                BpceCount++;
            }
        }
        
        return BpceCount;
    }

    
    public void Display() {
        System.out.println("=============================================================");
        System.out.println("                 EMPLOYEE ROSTER REPORT                      ");
        System.out.println("=============================================================");
        System.out.printf("%-5s | %-15s | %-15s | %-12s | %-10s | %-15s\n",
                "ID", "Full Name", "Type", "Salary", "Join Date", "Birth Date");
        System.out.println("----------------------------------------------------------------------------");
    
        for (int i = 0; i < count; i++) {
            Employee emp = emplist[i];
    
            // Determine the type of employee and calculate their salary
            String empType;
            double salary = 0;
    
            if (emp instanceof HE) {
                empType = "Hourly";
                salary = ((HE) emp).computeSalary();
            } else if (emp instanceof PE) {
                empType = "Piecework";
                salary = ((PE) emp).computeSalary();
            } else if (emp instanceof BPCE) {
                empType = "Base+Piece";
                salary = ((BPCE) emp).computeSalary();
            } else if (emp instanceof CE) {
                empType = "Commission";
                salary = ((CE) emp).computeSalary();
            } else {
                empType = "Unknown";
            }
    
            // Display the employee details in a formatted manner
            System.out.printf("%-5d | %-15s | %-15s | $%-10.2f | %02d/%02d/%d | %02d/%02d/%d\n",
                    emp.getEmpID(),
                    emp.getEmpName().toString(),
                    empType,
                    salary,
                    emp.getDateHired().getMonth(), emp.getDateHired().getDay(), emp.getDateHired().getYear(),
                    emp.getbDay().getMonth(), emp.getbDay().getDay(), emp.getbDay().getYear()
            );
        }
    
        System.out.println("=============================================================");
        System.out.println("Total Employees: " + count);
        System.out.println("Hourly Employees: " + countHE());
        System.out.println("Piecework Employees: " + countPE());
        System.out.println("Commission Employees: " + countCE());
        System.out.println("Base + Piecework Employees: " + countBPCE());
    }
    
    
    
    
    
    
}