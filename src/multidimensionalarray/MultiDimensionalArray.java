
package multidimensionalarray;
import java.util.*;
public class MultiDimensionalArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j , k   =0;
        System.out.println("enter number of row :");
        j = sc.nextInt();
        System.out.println("enter number of colimn : ");
        k = sc.nextInt();
        int[][] mutiarray = new int[j][k];
        for (i = 0 ; i < j ; i++)
        {
            for (int l= 0; l < k ; l++) {
                System.out.println("enter row "+ i +"column "+ l );         
                mutiarray[i][l] = sc.nextInt();
            }
        }
        System.out.println(" Multi Dimensional Array "+j+"*"+k+ " is :");
        for (i = 0; i < j; i++) {
            for (int l = 0; l < k; l++) {
                System.out.print("|"+mutiarray[i][l]+ "| ");
                }
            System.out.println();
        }
        
        
    }
    
}
