class DefaultConstructor {
    int Sid;
    String Sname;

    // Default Constructor method
    DefaultConstructor() {
        System.out.println(
                "Default Constructor method gets called automatically whenever object of the class gets created.");
        Sid = 1;
        Sname = "vivek";
    }

    void showDetails() {
        System.out.println("Sid:" + Sid + "Sname:" + Sname);
    }

    public static void main(String[] args) {
        // creating object
        DefaultConstructor object = new DefaultConstructor();
        object.showDetails();
    }
}
