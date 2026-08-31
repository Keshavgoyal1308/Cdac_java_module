package Java2_Assignment;

public class InputValidatorTest {
    public static void main(String[] args) {
        InputValidator iv = new InputValidator();
        String[] input = {"1","Keshav", "0" };
        iv.processEntry(input, 0); // Successfully execulty give ouput 100
        iv.processEntry(input, 1);// Catch NumberFormatException Executed here
        iv.processEntry(input, 2);// Catch Arithemetic Exception Executed here
        iv.processEntry(null, 0);// catch  Nullpointer Exception
        iv.processEntry(new String[]{"CRASH"}, 0);// catch for General Exception

    }
}
