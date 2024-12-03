import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1)
        car a = new car("abc", "LaFerrari", 2024, "AA-2321-BB");
        a.printinfo();
//2)
        numbers(1, 21, 30, 0);
//3)
        nums(1, 100, 0);

//4)
        power(2, 4, 1);

//5)
        zerocount(102030);
        zerocount(456);
        zerocount(10000);









    }



    private static void numbers(int a, int b, int k, int j) {
        System.out.println(j);
        if (b < a) {
            return;
        }
        if (k / b == (double) k / b) {
            j += b;
        }
        numbers(a, b - 1, k, j);
    }


    private static void nums(int l, int n, int s) {
        System.out.println(s);
        if (l > n) {
            return;
        }
        s += l;
        nums(l + 1, n, s);

    }

    private static void power(int a, int n, int j) {
        System.out.println(j);
        if (n == 0) {
            return;
        }

        j *= a;
        power(a, n - 1, j);
    }




    public static int zeros(int n) {

        if (n < 10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return zeros(n / 10) + (n % 10);
        }
    }
    public static void zerocount(int m) {
        int zeroCount = zeros(m);
        System.out.println("რიცხვში " + m + " 0-ების რაოდენობა " + (zeroCount % 2 == 0 ? "ლუწია" : "კენტია"));
    }







}




