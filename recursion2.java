
import java.util.HashSet;

public class recursion2 {

    // tower of hanoi

    public static void towerofhanoi(int n, String src, String dest, String helper){
        if(n == 1){
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        towerofhanoi(n-1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n-1, helper, src, dest);
    }

    // printing string in revers
    public static void printStringReverse(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printStringReverse(str, index - 1);
    }

    // finding the 1st and last occurrence of a character in a string

    public static int first = -1;
    public static int last = -1;

    public static void findoccurence(String str, int idx, char element){
        if(first == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == element){
            if(first == -1){
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findoccurence(str, idx+1, element);
    }

    // sorted array check
    public static boolean issorted(int arr[], int idx){
        if(idx == arr.length - 1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return issorted(arr, idx+1);
        }
        else {
            return false;
        }
    }

    // moveallx
    public static void moveallx(String str, int idx, String newstr, int count ){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currentChar = str.charAt(idx);
        if(currentChar == 'x'){
            count++;
            moveallx(str, idx + 1, newstr, count);
        }
        else{
            newstr += currentChar;
            moveallx(str, idx + 1, newstr, count);
        }
    }

    // removing duplicate values from a string

    public static boolean [] map = new boolean[26];

    public static void removeduplicate(String str, int idx, String newstring){

        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a']){
            removeduplicate(str, idx+1, newstring);
        }
        else{
            map[currchar - 'a'] = true;
            newstring += currchar;
            removeduplicate(str, idx + 1, newstring);
        }
    }


    // print all the subsequences of a string

    // public static void subsequences(String str, int idx, String newstr){
    //     if(idx == str.length()){
    //         System.out.println(newstr);
    //         return;

    // }
    // char currchar = str.charAt(idx);
    // subsequences(str, idx + 1, newstr + currchar); // include current character
    // subsequences(str, idx + 1, newstr); // exclude current character
    // }

     // print all the unique subsequences of a string

     public static void subsequences(String str, int idx, String newstr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }

    }
    char currchar = str.charAt(idx);
    subsequences(str, idx + 1, newstr + currchar, set); // include current character
    subsequences(str, idx + 1, newstr, set); // exclude current character
    }

    // print the keypad combinations of a string
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void printcombo (String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for (int i=0; i<mapping.length(); i++){
            printcombo(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {

        String str = "3";
        printcombo(str, 0, "");
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // subsequences(str, 0, "",set);


        // removeduplicate(str, 0, "");

        // moveallx(str, 0, "", 0);

        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(issorted(arr, 0));

        // String str = "abaacdaefaah";
        // // char element = 'a';
        // findoccurence(str, 0, 'a');



        // printStringReverse(str, str.length() - 1);
        // System.out.println();
    
        // int n = 3; // Number of disks
        // towerofhanoi(n, "S", "H", "D"); // A, B and C are names of rods
    }
}