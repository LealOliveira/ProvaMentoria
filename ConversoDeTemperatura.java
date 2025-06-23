import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ConversoDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        // Solicita a temperatura em Celsius ao usuário
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble(); // Lê a entrada do usuário como um número decimal

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Calcula a temperatura em Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius); // Formata para 2 casas decimais
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }
}

    
