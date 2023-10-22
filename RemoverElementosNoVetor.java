import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: REMOVER ELEMENTTOS NO VETOR
 *
 * */

public class Main {
    public static void main(String[] args) {
        int[] vetor = {23,342,321,221,445,221};
        int removerElemento = 321;
        int contador = 0;
        for (int indice : vetor){
            if (indice == removerElemento){
                contador++;
            }
        }
        if (contador > 0){
            int[] resultado = new int[vetor.length - contador];
            int indice = 0;

            for (int indice2 : vetor){
                if (indice2 !=removerElemento){
                    resultado[indice] = indice2;
                    indice++;
                }
            }
            vetor = resultado;
        }
        for (int indice : vetor){
            System.out.println(indice + "");
        }
        System.out.println("Elemento removido do indice[2]-> " + 321);
    }
}
