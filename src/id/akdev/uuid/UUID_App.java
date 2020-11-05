package id.akdev.uuid;

import java.util.UUID;

public class UUID_App {
    public static void main(String[] args) {
        //Universally Unique Identifier
        for (int i = 0; i <= 10 ; i++){
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
