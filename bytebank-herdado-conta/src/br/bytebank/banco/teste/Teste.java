package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;

public class Teste {


    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123,321);
        ContaPoupanca cp = new ContaPoupanca(123,123);
        System.out.println(cc.toString());
        System.out.println(cp);



    }


}
