package exerciciosDio;


public class calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;

        System.out.println("a soma de " + numero1 + "mais" + numero2 + "é" + resultado);
    }
    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("a subtracao de " + numero1 + "menos" + numero2 + "é" + resultado );
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.println("a multiplicacao de " + numero1 + numero2 + "é" + resultado);

        }
    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;

        System.out.println(" a divisao do " + numero1 + numero2 + "é" + resultado);

    }
}