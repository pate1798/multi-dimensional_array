/*
 *  Jeel Patel
 * Student ID: 991548626
 *  PROG24178 OOP-2 Java 
 */
package midterm_practice;

/**
 *
 * @author jeel
 */
public class Midterm_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int arr[][] = new int[3][2];
       arr[0][0]=1;
       arr[0][1]=8;
       arr[1][0]=7;
       arr[1][1]=9;
       arr[2][0]=10;
       arr[2][1]=6;
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();  
        }
    }
    //   int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

/*printing 2D array
for(int i=0;i<3;i++){
 for(int j=0;j<3;j++){
   System.out.print(arr[i][j]+" ");
 }
 System.out.println();
}*/

}
    

