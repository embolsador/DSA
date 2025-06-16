import java.util.*;
 
public class array{
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];

    //     for (int i = 0; i < size; i++) {
    //         numbers[i] = sc.nextInt();
    //     }

    //     int x = sc.nextInt();

    //     for(int i = 0; i < numbers.length; i++) {
    //         if (numbers[i] == x) {
    //             System.out.println("Found at index: " + i);
    //         }
    //     }
    // }

    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    // int numbers[][] = new int[rows][cols];

    //input
    for(int i=0; i<rows;i++){
        for (int j=0;j<cols;j++){
            numbers[i][j] = sc.nextInt();
        }
    }
    // int x = sc.nextInt();


    for(int j=0; j<cols;j++){
        for (int i=0;i<rows;i++){
         {
            System.out.print(numbers[j][i]+ " ");
            // System.out.println("Found at index: " + i + " " + j);
        
    }
    

}
System.out.println();
    }}}