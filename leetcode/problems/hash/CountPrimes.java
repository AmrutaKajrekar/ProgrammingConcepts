package problems.hash;

/**
 * @author amruta.kajrekar on 6/12/18.
 */
public class CountPrimes {

    public static void main(String[] args){
        CountPrimes prime = new CountPrimes();
        System.out.println(prime.countPrimes(10));
    }

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }

    public int countPrimes2(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)) count++;
        }

        return count;
    }

    private boolean isPrime(int num){
        for(int i=2;i<=num;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

}
