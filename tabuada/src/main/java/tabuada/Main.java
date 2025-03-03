package tabuada;
import java.util.Scanner;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        // Cria a variável número e pede para o usuário escolher o número a ser feita a tabuada, declarando a resposta na variável
        double numero;
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite o número: ");
        numero = pergunta.nextDouble();
        // Fecha o scanner que foi usado para perguntar o número au usuário
        pergunta.close();

        // Realiza a tabuada e imprime na tela resultado por resultado
        for (int i = 1; i <= 10; i++) {
            double resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
    }
}