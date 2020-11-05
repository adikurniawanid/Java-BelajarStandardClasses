package id.akdev.system;

public class SystemApp {
    public static void main(String[] args) {
        //dapat waktu sekarang dalam timemilis dan nano time
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        //cek environment variabel pada pc
        System.out.println(System.getenv());
        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("PATH"));

        //melakukan garbage collection. fyi java melakukan gc secara otomatis.
        System.gc();

        System.exit(0);
        System.out.println("Adi Kurniawan");
        //dll
    }
}
