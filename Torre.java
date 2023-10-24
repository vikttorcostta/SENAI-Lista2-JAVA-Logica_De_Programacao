/**
 * CURSO TÉCNICO EM DESENVOLVIMENTO DE SISTEMAS
 * TURMA B88407
 * ALUNO: PAULO VICTOR COSTA DE MELO
 * ALGORITMO: TORRES DE HANOI
 *
 * */

package Torres;

public class Torre {
    int quantidadeDeDiscos;

    public Torre(int totalDiscos) {
    }

    public void TorresDeHanoi (int discos) {
        quantidadeDeDiscos = discos;
    }
    public void solucaoTorres(int discos, int inicio, int destino, int tempo) {
        if (discos == 1){
            System.out.printf("\n%d ####-> %d", inicio, destino);
            return;
        }
        solucaoTorres(discos-1, inicio,tempo, destino);
        
        System.out.printf("\n%d ####-> %d", inicio,destino);
        
        solucaoTorres(discos-1,tempo,destino,inicio);
    }
}
