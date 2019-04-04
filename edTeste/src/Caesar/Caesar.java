package Caesar;

public class Caesar {
    public static final int ALPHASIZE = 26; //Alfabeto em inglês (somente letras maiúsculas)
    public static final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    protected char[] encrypt = new char[ALPHASIZE]; //Arranjo de criptografar
    protected char[] decrypt = new char[ALPHASIZE]; //Arranjo de descriptografar

    /**
     * Construtor que inicializa os arranjos de criptografar e descriptografar
     */

    public Caesar() {
        for (int i = 0; i < ALPHASIZE; i++)
            encrypt[i] = alpha[(i + 3) % ALPHASIZE]; //Gira o alfabeto 3 posições
        for (int i = 0; i < ALPHASIZE; i++)
            decrypt[encrypt[i] - 'A'] = alpha[i]; //descriptografar é o contrário de criptografia
    }

    /**
     * Método de criptografia
     */

    public String encrypt(String secret) {
        char[] mess = secret.toCharArray(); //o arranjo com a mensagem
        for (int i = 0; i < mess.length; i++)  //Laço de criptografia
            if (Character.isUpperCase(mess[i])) //Trem-se uma letra para troca
                mess[i] = encrypt[mess[i] - 'A']; //Usa a letra como índice
        return new String(mess);
    }

    /**
     * Método de descriptografar
     */

    public String decrypt(String secret) {
        char[] mess = secret.toCharArray();
        for (int i = 0; i < mess.length; i++)
            if (Character.isUpperCase(mess[i]))
                mess[i] = decrypt[mess[i] - 'A'];
        return new String(mess);
    }


}
