import java.util.ArrayList;
import java.util.List;

/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: MAIOR SEUQUÊNCIA CRESCENTE
 *
 * */
public class Main {
    public static void main(String[] args) {
        int[] vetor  = {22,34,6,4,56,100,2,1,4,1,12,2000,32,55};
        List<Integer> sequenciaAtual = new ArrayList<>();
        List<Integer> maiorSequencia = new ArrayList<>();

        for (int indice = 0; indice < vetor.length - 1; indice ++){
            if (vetor[indice] < vetor[indice + 1]){
                sequenciaAtual.add(vetor[indice]);
            }else{
                sequenciaAtual.add(vetor[indice]);
                if (sequenciaAtual.size() > maiorSequencia.size()){
                    maiorSequencia = new ArrayList<>(sequenciaAtual);
                }
                sequenciaAtual.clear();
            }
        }
     sequenciaAtual.add(vetor[vetor.length - 1]);
     if (sequenciaAtual.size() > maiorSequencia.size()){
            maiorSequencia = new ArrayList<>(sequenciaAtual);
     }
     for (int numero : maiorSequencia){
                System.out.println("Maior sequência crescente-> "+numero);
     }

    }
}
