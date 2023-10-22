/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: MEDIA PONDERADA
 *
 * */
public class Main {

    public static void main(String[] args) {

        double [] notas = {1.3, 5.0, 8.4, 5.5, 10.0};
        double [] peso = {3, 4 , 6, 3, 5};
        double somaPesos = 0;
        double somaNotas = 0;
        double mediaPonderada;


        for (int indice = 0; indice < notas.length; indice ++){
            somaNotas += notas[indice] * peso[indice];
            somaPesos += peso[indice];
        }
        if (somaPesos == 0){
            System.out.println("Não dá para obter a media ponderada sem o peso");
        }else {
            mediaPonderada = somaNotas / somaPesos;
            System.out.println("Media ponderada->" + mediaPonderada);
        }
    }
}
