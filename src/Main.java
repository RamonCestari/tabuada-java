import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada deseja calcular?");
        //Entrada pelo usuário do número que será multiplicado.
        int numero = sc.nextInt();
        System.out.println("Tabuada escolhida: " + numero);
        int multiplicador = 1;    //Multiplicador da operação matemática, iniciando com o valor 1
        int resultado = 0;        //Resultado da multiplicação da variável numero pela variável multiplicador

        while (resultado < numero*10){          //Enquanto o resultado da multiplicação do número escrito pelo usuário for menor que o numero x 10, o programa se repete.
            resultado = numero * multiplicador;
            System.out.println(numero + "x" + multiplicador + ": " + resultado);
            multiplicador ++;
        }

        sc.close();
    }
}
