package id.akdev.string;

public class StringBuilderApp {
    public static void main(String[] args) {
        String names[] = {"Adi", "Kurniawan"};

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("STRING BUILDER APPEND");
        //append untuk menambahkan String
        stringBuilder.append("Adi");
        stringBuilder.append(" ");
        stringBuilder.append("Kurniawan");

        //toString untuk menjadikan String
        String namaLengkap = stringBuilder.toString();
        System.out.println(namaLengkap);
    }
}
