

public class MultiplicaMatrizes {

    public static void main(String[] args) {

        int[][] a = new int[][] {{1,2},{3,4}};
        int[][] b = new int[][] {{-1,3},{4,2}};

        int[][] result = new int[2][2];

        // result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0]
        // result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1]
        // result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0]
        // result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1]
        // 1*(-1) + 2*4


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                result[i][j] = multiplica(i,j, a, b);

            }

        }


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println("Resultado = R["+i+"]["+j+"] = " + result[i][j]);
            }
        }

    }

    public static int multiplica(int ri, int rj, int[][] a, int[][] b ){
        int result = 0;

        for (int i = 0; i < a.length; i++) {

           result += a[ri][i] * b[i][rj];

        }

        return result;
    }


}
