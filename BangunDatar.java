public class BangunDatar {
    public static void main(String[] args) {

        // Segitiga
        int alas,tinggi,luasSegitiga;
        alas = 20;
        tinggi = 25;
        luasSegitiga = (alas*tinggi)/2;
        System.out.println("Hasil dari luas Segitiga adalah " + luasSegitiga + "cm^2");

        // Persegi Panjang
        int panjang,lebar;
        int luasPersegiPanjang;
        panjang = 40;
        lebar = 6;
        luasPersegiPanjang = (panjang*lebar);
        System.out.println("Hasil dari luas Persegi Panjang adalah " + luasPersegiPanjang + "cm^2");

        // Lingkaran
        int jariJari;
        double phi,luasLingkaran;
        jariJari = 7;
        phi = 3.14;
        luasLingkaran = (phi*jariJari*jariJari);
        System.out.println("Hasil dari luas Lingkaran adalah " + luasLingkaran + "cm^2");
    }
}
