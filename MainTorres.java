/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: TORRES DE HANOI
 *
 * */
import Torres.Torre;
public class Main {
    public static void main(String[] args) {
        int comecar = 1;
        int fim = 3;
        int tempo = 2;
        int totalDiscos = 3;
        Torre torres = new Torre(totalDiscos);
        torres.solucaoTorres(totalDiscos, comecar, fim, tempo);
    }
}
