package id.akdev.string;

public class StringApp {
    public static void main(String[] args) {
        //sifat string immutable (tidak bisa berubah isinya)
        String namaLengkap = "Adi Kurniawan";
        String namaDepan = "Adi";
        String namaBelakang = "Kurniawan";
        String [] names;
        String spasi = " ";

        System.out.println("LOWER CASE & UPPER CASE");
        System.out.println(namaLengkap);
        //kecilkan dan besarkan semua huruf
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.toUpperCase());
        System.out.println("===================");

        System.out.println("LENGTH");
        //menghitung panjang string, termasuk spasi
        System.out.println(namaLengkap.length());
        System.out.println("===================");

        System.out.println("START WITH & END WITH");
        //cek dimulai dan diakhiri oleh String apa
        System.out.println(namaLengkap.startsWith("Adi"));
        System.out.println(namaLengkap.endsWith("Kurniawan"));
        System.out.println("===================");


        System.out.println("SPLIT");
        //memecah String dengan parameter yang ditentukan
        names = namaLengkap.split(" ");
        for ( var name: names) {
            System.out.println(name );
        }
        System.out.println("===================");

        //cek apakah kosong dan apakah null
        System.out.println("IS BLANK & IS EMPTY");
        System.out.println(spasi.isBlank());
        System.out.println(spasi.isEmpty());
        System.out.println("===================");

        //ambil char pada indeks tertentu di string
        System.out.println("CHAR AT");
        System.out.println(namaLengkap.charAt(2));
        System.out.println("===================");

        //simpan semua huruf kedalam array
        System.out.println("TO CHAR ARRAY");
        char[] chars = namaLengkap.toCharArray();
        for (var karakter: chars) {
            System.out.print(karakter + "-");
        }
    }
}
