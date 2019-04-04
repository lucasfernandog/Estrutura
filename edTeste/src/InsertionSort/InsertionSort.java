package InsertionSort;

public class InsertionSort {

    public static char[] insertionSort(char[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {      //indice do segundo caracter em a
            char cur = a[i];            //O caracter corrente a ser inserido
            int j = i - 1;              //Inica comparando a célular a esquerda de i
            while ((j >= 0) && (a[j] > cur)) {//enquantoa[j] esta fora de ordem em relação a cur
                a[j + 1] = a[j--];      //move a[j] para a direita e decrementa j

            }
            a[j + 1] = cur;             //este e o local correto de cur
        }
        return a;
    }


    public static void main(String[] args) {
        char[] vet = new char[7];
        char[] vet_2;

        vet[0] = 'B';
        vet[1] = 'F';
        vet[2] = 'A';
        vet[3] = 'J';
        vet[4] = 'T';
        vet[5] = 'L';
        vet[6] = 'M';


        vet_2 = insertionSort(vet);


        for (char c : vet_2) {

            System.out.println("ordenação: " + c);
        }

    }


}