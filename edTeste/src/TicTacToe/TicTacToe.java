package TicTacToe;

/**
 * Simulação do jogo da velha (não tem estratégia
 */

public class TicTacToe {

    protected static final int X = 1, O = -1; //Jogadores
    protected static final int EMPTY = 0;     // célula vazia
    protected int board[][] = new int[3][3];  // tabuleiro tabuleiro
    protected int player;                     // jogador corrente 

    /**
     * Construtor
     */

    public TicTacToe() {
        clearBoard();
    }

    /**
     * Limpa o tabuleiro
     */

    public void clearBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;    //Toda célula deve estar vazia
        player = X;                 //o primeiro jogador é 'X'
    }

    /**
     * Coloca um X ou O na posição i,j
     */

    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player; // insere a marca do jogador corrente
        player = -player;   // troca os jogadores (usa o fato de que O = - X)

    }

    /**
     * Verifica se a configuração do tabuleiro é vencedora para algum jogador
     */

    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2] == mark * 3) // linha 0
                || (board[1][0] + board[1][1] + board[1][2] == mark * 3) //linha 1
                || (board[2][0] + board[2][1] + board[2][2] == mark * 3) // linha 2
                || (board[0][0] + board[1][0] + board[2][0] == mark * 3) //coluna 0
                || (board[0][1] + board[1][1] + board[2][1] == mark * 3) //coluna 1
                || (board[0][2] + board[1][2] + board[2][2] == mark * 3) //coluna 2
                || (board[0][0] + board[1][1] + board[2][2] == mark * 3) //coluna 2
                || (board[2][0] + board[1][1] + board[0][2] == mark * 3)); //diagonal

    }

    /**
     * Retorna o jogador vencedor ou indica empate
     */

    public int winner() {
        if (isWin(X))
            return (X);
        else if (isWin(O))
            return (O);
        else
            return (0);
    }

    /**
     * Retorna uma string de caracteres que representa o tabuleiro corrente
     */
    public String toString() {
        String s = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X:
                        s += "X";
                        break;
                    case O:
                        s += "O";
                        break;
                    case EMPTY:
                        s += " ";
                        break;
                }
                if (j < 2) s += "|"; //limite de coluna
            }
            if (i < 2) s += "\n -----"; //limite da linha
        }
        return s;
    }

    /* Testa a execução de um jogo simples

     */
}
