import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] num = {2,5,6,8,9,1,4,0,7,3};
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of integer you want to search: ");
        int k = scan.nextInt();

        int returned = Algorithms.search(num, k);
        if (returned != -1) {
            System.out.println("The number is found in Index " + returned );
        } else  {
            System.out.println("The number " + returned + " was not found in the array");
        }


        int maximumNumber = Algorithms.max(num);
        System.out.println("The maximum number is " + maximumNumber);


    }

}