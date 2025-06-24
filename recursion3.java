import java.util.ArrayList;

public class recursion3 {
    // place tiles of size 1xm in a floor of n x m
    public static int placeTiles(int n, int m) {
        // base case
        if(n == m ){
            return 2;
        }
        if (n < m) {
            return 1; // cannot place tiles
        }

    int verticaltile = placeTiles(n - m, m);
    int horizontaltile = placeTiles(n - 1, m);
    return verticaltile + horizontaltile;
    }

    // find the number of ways in which you can invite peoople to a party , single or in pairs
    public static int invitePeople(int n) {
        // base case
        if (n <= 1) {
            return 1; // only one way to invite 0 or 1 person
        }   
        // invite the first person alone
        int singleInvite = invitePeople(n - 1);
        // invite the first person with another person
        int pairInvite = (n - 1) * invitePeople(n - 2);
        return singleInvite + pairInvite;
    }

    // print all the subset of aset of first n natural numbers

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i=0;i<subset.size();i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findsubset(int n, ArrayList<Integer> subset) {

        // base case
        if(n == 0){
            printSubset(subset);
            return;
        }
        // addhoga
        subset.add(n);
        findsubset(n-1,subset);
        // add nahi hoga
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);

    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsubset(n, subset);

        // int totalWays = invitePeople(n);
        // System.out.println(totalWays);

        // int m = 2;
        // int totalWays = placeTiles(n, m);
        // System.out.println(totalWays);
    }
}
