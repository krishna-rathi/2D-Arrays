import java.util.Scanner;

public class amazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 4, cols = 4;
        int a[][] = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
                a[i][j] = sc.nextInt();
        }
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = cols-1;
        while(top<bottom && left<right) {
                for(int i=left;i<=right;i++) {
                    System.out.print(a[top][i] + " ");
                }
                top++;

                for(int i=top;i<=bottom;i++) {
                    System.out.print(a[i][right] + " ");
                }
                right--;

                for(int i=right;i>=left;i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;

                for(int i=bottom;i>=top;i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
    }
    
}
