import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro1;
        livro1 = new Livro();

        Livro livro2 = new Livro();

        livro1.titulo = "O cavaleiro preso na armadura";
        livro1.anoPublicacao = 2020;
        livro1.autor = "David Singerhead";

        System.out.println("Nome do livro: " + livro1.titulo);
        System.out.println("Ano de publicação: " + livro1.anoPublicacao);
        System.out.println("Nome do autor: " + livro1.autor);
    }
}