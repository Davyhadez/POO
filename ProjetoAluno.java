    import java.util.Scanner;
    public class ProjetoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Opção 1, instânciando o objeto
        Aluno aluno1;
        aluno1 = new Aluno();

        //Opção 2, instânciando o objeto direto
        Aluno aluno2 = new Aluno();

        aluno1.nome = "David Lago";
        aluno1.matricula =4142426;
        aluno1.notaAv1 = 8.5;
        aluno1.notaAv2 = 7.0; 

        aluno2.nome = "Ana Clara";
        aluno2.matricula = 4123456;
        aluno2.notaAv1 = 4.0;
        aluno2.notaAv2 = 4.5;

        System.out.println("Dados do aluno: ");
        System.out.println("Nome do aluno: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Nota da AV1: " + aluno1.notaAv1);
        System.out.println("Nota da AV2: " + aluno1.notaAv2);

        System.out.println("Calculando a média do aluno...");
        double media = (aluno1.notaAv1 + aluno1.notaAv2) / 2;   
        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("O aluno " + aluno1.nome + " está aprovado!");
        } else {
            System.out.println("O aluno " + aluno1.nome + " está reprovado!");
        }

        System.out.println("Dados do aluno: ");
        System.out.println("Nome do aluno: " + aluno2.nome);
        System.out.println("Matrícula: " + aluno2.matricula);
        System.out.println("Nota da AV1: " + aluno2.notaAv1);
        System.out.println("Nota da AV2: " + aluno2.notaAv2);

        System.out.println("Calculando a média do aluno...");
        double media2 = (aluno2.notaAv1 + aluno2.notaAv2) / 2;   
        System.out.println("Média final: " + media2);

        if (media2 >= 7) {
            System.out.println("O aluno " + aluno2.nome + " está aprovado!");
        } else {
            System.out.println("O aluno " + aluno2.nome + " está reprovado!");
        }
    }              
}
