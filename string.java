public class string {
    public static void main(String[] args) {
        // concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName +" " + lastName;
        System.out.println(fullName);
        // length
        System.out.println( fullName.length());
        // charAt
        for(int i=0;i< fullName.length();i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        // System.out.println(fullName.charAt(3)); // prints 't'
        System.out.println();
        // compare
        String name1 = "tony";
        String name2 = "tony";

        if(name1.compareTo(name2) == 0) {
            System.out.println("Both names are equal");
        } else {
            System.out.println("Names are not equal");
        }
          
    }
    
}
