public class Main {
    public static void main(String[] args) {
        OptimazedPrimeFactorization prime= new OptimazedPrimeFactorization();
        LazyPrime lazyPrime= new LazyPrime();

        Thread thread= new Thread(prime);
        Thread thread1= new Thread(lazyPrime);
        thread.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();

    }
}
