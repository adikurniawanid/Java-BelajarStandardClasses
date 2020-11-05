package id.akdev.runtime;

public class RuntimeApp {
    public static void main(String[] args) {
        //mengecek informasi environment pada java yang berjalan saat ini (JVM)
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        //memori jvm
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
