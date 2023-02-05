public class ConstructOverloading {
    int i, j;

    public ConstructOverloading() {
        // i=100;//j=200;
        System.out.print("Inside default constructor");
        System.out.println(" Value of i " + i + "and j " + j);
    }

    public ConstructOverloading(int q) {
        System.out.println("Inside single parameter constructor with int value=" + q);
    }

    public ConstructOverloading(String str) {
        System.out.print("Inside single parameter constructor with String object");
        System.out.print(" String Value=" + str);
    }

    public ConstructOverloading(int p, double k) {
        System.out.println("Inside double parameter constructor value ofp=" + p + "" + "and k=" + k);
    }

    public static void main(String args[]) {
        ConstructOverloading mco = new ConstructOverloading();
        ConstructOverloading spmco = new ConstructOverloading(10);
        ConstructOverloading dpmco = new ConstructOverloading(10, 20.20);
        ConstructOverloading dpmco1 = new ConstructOverloading(" Task1");
    }
}
