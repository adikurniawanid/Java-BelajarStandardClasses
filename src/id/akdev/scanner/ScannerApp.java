package id.akdev.scanner;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        //baca melalu konsol menggunakan system.in
        Scanner scanner = new Scanner(System.in);

        var a = scanner.next();
        System.out.println(a);
        //next line suka penyakitan
        var b = scanner.nextLine();
        System.out.println(b);
        var c = scanner.nextInt();
        System.out.println(c);
        var d = scanner.nextDouble();
        System.out.println(d);
        var e = scanner.nextBoolean();
        System.out.println(e);
        //dll

    }
}
