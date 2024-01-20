
public class Collatz {

    /**
     * @param n number to be manipulated.
     * */
    public static int nextNumber(int n) {
        //If n is even, the next number is n/2.
        if(n % 2 == 0){
            n /= 2;
        }else if ( n % 2 == 1){
            n = 3*n +1;
        }
        // If n is odd, the next number is 3n + 1.
        // If n is 1, the sequence is over.
        return n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

