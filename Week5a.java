import java.io.*;
import java.util.*;

class Week5a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a file name");
        String s = new String(br.readLine());
        File f = new File(s);
        if (f.exists())
            System.out.println("File exists");
        if (f.canRead())
            System.out.println("File isreadable");
        if (f.canWrite())
            System.out.println("File iswritable");
        if (f.isFile())
            System.out.println("File iswritable");
        else if (f.isDirectory())
            System.out.println("It isdirectory");
        System.out.println("The length of the file is " + f.length() + " bytes");
        System.out.println("path:" + f.getAbsolutePath());
    }
}
