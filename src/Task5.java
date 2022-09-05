public class Task5 {
    public static void main(final String[] args)
    {
        final int[][] matrixN = new int[2][3];
        final int[][] matrixM = new int[3][2];

        createMatrixN(matrixN);
        System.out.println("MatrixN before:  ");
        printMatrixN(matrixN);
        System.out.println("MatrixN after:  ");
        transport(matrixN, matrixM);
        printMatrixM(matrixM);
    }


    static void createMatrixN(final int[][] matrixN) {
        for (int i = 0; i < matrixN.length; i++) {
            for (int j = 0; j < matrixN[i].length; j++) {
                matrixN[i][j] = (int) (Math.random()*10);
            }
        }
    }
    static void printMatrixN(final int[][] matrixN) {
        for (int i = 0; i < matrixN.length; i++) {
            for (int j = 0; j < matrixN[i].length; j++) {
                System.out.print(matrixN[i][j]);
            }
            System.out.println();
        }
    }
    static void transport(final int[][] matrixN, final int[][] matrixM) {
        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM[i].length; j++) {
                matrixM[i][j] = matrixN[j][i];
            }
        }
    }
    static void printMatrixM(final int[][] matrixM) {
        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM[i].length; j++) {
                System.out.print(matrixM[i][j]);
            }
            System.out.println();
        }
    }
}
