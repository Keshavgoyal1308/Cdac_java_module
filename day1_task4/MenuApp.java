package day1_task4;

public class MenuApp {

    public static void main(String[] args) {
        int choice = 3;

        switch (choice) {
            case 1:
                int num = 5;
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
                break;

            case 2:
                int j = 1;
                while (j <= 50) {
                    if (j % 2 == 0) {
                        System.out.println(j);
                    }

                    j++;
                }
                break;

            case 3:
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                    if (sum > 500) {
                        System.out.println("Sum is " + sum);
                        System.out.println("Number at which it stopped is " + i);
                        break;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}