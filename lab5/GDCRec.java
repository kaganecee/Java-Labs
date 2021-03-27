public class GDCRec {

    public static void main(String[] args){
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int result = gcd(number1,number2);

        System.out.println("GCD of "+number1+" and "+number2+" = " + result);
    }

    // gcd (n1,n2) = gcd(n2,n1%n2)
    private static int gcd(int number1, int number2) {
        int remainder = number1 % number2;
        if (remainder == 0)
            return number2;
        return gcd(number2,remainder);
    }
}
