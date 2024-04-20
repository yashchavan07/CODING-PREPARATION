//asked in goldman snaks interview
public class Friendspairing {
    public static int pairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //SINGLE CHOICE
        int fnm1 = pairing(n-1);

        //double
        int fnm2 = pairing(n-2);
        int pairs = (n-1) * fnm2;

        //totalways
        int totalways = pairs + fnm1;
        return totalways;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairing(n));
    }

    
}
