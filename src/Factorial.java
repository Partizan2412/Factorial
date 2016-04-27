public class Factorial {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = factorialA ( a );
        if (b != 1) {
            System.out.println("FactorialA :" + b);
        }
    }
    public static int factorialA(int x) {
        int fact = 1;
        if ( x < 0) {
            throw new IllegalArgumentException("Nevernoe znachenie");
        }   else {
            for (int i = 1; i <= x ; i++){
                fact *= i;
            }
        }
        return fact;
    }
}
