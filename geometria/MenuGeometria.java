import java.util.Scanner;

public class MenuGeometria {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Quadrado quadrado = new Quadrado();
        Quadrilatero quadrilatero = new Quadrilatero();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();

        int op;
        double raio, lado, lado1, lado2, altura, base;

        do {
            exibeMenu();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: //quadrilátero
                        System.out.print("Insira o lado 1: ");
                        lado1 = in.nextDouble();
                        System.out.print("Insira o lado 2: ");
                        lado2 = in.nextDouble();
                        quadrilatero = new Quadrilatero(lado1, lado2);
                        quadrilatero.calculaPerimetro();
                        System.out.println("O perimetro é: " + quadrilatero.calculaPerimetro());
                        break;
                case 2: System.out.print("Insira o lado 1: ");
                        lado1 = in.nextDouble();
                        System.out.print("Insira o lado 2: ");
                        lado2 = in.nextDouble();
                        quadrilatero = new Quadrilatero(lado1, lado2);
                        quadrilatero.calculaArea();
                        System.out.println("A área é: " + quadrilatero.calculaArea());
                        break;
                case 3: //quadrado
                        System.out.print("Insira o lado : ");
                        lado = in.nextDouble();
                        quadrado = new Quadrado(lado);
                        quadrado.calculaPerimetro();
                        System.out.println("O perimetro é: " + quadrado.calculaPerimetro());
                        break;
                case 4: System.out.print("Insira o lado : ");
                        lado = in.nextDouble();
                        quadrado = new Quadrado(lado);
                        quadrado.calculaArea();
                        System.out.println("A área é: " + quadrado.calculaArea());
                        break;
                case 5: //triângulo
                        System.out.print("Insira a base: ");
                        base = in.nextDouble();
                        System.out.print("Insira a altura: ");
                        altura = in.nextDouble();
                        triangulo = new Triangulo(base, altura);
                        triangulo.calculaPerimetro();
                        System.out.println("O perimetro é: " + triangulo.calculaPerimetro());
                        break;
                case 6: System.out.print("Insira a base: ");
                        base = in.nextDouble();
                        System.out.print("Insira a altura: ");
                        altura = in.nextDouble();
                        triangulo = new Triangulo(base, altura);
                        triangulo.calculaPerimetro();
                        System.out.println("A área é: " + triangulo.calculaArea());
                        break;
                case 7: //circulo
                        System.out.print("Insira o raio: ");
                        raio = in.nextDouble();
                        circulo = new Circulo(raio);
                        circulo.calculaPerimetro();
                        System.out.println("O perimetro é: " + circulo.calculaPerimetro());
                        break;
                case 8: System.out.print("Insira o raio: ");
                        raio = in.nextDouble();
                        circulo = new Circulo(raio);
                        circulo.calculaArea();
                        System.out.println("A área é: " + circulo.calculaArea());
                        break;
                case 0: System.out.println("Programa encerrado!");
                        break;
                default: System.out.println("Opção inválida");
            }           
        } while (op != 0);
    }
    public static void exibeMenu() {
        System.out.println("Opções:");
        System.out.println("1 - Calcular perimetro de um quadrilátero");
        System.out.println("2 - Calcular área de um quadrilátero");
        System.out.println("3 - Calcular perimetro de um quadrado");
        System.out.println("4 - Calcular área de um quadrado");
        System.out.println("5 - Calcular perimetro de um triângulo equilátero");
        System.out.println("6 - Calcular área de um triângulo equilátero");
        System.out.println("7 - Calcular perimetro de um círculo");
        System.out.println("8 - Calcular área de um círculo");
        System.out.println("0 - Sair do programa");
        System.out.print("Digite a opção desejada: ");
    }
}