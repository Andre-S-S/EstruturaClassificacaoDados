package br.com;


public class OrdenacaoQuick {
    
    // Método de divição da lista do vetor
    int division(int vetor[], int start, int end) {
        int reference; // pivô de referência  
        int up; // Posição acima
        int down; // Posição abaixo
        int swap; // Troca de variálvel
        
        reference = vetor[start]; // Troca de valor inicial do vetor com o número de referência
        down = start; // Troca de valor inicial com a posição abaixo
        up = end; // Troca de valor final com a posição acima 
        
        while (down < up) {
            // Encontrando um número que seje maior que o pivô referência
            while (vetor[down] <= reference && down < end) {
                down++; // seguir até encontrar um valor maior
            }
            // Encontrar a partir do fim um valor menor que o meu de pivô de referência
            while (vetor[up] > reference) {
                up--;
            }
            
            if (down < up) { // Esse processo é para não cruzarem nas listas de troca
                // Aqui é feito a troca da posição acima do vetor pela variavél
                swap = vetor[down];
                vetor[down] = vetor[up];
                vetor[up] = swap;
            }
        }
        // no final da funação é a posição de up que retorna onde está o pivô
        vetor[start] = vetor[up];
        vetor[up] = reference;
        return up;
    }
    
    void quickSort(int vetor[], int start, int end) {
        int pivo; // Pivô da lista 
        
        // Encontrar se o valor final e menor que o inicial
        if (start > end) {
            return;
        }
        
        pivo = division(vetor ,start, end); // Chamar e trocar o método division pelo pivô da lista
        quickSort(vetor, start, pivo - 1); // Chamar o método quickSort para subtrair o valor final  
        quickSort(vetor, pivo + 1, end); // Chamar o método quickSort novamente para adicionar no valor inicial
        
        // Este processo que irá mostrar o funcionamento do vetor, com a posição final dos elementos todos ordenados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        OrdenacaoQuick ordenacao = new OrdenacaoQuick();
        
        int vetor[] = {13, 62, 91, 77, 2, 84, 31, 57}; // Vetor desordenado
        int vetor1[] = {29, 44, 93, 1, 110, 53, 19, 80}; // Vetor1 desordenado
        
        System.out.println("========VETOR========");
        ordenacao.quickSort(vetor, 0, vetor.length - 1); // Esperado para o vetor -> [2, 13, 31, 57, 62, 77, 84, 91]
        
        System.out.println("=======VETOR 1=======");
        ordenacao.quickSort(vetor1, 0, vetor1.length - 1); // Esperado para o vetor1 -> [1, 19, 29, 44, 53, 80, 93, 110]
    }
}