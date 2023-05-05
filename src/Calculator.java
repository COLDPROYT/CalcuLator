// by https://github.com/COLDPROYT (GitHub)
// by https://vk.com/coldpro2022 (VKontakt)
// by https://t.me/github_COLDPROYT (Telegram)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner IntScanner = new Scanner(System.in);
        Scanner StringScanner = new Scanner(System.in);


        System.out.print("¬ведите первое число: ");
        int a = IntScanner.nextInt();

        System.out.print("¬ведите второе число: ");
        int b = IntScanner.nextInt();

        System.out.print("¬ведите операцию: ");
        String oper = StringScanner.nextLine();


        if (oper.equals("+")) {
            System.out.println(a + b);
        }

        if (oper.equals("-")) {
            System.out.println(a - b);
        }

        if (oper.equals("*")) {
            System.out.println(a * b);
        }

        if (oper.equals("/")) {
            System.out.println(a / b);
        }

        if (oper.equals("%")) {
            System.out.println(a % b);
        }

    }
}

