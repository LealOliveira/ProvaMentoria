
   import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        double[] notasAnuais = new double[8]; // Array para armazenar as 8 notas anuais

        System.out.println("Olá, aluno! Por favor, insira suas 8 notas anuais:");

        // Loop para receber as 8 notas do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notasAnuais[i] = scanner.nextDouble(); // Lê a nota e armazena no array
        }

        // Calcula as médias bimestrais
        double mediaBimestre1 = (notasAnuais[0] + notasAnuais[1]) / 2;
        double mediaBimestre2 = (notasAnuais[2] + notasAnuais[3]) / 2;
        double mediaBimestre3 = (notasAnuais[4] + notasAnuais[5]) / 2;
        double mediaBimestre4 = (notasAnuais[6] + notasAnuais[7]) / 2;

        // Calcula as médias semestrais
        double mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2;

        // Calcula a média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // --- Apresenta os resultados de forma clara ---
        System.out.println("\n--- Boletim Escolar ---");

        System.out.printf("1° Bimestre: %.1f%n", mediaBimestre1); // %.1f formata para uma casa decimal
        System.out.printf("2° Bimestre: %.1f%n", mediaBimestre2);
        System.out.printf("1° Semestre: %.1f%n", mediaSemestre1);

        System.out.println("\n---"); // Separador para melhor visualização

        System.out.printf("3° Bimestre: %.1f%n", mediaBimestre3);
        System.out.printf("4° Bimestre: %.1f%n", mediaBimestre4);
        System.out.printf("2° Semestre: %.1f%n", mediaSemestre2);

        System.out.println("\n---"); // Separador

        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }
}
 
    
    
    
