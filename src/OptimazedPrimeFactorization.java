public class OptimazedPrimeFactorization implements Runnable {


    @Override
    public void run() {
        int number = 0;
        while(number<50){
            if (isPrime(number)){
                System.out.println( " : "+ number);
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
