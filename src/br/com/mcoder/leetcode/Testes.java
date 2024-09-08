package br.com.mcoder.leetcode;

import javax.swing.*;

public class Testes {
    public static void main(String[] args) {
        int array[] = new int[5];
        int cont = 0;
        int maior = 0; //nova variável para a maior sequencia achada

        //só a leitura
        for(int i=0;i<5;i++){
            //sem aux para simplificar
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Números"));
        }

        //só a contabilização
        for(int i=0;i<4;i++){ //até ao 4, um antes do fim
            if(array[i] == array[i+1]-1){ //teste de valor 1 abaixo, em vez de apenas inferior
                cont++;

                //verifica e atualiza com a maior sequência
                if (cont > maior){  //achada até ao momento
                    maior = cont;
                }
            }
            else{
                cont=0;
            }
        }

        //quando testa se o número é sequencia com o da frente o maior vai ficar com 1 mas
        //a sequência já representa dois números, logo é necessário no fim somar 1
        maior++;
        System.out.println(maior);
    }

}
