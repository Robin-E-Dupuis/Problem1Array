
import java.util.Scanner;

/**
 *
 * @author Robin Dupuis
 */
public class Problem1Array {

    /**
     * Displays Enter number of names or -1 to quit
     *
     * @return number of students or -1;
     */
    public static int menu() {
        int number = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter number of names or -1 to quit: ");
            number = input.nextInt();

            if (number == 0) {
                System.out.println("numer of names cannot be 0.");
            }
            return number;

        } while (number != -1);
    }

    /**
     * Reads form user a number of names, creates the array of names and returns
     * it.
     *
     * @param numberOfNames
     * @return array of names.
     */
    public static char[][] readNames(int numberOfNames) {
        Scanner input = new Scanner(System.in);
        String name = "";
        char[][] names = new char[numberOfNames][];
        for (int i = 0; i < numberOfNames; ++i) {
            System.out.println("Enter name " + (i + 1) + " of " + numberOfNames);
            name = input.next();
            names[i] = name.toCharArray();
        }
        return names;
    }

    /**
     * Sorts the array in ascending order.
     *
     * @param ar
     */
    public static void sortNames(char[][] ar) {
        for (int i = 0; i < ar.length - 1; ++i) {
            for (int j = i + 1; j < ar.length; j++) {
                String iNames = new String(ar[i]);
                String jNames = new String(ar[j]);
                if ((iNames.compareTo(jNames)) > 0) {
                    String temp = new String(ar[i]);//temporary string put at the element of the array that is at indexd I
                    ar[i] = ar[j];//element of the array at index i is now equal to the element of the array at index j
                    ar[j] = temp.toCharArray();//element of the array at index j is now equal to the temp
                }

            }
        }
    }

    /**
     * Prints the array
     *
     * @param ar is printed
     */
    public static void print(char[][] ar) {
        for (int i = 0; i < ar.length; ++i) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        int choice = menu();
        char[][] names = null;

        while (choice != -1) {
            names = readNames(choice);
            System.out.println("-----the original array");
            print(names);
            sortNames(names);
            System.out.println("\n-----the sorted array");
            print(names);
            choice = menu();
            System.out.println("\n---------------");
        }
        System.out.println("goodbye!");
    }
}
