//Atividade 05
package src.Exercicio05;

public class Carro {
    String marca;
    String modelo;
    int ano; 
    
    void ligar(){ //método ligar
        System.out.println("O carro está ligado.");
    }
    void informacoes(){ //método informações
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

