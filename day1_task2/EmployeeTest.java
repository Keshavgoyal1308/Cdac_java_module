package day1_task2;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Keshav", 50000.0, true);
        Employee e2 = new Employee(102, "Riya", 60000.0, true);
        Employee e3 = new Employee(103, "Arjun", 45000.0, false); // inactive employee

        e1.raiseSalary(10);   // 10% raise
        e2.raiseSalary(15);   // 15% raise
        e3.raiseSalary(20);   // won't apply, since e3 is inactive

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();


    }
}
