package id.akdev.propertiesfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ContohMakePropertiesFile {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException exception){
            System.out.println("File tidak ketemu");
        } catch (IOException exception){
            System.out.println("File tidak dapat diload");
        }

        //menyimpan / membuat properties

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Adi");
            properties.put("name.last", "Kurniawan");

            properties.store(new FileOutputStream("name.properties"), "konfigurasi nama");
        } catch (FileNotFoundException exception){
            System.out.println("eror membuat file");
        } catch (IOException exception)
        {
            System.out.println("error menyimpan properties");
        }

    }
}
