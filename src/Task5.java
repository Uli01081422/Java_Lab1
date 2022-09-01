public class Task5 {
        public static void main(final String[] args) {

            final int[][] n = new int[2][3];
            final int[][] m = new int[3][2];

            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[i].length; j++) {
                    n[i][j] = (int)(Math.random()*10);
                }
            }


            System.out.println("Initial matrix");
            System.out.println("------");
            for (int i = 0; i < n.length; i++, System.out.println()) {
                for (int j = 0; j < m.length; j++, System.out.println()) {
                    System.out.printf(String.valueOf(n[i][j]));
                }
                System.out.println();
            }


            for (int i = 0; i <  n.length; i++) {
                for (int j = i+1; j < m.length; j++) {
                    final int temp = n[i][j];  // заміна методом бульбашки
                    n[i][j] = m[j][i];
                    m[j][i] = temp;
                }
            }

            System.out.println();
            System.out.println("New matrix");
            System.out.println("------");
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.printf("%3d", n[i][j]);
                }
                System.out.println();
            }

        }
    }

