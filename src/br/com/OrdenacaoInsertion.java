package br.com;


public class OrdenacaoInsertion {
    
    void insertionSort(int vetor[]) {
        int interaction; // Número de interação
        int position; // Posição atual
        int swap; // Troca de variálvel
        
        // Aqui ele vai selecionar a posição da vez e, vaí pegar todos os elementos que são maiores do vetor
        for (interaction = 1; interaction < vetor.length; interaction++) {
            position = vetor[interaction]; // Aqui é feito o armazenamento da posição
            
            /* 
             * Essa etapa ele vai ter dois meios para poder realizar a troca
             * seria acahr o número menor na troca da variável ou um limite antes do vetor
             */
            for (swap = interaction - 1; (swap >= 0) && vetor[swap] > position; swap--) {
                vetor[swap + 1] = vetor[swap]; // Será feito a troca das variável que são maiores que o mesmo elemento  
            }
            vetor[swap + 1] = position; // Aqui é feito a troca da variavél pela posição atual do vetor
            
            // Este processo que irá mostrar o funcionamento do vetor, com a posição final dos elementos todos ordenados
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        OrdenacaoInsertion ordenacao = new OrdenacaoInsertion();
        
        int vetor[] = {58, 67, 47, 87, 102, 98, 14, 61}; // Vetor desordenado
        int vetor1[] = {25, 88, 76, 38, 18, 55, 63, 7}; // Vetor1 desordenado
        
        System.out.println("========VETOR========");
        ordenacao.insertionSort(vetor); // Esperado para o vetor -> [14, 47, 58, 61, 67, 87, 98, 102]
        
        System.out.println("=======VETOR 1=======");
        ordenacao.insertionSort(vetor1); // Esperado para o vetor1 -> [7, 18, 25, 38, 55, 63, 76, 88]
    }
    
}