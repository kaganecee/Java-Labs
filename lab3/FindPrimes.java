public class FindPrimes {

    public static void main(String[] args){
        System.out.println("Max= "+ args[0]);
        int max= Integer.parseInt(args[0]);

        //Print the Prime numbers that are less than max.
        //1.for each number less then max
        for(int number = 2; number<max ; number++) {
            //1.1.check the number is prime
            int divisor = 2;
            boolean isPrime = true;
            while(divisor < number && isPrime){
                if(number % divisor == 0){
                    isPrime = false;
                }
                divisor++;
            }

            if(isPrime) //1.2.if the number is prime
                System.out.print(number+","); //1.2.1.print

        }
    }
}
