package day1_task2;

public class Employee {
    int empId;
    String name;
    double basicSalary;
    boolean isActive;

    Employee(int id, String emp_name, double bsalary, boolean status){
         empId = id;
        name = emp_name;
        basicSalary = bsalary;
        isActive = status;
    }

    public int getEmpId (){
        return empId;
    }

    public String getName (){
        return name;
    }

    public double getSalary (){
        return basicSalary;
    }

    public boolean  isActive (){
        return isActive;
    }



    public void raiseSalary(double percent){
        if( isActive) {
            basicSalary += (basicSalary * percent) / 100;
        };

    }

     public void displayDetails(){
         System.out.println(empId);
         System.out.println("\n");
         System.out.println(name);
         System.out.println("\n");
         System.out.println(basicSalary);
         System.out.println("\n");
         System.out.println(isActive);
         System.out.println("\n");

     }


}
