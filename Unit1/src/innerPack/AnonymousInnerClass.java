package innerPack;

abstract class Factorial {
    public abstract int calculate(int n);
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Factorial f = new Factorial() {// anonymous inner class of Factorial
            @Override
            public int calculate(int n) {
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }
                return fact;
            }
        };

        int result = f.calculate(5);
        System.out.println("Factorial: " + result);
    }
}
