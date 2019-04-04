package ArrayTest;

import java.util.Arrays;
import java.util.Random;

/**
 * Programa que apresenta alguns usos para arranjos
 */

public class ArrayTest {

    public static void main(String[] args) {
        int num[] = new int[10];

        Random rand = new Random(); //um gerador de números pseudoaleatórios
        rand.setSeed(System.currentTimeMillis()); //Usa o tempo corrente como semente
        // preenche o arranjo com números pseudoaleatórios entre 0 e 99, inclusive.

        for (int i = 0; i < num.length; i++)
            num[i] = rand.nextInt(100); // o próximo número pseudoleatório
        int[] old = (int[]) num.clone(); //clona o arranjo num
        System.out.println("arrays equal before sort: " + Arrays.equals(old, num));
        Arrays.sort(num); // ordena o arranjo num (old não é modificado)
        System.out.println("arrays equal after sort: " + Arrays.equals(old, num));
        System.out.println("Old = " + Arrays.toString(old));
        System.out.println("num  = " + Arrays.toString(num));

    }

}
