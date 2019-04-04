package Caesar;

public class Main {

    public static void main(String[] args) {
        Caesar cipher = new Caesar(); //Cria um objeto com a Crifra de César
        System.out.println("Encryption order = " + new String(cipher.encrypt));
        System.out.println("Decryption order = " + new String(cipher.decrypt));
        String secret = "ENGENHARIA DE SOFTWARe";
        secret = cipher.encrypt(secret);
        System.out.println(secret);  //O texto cifrado
        secret = cipher.decrypt(secret);
        System.out.println(secret); //deve ser texto limpo novamente
    }
}
