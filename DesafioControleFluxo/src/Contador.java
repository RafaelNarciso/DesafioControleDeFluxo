import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import controle.ParametroInvalidosException;

public class Contador {

    public static void main(String[] args) throws Exception {

        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.printf("Informe o primeiro parâmetro : ");
            int parametroUm = sc.nextInt();

            System.out.printf("Informe o segundo parâmetro : ");
            int parametroDois = sc.nextInt();

            contar(parametroUm, parametroDois);

            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("O parametro deve ser do tipo inteiro :");
        } finally {
            System.out.println();

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroUm >= parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        for (int interacao = parametroUm; interacao <= parametroDois; interacao++) {
            System.out.printf(" [ " + interacao + " ] ");
        }

    }
}
