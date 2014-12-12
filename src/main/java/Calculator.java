public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int del(int a, int b) {
        return a - b;
    }

    public double del(double a, double b) {
        return a - b;
    }

    public double divide(int a, int b) {
        double div = 0;
        try {
            div = (double) a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception occured !");
        } finally {
            return div;
        }
    }
    public double divide(double a, double b) {
        double div = 0;
        try {
            div = (double) a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception occured !");
        } finally {
            return div;
        }
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int s1 = calc.sum(2, 3);
        double s2 = calc.sum(4.0, (double)10);
        System.out.println(s1);
        System.out.println(s2);

        int del1 = calc.del(2, 3);
        double del2 = calc.del(4.0, (double) 10);
        System.out.println(del1);
        System.out.println(del2);

        int mult1 = calc.multiply(2, 3);
        double mult2 = calc.multiply(4.0, (double) 10);
        System.out.println(mult1);
        System.out.println(mult2);

        double div1 = calc.divide(2, 0);
        double div2 = calc.divide(4.0, (double) 10);
        System.out.println(div1);
        System.out.println(div2);
    }
}
