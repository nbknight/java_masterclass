import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int base = a;
            for(int j = 0; j < n; j++) {
                base = (int) (base + Math.pow(2,j)*b);
                System.out.print(base + " ");
            }
            System.out.println();

        }
        in.close();
    }

}

