public class LazyPrime implements Runnable{
    @Override
    public void run() {
        int number =0;
        while (number<50){
            if (isPrime(number))
                System.out.println(number+ " Lazy boy");
            number++;
        }
    }
    public static boolean isPrime(int number){
        if (number>2 && number %2!=0)
            return true;
        return false;
    }
}
