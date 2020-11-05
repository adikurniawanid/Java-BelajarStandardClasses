package id.akdev.string;


import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        //Pengabung string di awal, di tengah, di akhir
        StringJoiner stringJoiner = new StringJoiner(", " , "[", "]");

        System.out.println("STRING JOINER");
        stringJoiner.add("Adi");
        stringJoiner.add("Beby");
        stringJoiner.add("Cinhap");
        stringJoiner.add("Della");

        String names = stringJoiner.toString();
        System.out.println(names);
    }
}
