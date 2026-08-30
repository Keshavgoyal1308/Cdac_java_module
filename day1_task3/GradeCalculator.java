package day1_task3;

//Goal: use wrapper classes, arithmetic/relational/logical operators, and if-else together.
//Extend your Employee example or write a fresh GradeCalculator class that:
//        1.	Declares an Integer[] array of 5 marks (values of your choice, 0-100).
//        2.	Computes the total and average using a loop, storing the average as a Double.
//3.	Uses if / else if / else with relational and logical operators to assign a grade: A for average >= 85, B for 70-84, C for 50-69, F for below 50. (Hint: combine >= and && where needed.)
//        4.	Uses the ternary operator (? :) at least once, e.g. to decide a String result of "Pass" or "Fail" based on average >= 40.
//        5.	Prints total, average, grade, and pass/fail result.
//Checkpoint: run your program with at least two different sets of marks (edit the array and re-run) to confirm all four grade branches are reachable.



public class GradeCalculator {
    public static void main(String[] args) {
        Integer[] marks = {56, 45, 89, 90, 67};

        Double average;
        int total =0;
        String Grade;

        for(int i =0; i< marks.length; i++){
              total += marks[i];

        }

        average =  (double) total / marks.length;

        if(average >= 85){
            Grade = "A";
        }else if(average >= 70 && average <85){
            Grade = "B";
        }else if(average >= 50 && average<70){
            Grade = "C";
        }else {
            Grade = "F";
        }

        System.out.println("Total marks is: " + total);
        System.out.println("average marks is: " + average);
        System.out.println("Grade is: " + Grade);
        System.out.println((average < 40) ? "Fail" : "Pass");
        System.out.println("End");

    }

}
