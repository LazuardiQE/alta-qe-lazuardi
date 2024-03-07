public class EasyChallenge {

    //SOAL 1 KELILING LUAS

    public static void LuasSegitiga(int alas, int tinggi) {
        double LuasSegitiga = ((alas * tinggi) / 2);
        System.out.println("Luas Segitiga " + LuasSegitiga);

    }

    public static void LuasPersegi(int sisi1, int sisi2) {
        double LuasPersegi = (sisi1 * sisi2);
        System.out.println("Luas Persegi " + LuasPersegi);
    }

    public static void LuasPersegiPanjang(int panjang, int lebar) {
        double LuasPersegiPanjang = (panjang * lebar);
        System.out.println("Luas Persegi Panjang " + LuasPersegiPanjang);
    }

    public static void KelilingSegitiga(int alas, int tinggi) {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double kelilingSegitiga = alas + tinggi + sisiMiring;
        System.out.println("Keliling Segitiga " + kelilingSegitiga);
    }

    public static void KelilingPersegi(int sisi1, int sisi2) {
        double KelilingPersegi = (sisi1 * 4);
        System.out.println("Keliling Persegi " + KelilingPersegi);
    }

    public static void KelilingPersegiPanjang(int panjang, int lebar) {
        double KelilingPersegiPanjang = (2 * (panjang * lebar));
        System.out.println("Keliling Persegi Panjang " + KelilingPersegiPanjang);
    }

    // SOAL 3 KALKULATOR
    public static void Penjumlahan(int[] value) {
        double total = 0;
        for (int numb : value) {
            total += numb;

        }
        System.out.println("Kalkulator Penjumlahan " + total);
    }

    public static void Pengurangan(int[] value) {
        double total = value[0] * 2;
        for (int numb : value) {
            total -= numb;
        }
        System.out.println("Kalkulator Pengurangan " + total);
    }

    public static void Perkalian(int[] value) {
        double total = 1;
        for (int numb : value) {
            total *= numb;
        }
        System.out.println("Kalkulator Perkalian " + total);
    }

    public static void Pembagian(int[] value) {
        double total = value[0] * value[0];
        for (int numb : value) {
            total /= numb;
        }
        System.out.println("Kalkulator Pembagian " + total);
    }

    // SOAL 4 PAKETT

    public static void dimensiPaket(int panjang, int lebar, int tinggi, float beratPaket) {
        double hasilPerhitungan = panjang * lebar * tinggi;
        System.out.println("Dimensi Paket nya adalah " + hasilPerhitungan + " cm3");
        perhitunganHarga(beratPaket);
    }

    public static void perhitunganHarga(float dimensiPaket) {
        int beratPembulatan = Math.round(dimensiPaket);
        System.out.println("Dengan biaya Rp " + beratPembulatan * 5000);
    }

    // SOAL 2 VOLUME

    public static void volume(int sisi) {
        double volumeKubus = (sisi * sisi * sisi);
        System.out.println("Volume Kubusnya adalah " + volumeKubus);
    }

    public static void volume1(int panjang, int lebar, int tinggi) {
        double volumeBalok = (panjang * lebar * tinggi);
        System.out.println("Volume Baloknya adalah " + volumeBalok);
    }

    public static void volume2(int diameter, int tinggi) {
        double volumeTabung = (3.14 * ((0.5 * diameter) * (0.5 * diameter)) * tinggi);
        System.out.println("Ini adalah Volume Tabungnya " + volumeTabung);

    }
}





