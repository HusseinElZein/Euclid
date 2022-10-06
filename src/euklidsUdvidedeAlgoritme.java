import java.util.Scanner;

public class euklidsUdvidedeAlgoritme {
    public static int q, r1, r2, r, s1, s2, s, t1, t2, t, num1, num2;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s1=1; s2=0;
        t1=0; t2=1;

        System.out.print("Skriv dit foerste tal: ");
        r1 = sc.nextInt();
        num1=r1;
        System.out.print("Skriv dit andet tal: ");
        r2=sc.nextInt();
        num2=r2;
        System.out.println();
        sc.close();


        r = r1 % r2;
        boolean again = true;
        while(again) {
            again = false;
            q = r1 / r2;
            r = r1 % r2;
            s = s1 - s2 * q;
            t = t1 - t2 * q;

            System.out.print("q: " + q + "\t|\t" + "r1: " + r1 + "\t|\t" + "r2: " + r2 + "\t|\t" + "r: " + r + " ");
            System.out.print("\t|\ts1: " + s1 + "\t|\t" + "s2: " + s2 + "\t|\t" + "s: " + s + " ");
            System.out.print("\t|\t t1: " + t1 + "\t|\t" + "t2: " + t2 + "\t|\t" + "t: " + t);

            r1 = r2;
            r2 = r;

            s1 = s2;
            s2 = s;

            t1 = t2;
            t2 = t;
            System.out.println();
            if(r!=0){
                again=true;
            }

            if (r == 0) {
                System.out.println();
                System.out.println("_________________________________________________________");
                System.out.println("Slut resultat:");
                System.out.print("q: " + "X" + "\t|\t" + "r1: " + r1 + "\t|\t" + "r2: " + r2 + "\t|\t" + "r: " + "X" + " ");
                System.out.print("\t|\ts1: " + s1 + "\t|\t" + "s2: " + s2 + "\t|\t" + "s: " + "X" + " ");
                System.out.print("\t|\t t1: " + t1 + "\t|\t" + "t2: " + t2 + "\t|\t" + "t: " + "X");

                System.out.println("\n");
                System.out.println("sfd(" + num1 + ", " + num2 + ") = " + " " + r1);
                System.out.println(num1 + "s" + " + " + num2 + "t = " + r1);
                System.out.println("s er: " + s1);
                System.out.println("t er: " + t1);
            }
        }
        }


}
