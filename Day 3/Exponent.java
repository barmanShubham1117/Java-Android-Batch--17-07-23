import java.util.Scanner;

class ExponentCalculation {
    int r;

    ExponentCalculation(int x, int n) {
        r = x;      //r=2
        for (int i = 1; i < n; i++) {   //7
            r = r * x;      // => 4,8,16,32,64,128,256
        }
    }
}

class Exponent {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int x = sc.nextInt();                       //2

        System.out.print("Enter a power number: ");
        int n = sc.nextInt();                       //8

        ExponentCalculation e = new ExponentCalculation(x, n);
        System.out.print("exponent value of " + x + "^" + n + " is :" + e.r);

        sc.close();
    }
}