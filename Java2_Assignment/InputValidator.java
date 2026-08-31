package Java2_Assignment;

public class InputValidator {
    void processEntry(String[] data, int index){
        try{
            String s = data[index];
            if ("CRASH".equals(s)) { // Written this to just check for generic Exception
                throw new RuntimeException("Simulated unexpected failure");
            }

             int n = Integer.parseInt(s);
             int result =  100/n;
             System.out.println(result);


        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Your are Trying to access out of Index value from Array " + e.getMessage());

        }catch(ArithmeticException e){

            System.out.println("Your are trying to do Invalid Arithemetic Operation " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Invalid Number Format Conversion "+ e.getMessage());

        } catch (NullPointerException | NegativeArraySizeException e) {
            System.out.println("Error: input array was null or invalid ("
                    + e.getClass().getSimpleName() + ").");


        }catch (Exception e) {
            System.out.println("Error Occured during execution");
        }
    }
}
