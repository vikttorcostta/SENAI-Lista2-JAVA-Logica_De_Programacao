/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: SOMA DE DIGITOS
 *
 * */

public class Main {
    public static void main(String[] args) {
        int numero = 231;
        int soma = 0;

        while (numero != 0){
            soma += numero % 10;
            numero /= 10;
        }
        System.out.println("soma-> "+ soma);
    }
}
