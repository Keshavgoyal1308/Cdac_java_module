package day1_task1;
import java.time.LocalDate;

/**  EmployeeInfo is a simple class which is used to display name, batch_name and today date
  I have made this to complete Task 1 */



public class EmployeeInfo {
    public static void main(String[] args){

    String Mname = "keshav";
    String batch_name = "PGCP_AI";
    LocalDate today = LocalDate.now();

    System.out.println(Mname);
    System.out.println(batch_name);
    System.out.println(today);

    }
}
