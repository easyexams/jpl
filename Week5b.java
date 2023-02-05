import java.io.*;

class Week5b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a file name");
        String s = br.readLine();
        int s1, i = 1;
        FileInputStream fin = new FileInputStream(s);
        System.out.println(i++ + " ");
        do {
            s1 = fin.read();
            if (s1 != -1)
                System.out.println((char) s1);
            if ((char) s1 == '\n')
                System.out.println(i++ + " ");
        } while (s1 != -1);
        fin.close();
    }
}
