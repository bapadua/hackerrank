import java.util.*;
import java.io.*;
import java.math.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for(int j = 0; j < n; j++){
            res = res + (int)(Math.pow(2.0, j)* b);
            System.out.print(res + " ");
            }
        System.out.println();
        }
        in.close();
    }
}
