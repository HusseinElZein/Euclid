import java.util.Scanner;

public class Euclidean {
    private static final int MAX_SIZE = 10;

    private static final int[] index = new int[MAX_SIZE];
    private static final int[] q = new int[MAX_SIZE];
    private static final int[] r = new int[MAX_SIZE];
    private static final int[] s = new int[MAX_SIZE];
    private static final int[] t = new int[MAX_SIZE];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        boolean done;
        System.out.println("indsaet 2 tal");
        a = s.nextInt(); b = s.nextInt();
        int i = 2;

        //secure number order
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        if (a < b){
            int c = a;
            a = b;
            b = c;
        }

        if (a != 0) {
            setup(a, b);
            do {
                index[i] = i - 1;
                setQ(i);
                setR(i);
                done = checkDone(i);
                if (!done) {
                    setS(i);
                    setT(i);
                }
                i++;
            } while (!done);
            print();
        }
        else
            System.out.println(a);
    }

    public static void setup(int a, int b){
        index[0] = -1;
        index[1] = 0;
        r[0] = a;
        r[1] = b;
        s[0] = 1;
        s[1] = 0;
        t[0] = 0;
        t[1] = 1;
    }

    public static void setQ(int index){
        q[index] = r[index-2] / r[index-1];
    }

    public static void setR(int index){
        r[index] = r[index-2] - (q[index] * r[index -1]);
    }

    public static void setS(int index){
        s[index] = s[index - 2] - (q[index] * s[index - 1]);
    }

    public static void setT(int index){
        t[index] = t[index - 2] - (q[index] * t[index - 1]);
    }

    public static boolean checkDone(int index){
        return r[index] == 0;
    }

    public static void print(){
        int i = -1;
        System.out.println("i" + "\t" + "q" + "\t" + "r" + "\t" + "s" + "\t" + "t");
        do {
            i++;
            if (r[i]!=0)
                System.out.println((index[i]+1) + "\t" + q[i] + "\t" + r[i] + "\t" + s[i] + "\t" + t[i]);
            else
                System.out.println((index[i]+1) + "\t" + q[i] + "\t" + r[i]);
        }while(r[i] > 0);
    }
}