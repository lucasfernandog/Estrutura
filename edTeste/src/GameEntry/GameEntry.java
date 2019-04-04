package GameEntry;

public class GameEntry {

    protected String name;  //nome de quemm obteve o score
    protected int score;    //numeração do score

    /**Construtor que cria um registro de um jogo*/

    public GameEntry(String n, int s){
        this.name = n;
        this.score = s;
    }


    /**Get para o nome**/
    public String getName(){return this.name;}

    /**Get para o score**/
    public int getScore(){return this.score;}

    /**Metodo printa as informações**/
    public String toString(){
        return "("+this.name+", "+this.score+")";
    }



}
