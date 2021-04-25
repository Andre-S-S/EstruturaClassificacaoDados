package br.com;


public class OrdenacaoSelection {
    
    void selectionSort(int vetor[]) {
        int interaction; // Número de interação
        int position; // Posição atual
        int swap; // Troca de variálvel
        int startPosition; // Posição inicial
        int endPosition; // Posiçao final
        
        // Aqui vai verificar o número de interações e selecionar a posição maior da vez que o vetor vai ter
        for (interaction = 0; interaction <  vetor.length - 1; interaction++) {
            startPosition = interaction; // Aqui o valor da posição inicial recebe o número de interação  
            endPosition = interaction + 1; // Neste o valor da posição final adiciona o um no número de interação  
         
            // Acha posicao do menor que o elemento a partir da posição inicial
            for (position = startPosition + 1; position < vetor.length; position++) {
                // Nesta condição e para saber se o número do vetor final é maior que posição atual, assim ele faz a troca entre eles 
                if (vetor[position] < vetor[endPosition]) {
                    endPosition = position;
                }
            }
            /* 
             * Essa condição serve para ver se a posição inicial é maior que posição final, 
             * assim fazendo a troca da variável pela posição final do vetor
             */
            if (vetor[endPosition] < vetor[startPosition]) {
                // Nesta etapa será feito a troca da variável para o vetor com a posição final
                swap = vetor[startPosition];
                vetor[startPosition] = vetor[endPosition];
                vetor[endPosition] = swap;
            }
            // Este processo que irá mostrar o funcionamento do vetor, com a posição final dos elementos todos ordenados
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println(" ");
        }    
    }
    
    public static void main(String[] args) {
        OrdenacaoSelection ordenacao = new OrdenacaoSelection();
        
        int vetor[] = {32, 54, 43, 35, 10, 97, 81, 72}; // Vetor desordenado
        int vetor1[] = {52, 17, 65, 5, 22, 80, 99, 33}; // Vetor1 desordenado
        
        System.out.println("========VETOR========");
        ordenacao.selectionSort(vetor); // Esperado para o vetor -> [10, 32, 35, 43, 54, 72, 81, 97]
        
        System.out.println("=======VETOR 1======="); 
        ordenacao.selectionSort(vetor1); // Esperado para o vetor1 -> [5, 17, 22, 33, 52, 65, 80, 99]
    }
}