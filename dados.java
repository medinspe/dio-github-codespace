import java.util.Scanner;

public class dados {

    public static void main(String[] args) { 
        String nome;
        String sobrenome;

        Scanner ler = new Scanner(System.in); 

        System.out.println("Digite o seu nome: ");
        nome = ler.next();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = ler.next();

        System.out.println("Seu nome completo é " + nome + " " + sobrenome);
        
        ler.close(); 
    }
}
