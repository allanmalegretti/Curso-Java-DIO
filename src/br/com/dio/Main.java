package br.com.dio;

/**
 * Classe principal dos exerc�cios da Aula 1 de M�todos.
 */
public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exerc�cio da calculadora:");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        System.out.println();

        // Mensagem
        System.out.println("Exerc�cio da mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        System.out.println();

        // Empr�stimo
        System.out.println("Exerc�cio do empr�stimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        System.out.println();
        
        // Quadril�tero
        System.out.println("Exerc�cio do quadril�tero:");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

    }
}