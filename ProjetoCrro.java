package src.Exercicio05;
import java.util.Scanner;
public class ProjetoCrro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro01 = new Carro(); //instanciando um objeto

        Carro carro02 = new Carro(); //instanciando um objeto

        System.out.println("===== Dados do carro 1 =====");
        //Atributos definidos por mim para o carro 1
        carro01.marca = "Fiat";
        carro01.modelo = "Cronos 1.3";
        carro01.ano = 2022;
        carro01.ligar(); //chamando o método ligar
        carro01.informacoes(); //chamando o método informações

        System.out.println("===== Dados do carro 2 =====");
        //Atributos a definir para o carro 2
        System.out.println("Digite a marca do carro: ");
        carro02.marca = sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
        carro02.modelo = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        carro02.ano = sc.nextInt();
        carro02.ligar(); //chamando o método ligar
        carro02.informacoes(); //chamando o método informações
    }
}