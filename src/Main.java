public class Main {
    public static void main(String[] args) {

        // Matriz A 5x5
        int[][] A = {
                {7, 2, 9, 4, 6},
                {1, 8, 3, 10, 5},
                {4, 6, 2, 9, 1},
                {10, 3, 7, 5, 8},
                {2, 9, 4, 1, 6}
        };

        // Matriz B 5x5
        int[][] B = {
                {3, 5, 1, 8, 2},
                {6, 4, 9, 2, 7},
                {5, 1, 8, 3, 10},
                {2, 7, 4, 6, 1},
                {9, 3, 5, 10, 4}
        };

        // Matriz C que armazenará o resultado da divisão
        double[][] C = new double[5][5];

        // Matriz D que armazenará o resultado da soma
        double[][] D = new double[5][5];

        // Calcula divisão e soma
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                // Verifica se o divisor é diferente de zero
                if (B[i][j] != 0) {

                    // Divisão
                    C[i][j] = (double) A[i][j] / B[i][j];

                    // Soma
                    D[i][j] = A[i][j] + B[i][j];

                    // Subtração
                    D[i][j] = A[i][j] -  B[i][j];

                } else {
                    System.out.println(
                            "Erro: divisão por zero na posição ["
                                    + i + "][" + j + "]"
                    );
                    return;
                }
            }
        }

        // Exibe matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe matriz B
        System.out.println("\nMatriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe resultado da divisão
        System.out.println("\nMatriz C = A / B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe resultado da soma
        System.out.println("\nMatriz D = A + B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe resultado da SUBTRAÇÃO
        System.out.println("\nMatriz D = A - B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}