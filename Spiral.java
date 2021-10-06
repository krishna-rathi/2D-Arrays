class Spiral {
 
    static void spiralPrint(int rowEnd, int colEnd, int a[][])
    {
        int i, rowStart = 0, colStart = 0;
 
        while (rowStart < rowEnd && colStart < colEnd) {
         
            for (i = colStart; i < colEnd; ++i) {
                System.out.print(a[rowStart][i] + " ");
            }
            rowStart++;
 
            for (i = rowStart; i < rowEnd; ++i) {
                System.out.print(a[i][colEnd - 1] + " ");
            }
            colEnd--;
 
            if (rowStart < rowEnd) {
                for (i = colEnd - 1; i >= colStart; --i) {
                    System.out.print(a[rowEnd - 1][i] + " ");
                }
                rowEnd--;
            }
 
            if (colStart < colEnd) {
                for (i = rowEnd - 1; i >= rowStart; --i) {
                    System.out.print(a[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
 
    public static void main(String[] args)
    {
        int R = 3;
        int C = 6;
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                      { 7, 8, 9, 10, 11, 12 },
                      { 13, 14, 15, 16, 17, 18 } };
 
        spiralPrint(R, C, a);
    }
}
