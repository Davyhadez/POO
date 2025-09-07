//Exercício ultilizando o ProjetoLivraria
//Classe da atividade 2
public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro obj1;
        obj1 = new Livro();

        Livro obj2;
        obj2 = new Livro();

        obj1.titulo = "harry Potter";
        obj1.numeroPaginas = 304;
        obj1.anoPublicacao = 1997;
        obj1.preco = 25.90;
        System.out.println("Livro alugado: " + obj1.titulo);
        System.out.println("Número de páginas: " + obj1.numeroPaginas);
        System.out.println("Ano da publicação: " + obj1.anoPublicacao);
        System.out.println("Preço do aluguel R$" + obj1.preco);

        System.out.println("////////////////////////////////");

        obj2.titulo = "Entendendo Algoritmos ";
        obj2.numeroPaginas = 267;
        obj2.anoPublicacao = 2020;
        obj2.preco = 64.99;
        System.out.println("Livro alugado: " + obj2.titulo);
        System.out.println("Número de páginas: " + obj2.numeroPaginas);
        System.out.println("Ano da publicação: " + obj2.anoPublicacao);
        System.out.println("Preço do aluguel R$" + obj2.preco);
    }
}

