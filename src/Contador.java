import java.util.Scanner;
import Exception.ParametrosInvalidosException;

public class Contador {
    public static void main (String[] args) {
        var scar = new Scanner(System.in);
        System.out.println("----> CONTROLE DE FLUXO <----");
        int parametro1, parametro2;
        System.out.println("\n--> Digite o Primeiro Parâmetro: ");
        parametro1 = scar.nextInt();


        
        while (true) {
            System.out.println("\n--> Digite o Segundo Parâmetro maior que: (" + parametro1 + ").");
            parametro2 = scar.nextInt();

            try {
                if (parametro1 > parametro2) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro Parâmetro (" + parametro1 + ").");
                }
                break;
            } catch (ParametrosInvalidosException e) {
                System.out.println("\n:-( " + e.getMessage());
            }
        }
        System.out.println("\n------> INICIALIZADO O CONTADOR DE FLUXO <------");
        for (int corrida = parametro1; corrida <= parametro2; corrida++) {
            System.out.printf("\nImprimindo o número --> %d\n ", corrida);
        }
        System.out.println("\n-------> PROGRAMA FINALIZADO <------");
        scar.close();
    }
}
