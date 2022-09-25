import java.util.Scanner;

public class Trabalho2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double aux = 0;

        do {

            System.out.println("Escolha uma das opções de formas geometricas que deseja calcular a área:");
            System.out.println("Digite 1 para: Quadrado.");
            System.out.println("Digite 2 para: Triandgulo Equilatero.");
            System.out.println("Digite 3 para: Retangulo.");
            System.out.println("Digite 4 para: Circulo.");
            System.out.println("Digite 9 para: Sair.");
            System.out.println("--------------------------------------------------------------------------");

            double x = leitura.nextInt();
            aux = x;

            if (x == 1) {
                System.out.println("Digite a largura/altura do quadrado.");
                double l = leitura.nextInt();
                System.out.println("A área do quadrado é igual a: " + l * l);

                System.out.println("-----------------------------------------------------------------------");

            } else if (x == 2) {
                System.out.println("Digite a largura e altura do triangulo equilatero.");
                double l = leitura.nextInt();
                double a = leitura.nextInt();
                System.out.println("A área do triangulo equilatero é igual a: " + (l * a) / 2);

                System.out.println("-----------------------------------------------------------------------");

            } else if (x == 3) {
                System.out.println("Digite a largura e altura do retangulo.");
                double l = leitura.nextInt();
                double a = leitura.nextInt();
                System.out.println("A área do retangulo é igual a: " + l * a);

                System.out.println("-----------------------------------------------------------------------");

            } else if (x == 4) {
                System.out.println("Digite o raio do ciculo.");
                double r = leitura.nextDouble();
                double a = r * r * 3.1415;
                System.out.print("A area do cinculo é ");
                System.out.println(String.format("%.3f", +a));

                System.out.println("-----------------------------------------------------------------------");


            } else if (x == 9){}
            else{
                System.out.println("Opção inválida! Por favor, digite uma opção correta!");

                System.out.println("-----------------------------------------------------------------------");

            }

        } while (aux != 9);

    }
}