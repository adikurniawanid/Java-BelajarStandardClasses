package id.akdev.number;

public class NumberApp {
    public static void main(String[] args) {
        //konversi tipe data angka ke tipe data angka
        Integer integerValue = 10;
        Long longValue = integerValue.longValue();
        Double doubkeValue = integerValue.doubleValue();
        //dll

        //konversi dari String ke number
        String angka = "10000";
        Integer intAngka = Integer.valueOf(angka);
        System.out.println(intAngka);
        angka = "10.10";
        Double doubleAngka = Double.valueOf(angka);
        System.out.println(doubleAngka);


    }
}
