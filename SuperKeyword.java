class Parentclass {
    int num = 100;
}

// Child class or subclass
class SuperKeyword extends Parentclass {
    int num = 110;

    void printNumber() {
        // Super.variable_name
        System.out.println("Accessing Parentclass variable using super keyword=" + super.num);
        System.out.println("Without using super keyword the value of num =" + num);
    }

    public static void main(String args[]) {
        SuperKeyword obj = new SuperKeyword();
        obj.printNumber();
    }
}
