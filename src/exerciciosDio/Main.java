package exerciciosDio;

public class Main {

    public static void main (String[]args){

        //calculadora
        System.out.println("Exercicios calculadora");
        calculadora.soma(5, 3);
        calculadora.subtracao(10, 4);
        calculadora.multiplicacao(5, 5);
        calculadora.divisao(20,2);

        //mensagem
        System.out.print("Exercicios Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(22);
    }
}
