public class recursion{

    // public static void printnumb(int n){

    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnumb(n-1);
    // }

    public static void printfib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c= a + b;
        System.out.println(c);
        printfib(b, c, n-1);


    }

    public static void printsum(int i, int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printsum(i+1, n, sum);
        System.out.println(i);

    }

    public static int calculatefact(int n ) {
        if(n == 0 || n == 1){
            return 1;
        }

        int fact = calculatefact(n-1);
        int factorial = n * fact;
        return factorial;
        
    }
    public static void main(String[] args) {

        int a = 0, b = 1, n = 7;
        System.out.println(a);
        System.out.println(b);
        printfib(a, b, n-2);

        // int n =5;
        // int ans = calculatefact(n);
        // System.out.println(ans);
        // printsum(1,5,0);

    //     if(n == 6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnumbers(n+1);
    // }
    
    // public static void main(String[] args) {
    //     int n = 1;
        

    //     // printnumb(n);
    //     printnumbers(n);
    }
}