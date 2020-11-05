package id.akdev.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionApp {
    public static void main(String[] args) {
        //disingkat regex

        String name = "Adi Kurniawan Mahasiswa Teknik Informatika";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        //penjelasannya, diawali kalimat a-z kecil maupun besar, berapapun jumlahnya(*),
        //yang penting ada a di tengahnya [a]
        //diakhiri kalimat a-z kecil maupun besar, berapapun jumlahnya(*)
        Matcher matcher = pattern.matcher(name);

        while (matcher.find())
        {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
