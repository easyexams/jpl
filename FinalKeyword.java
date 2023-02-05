class FinalKeyword {
    final int MAX_VALUE = 99;

    void myMethod() {
        System.out.println("MAX_VALUE =" + MAX_VALUE);
        // MAX_VALUE=101;
    }

    public static void main(String args[]) {
        FinalKeyword obj = new FinalKeyword();
        obj.myMethod();
    }
}
