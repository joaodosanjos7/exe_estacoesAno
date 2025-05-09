import java.util.Scanner;

public class EstacoesAno {
    public static void main(String[] args) {
        // Declaração das variáveis
        int dia, mes;

        // Objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação
        System.out.println("\n\t\t\t -- Estações do Ano --\n");

        // Entrada
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();

        System.out.print("Informe o mês: ");
        mes = entrada.nextInt();

        // Processamento
        if ((mes == 1) || (mes == 2) || (mes == 3)) {
            if ((mes == 3) && (dia >= 20)) {
                System.out.println("Outono");
            } else {
                System.out.println("Verão");
            }
        } else if ((mes == 4) || (mes == 5) || (mes == 6)) {
            if ((mes == 6) && (dia >= 20)) {
                System.out.println("Inverno");
            } else {
                System.out.println("Outono");
            }
        } else if ((mes == 7) || (mes == 8) || (mes == 9)) {
            if ((mes == 9) && (dia >= 22)) {
                System.out.println("Primavera");
            } else {
                System.out.println("Inverno");
            }
        } else if ((mes == 10) || (mes == 11) || (mes == 12)) {
            if ((mes == 12) && (dia >= 21)) {
                System.out.println("Verão");
            } else {
                System.out.println("Primavera");
            }
        } else {
            System.out.println("Mês " + mes + " incorreto!");
        }

        entrada.close();
    }
}
