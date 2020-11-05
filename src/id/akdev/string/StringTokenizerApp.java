package id.akdev.string;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        //memisah String dengan token yang sudah ditetapkan, sama seperti split. namun hemat memori
        String namaLengkap ="Adi Kurniawan Makan Ayam Goreng Nyam Nyam";

        StringTokenizer stringTokenizer = new StringTokenizer(namaLengkap, " ");

        while (stringTokenizer.hasMoreTokens()){
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }

    }
}
