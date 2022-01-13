public class matrix {
    public static void main(String[] args) {
       
        int a[][] = {{0,0,0,0,0},
                    {0,1,0,0,0},
                    {0,0,0,0,0},
                    {0,0,1,0,0}};
        int rows[] = new int[4];
        int cols[] = new int[5];
        for(int i=0;i<4;i++) {
            for(int j=0;j<5;j++) {
                if (a[i][j] == 1) {
                    rows[i] = 1; //1d array
                    cols[j] = 1; //1d array
                }
            }
        }
        for(int i=0;i<4;i++) {
            for(int j=0;j<5;j++) {
                if(rows[i] == 1 || cols[j] == 1) {
                    a[i][j] = 1;   
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
