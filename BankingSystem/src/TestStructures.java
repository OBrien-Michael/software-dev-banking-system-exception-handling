import java.util.Scanner;
import java.util.ArrayList;

public class TestStructures {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        /*int[] myArray = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("\n\tPlease enter number " + (i + 1) + ":  ");
            myArray[i] = key.nextInt();
            total += myArray[i];
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println("\n\t" + myArray[i]);
        }

        System.out.println("\n\tTotal:  " + total);


        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int total = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("\n\tPlease enter number " + (i + 1) + ":  ");
            myArray.add(i, key.nextInt());
            total += myArray.get(i);
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.print("\n\t" + myArray.get(i));
        }

        System.out.println("\n\tTotal:  " + total);*/



        LinkedList myList = new LinkedList();


        System.out.println("My Linked List");
        myList.display();




    }
}
