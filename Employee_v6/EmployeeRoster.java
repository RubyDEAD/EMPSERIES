import java.util.ArrayList;

public class EmployeeRoster {
    
    
    private ArrayList<Employee> empList;

    public EmployeeRoster() {
        this.empList = new ArrayList<>();
    }
       
    public void Add(Employee emp){
        this.empList.add(emp);
    }
    
    public Employee delete(int id){
       
        int i;
        for(i=0;i<empList.size();i++){
           Employee ToDel = empList.get(i);
           if(ToDel.getEmpID() == id){
               empList.remove(i);
               return ToDel;
           }
        }
        return null;
    }
    
    public int countHE(){
        int count = 0;
        
        for(Employee emp : this.empList){
            if(emp instanceof HE){
                count++;
            }
        }
        return count;
    }
    
    
    public int countBPCE(){
        int count = 0;
        
        for(Employee emp : this.empList){
            if(emp instanceof BPCE){
                count++;
            }
        }
        return count;
    }
    
    
    public int countCE(){
        int count = 0;
        
        for(Employee emp : this.empList){
            if(emp instanceof CE && !(emp instanceof  BPCE) ){
                count++;
            }
        }
        return count;
    }
    
    
    
    public int countPE(){
        int count = 0;
        
        for(Employee emp : this.empList){
            if(emp instanceof PE){
                count++;
            }
        }
        return count;
    }
    
     public void displayHE(){
        System.out.println("\nHourly Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof HE){
                System.out.print("- ");
                this.empList.get(i).display();
                System.out.print("\n");
            }
        }
    }
    
    public void displayPWE(){
        System.out.println("\nPieceWorker Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof PE){
                System.out.print("- ");
                this.empList.get(i).display();
                System.out.print("\n");
            }
        }
    }    
    
    public void displayCE(){
        System.out.println("\nCommission Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof CE && !(this.empList.get(i) instanceof BPCE)){
                System.out.print("- ");
                this.empList.get(i).display();
                System.out.print("\n");
            }
        }
    }
    
     public void displayBPCE(){
        System.out.println("\nBased Plus Commission Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof BPCE){
                System.out.print("- ");
                this.empList.get(i).display();
                System.out.print("\n");
            }
        }
    }
     
    public void displayAllEmployee(){
        System.out.println("\nList of Employees in the current roster\n");
        
        System.out.println(String.format("%-5s | %-30s | %-14s | %-14s | %-12s | %-12s", "EMP ID", "Name", "Hire Date", "Date of Birth","Salary", "EMP Type"));
        for(int i = 0; i < this.empList.size(); i++){
            String res = String.format("%-6d | %-30s | %-14s | %-14s | %-12.2f | %-12s", this.empList.get(i).getEmpID(), this.empList.get(i).getEmpName(), this.empList.get(i).getDateHired(), this.empList.get(i).getbDay(), this.empList.get(i).computeSalary(), this.empList.get(i).getClass().getSimpleName());
            System.out.println(res);
        }
}
}