/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: COMBINAÇÃO DE VETORES
 *
 * */

public class Main {
    public static void main(String[] args) {
        int[]primeiroVetor = {221,43,62,21,4,345,21};
        int[]segundoVetor = {3,93,4,3,2,5,23};
        int[]terceiroVetor = new int[primeiroVetor.length];

        for (int indice = 0; indice < primeiroVetor.length; indice++){
            terceiroVetor[indice] = primeiroVetor[indice] + segundoVetor[indice];
        }
        for (int resultadoIndice : terceiroVetor){
            System.out.println("Soma dos vetores->" + resultadoIndice);
        }
    }
}
