package br.com;


public class OrdenacaoBubble {
    
    void bubbleSort(int vetor[]) {
        int interaction; // Número de interação
        int position; // Posição atual
        int swap; // Troca de variálvel
        
        // Nesta etapa ele vai verificar o número de interações e selecionar a posição maior da vez que o vetor vai ter
        for (interaction = 0; interaction < vetor.length - 1; interaction++) {
            // Comparar o elemento da posição atual com a próxima posição 
            for (position = 0; position < vetor.length - interaction - 1; position++) {
                // Verificar se o elemento da posição atual é maior que o elemento da próxima posição
                if (vetor[position] > vetor[position + 1]) {
                    // Nesta etapa será feito a troca da variável para o vetor com a posição atual 
                    swap = vetor[position];
                    vetor[position] = vetor[position + 1];
                    vetor[position + 1] = swap;
                }
            }
            // Este processo que irá mostrar o funcionamento do vetor, com a posição final dos elementos todos ordenados
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        OrdenacaoBubble ordenacao = new OrdenacaoBubble();
        
        int vetor[] = {23, 59, 45, 32, 11, 96, 37, 64}; // Vetor desordenado
        int vetor1[] = {21, 56, 44, 79, 8, 100, 49, 83}; // Vetor1 desordenado 
        
        System.out.println("========VETOR========");
        ordenacao.bubbleSort(vetor); // Esperado para o vetor -> [11, 23, 32, 37, 45, 59, 64, 96]
        
        System.out.println("=======VETOR 1=======");
        ordenacao.bubbleSort(vetor1); // Esperado para o vetor1 -> [8, 21, 44, 49, 56, 79, 83, 100]
        
    }
}


