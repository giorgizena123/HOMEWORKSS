//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1)
        int a = 0;
        for (int i = 10; i <= 100; i += 5) {
            a += i;
        }
        System.out.println(a);
//2)
        int b = 12512;
        int k = 0;
        while (b != 0) {
            b /= 10;
            k++;
        }
        System.out.println(k);
//3)
        int c = 19;
        double d = (double) c;
        int r = 0;
        for (int i = c; c < 0; i--) {
            if (d / i - c / i == 0) {
                r += 1;
            }

        }
        if (r > 2) {
            System.out.println("araa maritvi");
        } else {
            System.out.println("martivia");
        }
//4)
        int z = 27;
        int v = 18;
        if (z > v) {
            for (int i = v; v > 0; i--) {
                if (z % i == 0) {
                    System.out.println(i);
                    break;

                }

//5

                for (int j = 100; j < 1000; j++) {
                    if (j % (j / 100 + (j / 10) % 10 + j % 10) == 0) {
                        System.out.println(j);
                    }
                    }
                }

            }
//6)
        int f = 0;
        int w = 1;
        for (int m=1;m<=10;m++){
            System.out.println(f+" ");
           int fib=f+w;
           f=w;
           w=fib;
        }
        }

    }

