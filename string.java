





public class string {
    public static void main(String[] args) {
        // concatenation
    //     String firstName = "tony";
    //     String lastName = "stark";
    //     String fullName = firstName +" " + lastName;
    //     System.out.println(fullName);
    //     // length
    //     System.out.println( fullName.length());
    //     // charAt
    //     for(int i=0;i< fullName.length();i++){
    //         System.out.print(fullName.charAt(i) + " ");
    //     }
    //     // System.out.println(fullName.charAt(3)); // prints 't'
    //     System.out.println();
    //     // compare
    //     String name1 = "tony";
    //     String name2 = "tony";

    //     if(name1.compareTo(name2) == 0) {
    //         System.out.println("Both names are equal");
    //     } else {
    //         System.out.println("Names are not equal");
    //     }
          
    // }

    // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // String[] arr = new String[size];
    // int tolstring = 0;
    // for(int i=0;i<size;i++){
    //     arr[i] = sc.next();
    //     tolstring += arr[i].length(); 
    // }
    // System.out.println("Total length of all strings: " + tolstring);


//     Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

    // Scanner sc = new Scanner(System.in);
    // String str = sc.next();

    // String result = "";

    // for(int i=0;i<str.length();i++){
    //     if (str.charAt(i)=='e' || str.charAt(i)=='E') {
    //         result += "i";
    //     } else {
    //         result += str.charAt(i);
            
    //     }
    // }
    // System.out.println(result);

    // Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”


    // Scanner sc = new Scanner(System.in);
    // String email = sc.next();
    // String username = "";

    // for(int i=0;i<email.length();i++){
    //     if(email.charAt(i) == '@') {
    //         break;
    //     } else {
    //         username += email.charAt(i);
    //     }
    // }
    // System.out.println("Username: " + username);
    
        // STRING BUILDER
        StringBuilder sb = new StringBuilder("tony");

        // reverse
        // System.out.println(sb.reverse());
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
           
        }
        System.out.println(sb);


        // // append
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length());

        // System.out.println(sb.charAt(0));  

        // // set char at indexs
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // // insert
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // // // delete
        // sb.delete(2, 3);
        // System.out.println(sb);

        // // // append
        // sb.append(" Stark");
        // System.out.println(sb);



}}
