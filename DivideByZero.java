class DivideByZero {
    public static void main(String args[]) {
        int x = 0;
        int y = 10;
        try {
            int z = y / x;
        } catch (ArithmeticException ae) {
            System.out.println("Divisor cannot be zero");
        }
    }
}
