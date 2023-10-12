package javaLearning;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDemo {

    @Test
    public void arrayDemo() {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
        int[] anArray1 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);
        //System.out.println("Array out of boundary :"+anArray[10]);


        System.out.println(Arrays.toString(anArray1));
    }


    @Test
    private void copyArray() {
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"};
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 6);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }

    @Test
    private void copyRange() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 1);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");

            HashSet<Integer> set = new HashSet<>();

        }
    }
}