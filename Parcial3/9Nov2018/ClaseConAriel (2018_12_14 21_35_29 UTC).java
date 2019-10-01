public class ClaseConAriel{
    public static void main(String[] args) {
        int[][]resultado;
        resultado=tablasMultiplicar();
        printMatrix(resultado);
    }
    public static int[][] tablasMultiplicar(){
        int [][] tablas;
        tablas = new int[11][11];
        for (int i=0; i<11; i++) {
            for (int j=0; j<11; j++) {
                tablas[i][j]=(i+1)*(j+1);
            }
        }
        return tablas;
    }//termina tablasMultiplicar

    public static void printMatrix(int[][]matrix){
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}//termina ClaseConAriel
