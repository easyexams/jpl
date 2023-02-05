class Counter2 {
    static int count = 0;

    // int count=0;
    Counter2() {
        count++;
        // System.out.println("Count value = " +count);
    }
}

class staticCounter {
    public static void main(String args[]) {
        Counter2 c1 = new Counter2();
        System.out.println("c1 count=" + c1.count);
        Counter2 c2 = new Counter2();
        System.out.println("c2 count=" + c2.count);
        Counter2 c3 = new Counter2();
        System.out.println("c3 count=" + c3.count);
        Counter2 c4 = new Counter2();
        System.out.println("c4 count=" + c4.count);
    }
}