package Java2_Assignment;

public class DividerTest {
    public static void main(String[] args) {

        SafeDivider sb = new SafeDivider();
        int result ;
        try {
            System.out.println(sb.divide(10, 0));
        }catch (ArithmeticException e){
            System.out.println("Your are dividing By zero");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
        }
        System.out.println(sb.divide(10, 2));
        System.out.println(sb.divide(9, 8));
        System.out.println(sb.divide(9, 0));
    }
}
