
import java.util.Scanner;

public class bits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); // 1 for set, 2 for clear, 3 for toggle, 4 for check
        int n = 5; 
        int pos = 2;
        int bitmask = 1 << pos; // Create a bitmask with a 1 at the specified position


        if(oper == 1){
        int newNumber = bitmask | n; // Set the bit at the specified position to 1
        System.out.println(newNumber);

        }else{
            int newbitmask = ~(bitmask);
            int newNumber = newbitmask & n; // Clear the bit at the specified position to 0
            System.out.println(newNumber);

        }

        // int bitMask = 1 << pos; // Create a bitmask with a 1 at the specified position
        // int notbitMask = ~(1 << pos); // Create a bitmask with a 0 at the specified position
              
        // int newNumber = n & notbitMask; // Set the bit at the specified position to 1
        // System.out.println( newNumber); // Output: 7 (binary 111)


        // if((bitMask & n) == 0 ){
        //     System.out.println("bit was zero");
        // }
        // else {
        //     System.out.println("bit was one");
        // }
    }
	
	
}
