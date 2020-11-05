package id.akdev.base64;

import java.util.Base64;

public class Base64_App {
    public static void main(String[] args) {
        //encode dan decode
        String query = "belajar() pemrograman() java()";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);
    }
}
