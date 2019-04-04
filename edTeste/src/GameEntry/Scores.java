package GameEntry;

public class Scores {
    public static final int maxEntries = 10;
    protected int numEntries;
    protected GameEntry[] entries;

    /** Construtor default **/

    public Scores(){
        entries = new GameEntry[maxEntries];
        numEntries = 0;
    }

    /** Printa na tela a representação da lista de scores*/
    public String toString(){
        String s = "[";
        for(int i=0; i< numEntries; i++){

            if(i>0) s = ", ";  //Separando por virgulas
            s += entries[i];
        }
        return s + "]";
    }

    public void add(GameEntry e ){
        int newScore = e.getScore();
        //o novo registro "e" corresponde mesmo a um dos maiores escores?
        if(numEntries == maxEntries){ //o arranjo está cheio
            if(newScore <= entries[numEntries-1].getScore()){
                return; //nesse caso, a nova entrada, "e", não é um dos maiores escores
            }
        }
        else //o arranjo não está cheio
            numEntries ++;

        //localiza o lugar onde o novo registro "e" (como escore grande) deve ficar
        int i = numEntries -1;
        for(;(i>=1) && (newScore > entries[i-1].getScore()); i--)
            entries[i] = entries[i-1];
        entries[i] =e;

    }


    public GameEntry remove (int i ) throws IndexOutOfBoundsException{
        if((i<0) || (i >= numEntries))
            throw new IndexOutOfBoundsException("Invalid index: "+i);
        GameEntry temp = entries[i]; //armazena temporariamente o objeto a ser removido

        for(int j = i; j< numEntries - 1; j++) // conta a partir de i
            entries[j] = entries[j+1]; //move uma célula para a esquerda
        entries[numEntries - 1] = null; // anula o último score
        numEntries--;
        return temp; //retorna o objeto removido

    }



}
