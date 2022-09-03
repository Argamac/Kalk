import java.io.IOException;
import java.util.Scanner;
import java.lang.String;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static String[] op1, op2, op3;
    public static String a, b, str, oper;

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        out.println("¬ведите выражение в следующем формате:\"a\"+\"b\" или \"a\"+c, где c число");
        oper = scan.nextLine();
        op1 = oper.split("[\"]");
        str = String.join("", op1);
        op2 = str.split("[/*+-]");
        op3 = oper.split("");
        Throwable throwable = new Throwable();
        throwable.throwable();
        a = op1[1];
        Operation operation = new Operation();
        operation.operation();
    }
    static class Operation {
        public void operation() {
            if (oper.contains("+")) {
                b = op2[1];
                System.out.println(a + b);
            }

            else if (oper.contains("-")) {
                b = op2[1];
                String[] ar =a.split(b);
                a = String.join("",ar);
                System.out.println(a);
            }

            if (oper.contains("*")) {
                int z = Integer.parseInt(op2[1]);
                int c = a.length();
                if ((z * c) > 40) {
                    int r = 40 / c;
                    a = a.repeat(r);
                    out.println(a + "...");
                } else out.println(a.repeat(z));
            } else if (oper.contains("/")){
                b = op2[1];
                int c = a.length();
                int z = Integer.parseInt(op2[1]);
                c = c / z ;
                for (int i = 0; i < c; i++) {
                    char rez = a.charAt(i);
                    System.out.print(rez);
                }
            }
        }
    }
    static class Throwable {
        public void throwable() {
            String op4 = String.join("", op1[0]);
            String op5 = String.join("", op1[1]);
            if (!op3[0].equals("\"")  |  op4.length() > 10 | op5.length() > 10 | (op1.length == 3 & (op1[2].contains("+")|op1[2].contains("-") ))) {
                try {
                    throw new IOException();
                } catch (IOException e){
                    out.println("ќшибка ввода данных");
                    System.exit (1);
                }
            }

        }
    }
}
