public class GDCLoop {

    public static void main(String[] args){
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int result = gcd(number1,number2);

        System.out.println("GCD of "+number1+" and "+number2+" = " + result);
    }

    private static int gcd(int number1, int number2) {
        int remainder;
        do {
            remainder = number1 % number2;
            number1 = number2; //preparation of next iteration
            number2 = remainder;
        }while(remainder != 0 );

        return number1;
        // return -1; will never return.
    }
}
