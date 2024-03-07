
public class Altera {
    public static void main(String[] args) {
//        int alas = 3;
//        int tinggi = 4;
//        printname(alas, tinggi);

//        konversiNilai(80);
//
//        Palindrome("katak");
//        Palindrome("civic");
//        Palindrome("lion");
//        Palindrome("kasur rusak");
//        Palindrome("kupu-kupu");
//
//          DrawXYZ(3);
//
//        int[] input = {1, 2, 3, 4};
//        Deretmean(input);
//
//        int testNumber = 7;
//        if (isPrima(testNumber)) {
//            System.out.println(testNumber + " adalah bilangan prima.");
//        } else {
//            System.out.println(testNumber + " bukan bilangan prima.");
//        }

//        InputNilai(20);




    }

    // MENGHITUNG LUAS SEGITIGA , PROBLEM 1
    public static void printname(int alas, int tinggi) {
        double LuasSegitiga = ((alas * tinggi) / 2);
        System.out.println("Ini adalah Luas Segitiga " + LuasSegitiga);
    }

    // NILAI PROBLEM 2
    public static void konversiNilai(float nilai) {
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 65 && nilai <= 79) {
            System.out.println("B+");
        } else if (nilai >= 50 && nilai <= 64) {
            System.out.println("B");
        } else if (nilai >= 35 && nilai <= 49) {
            System.out.println("C");
        } else if (nilai >= 0 && nilai <= 34) {
            System.out.println("D");
        } else {
            System.out.println("Invalid");
        }


    }


    // BILANGAN PRIMA PROBLEM 4
    public static boolean isPrima(int bilangan) {
        if (bilangan <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(bilangan); i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;
    }


    // PALINDROME PROBLEM 5
    public static void Palindrome(String value) {
        String balikan = "";
        boolean hasil = false;
        for (int x = value.length() - 1; x >= 0; x--) {
            balikan = balikan + value.charAt(x);
        }
        System.out.println(balikan);
        System.out.println(value);
        if (value.equals(balikan)) {
            hasil = true;
            System.out.println(hasil);
        }
        System.out.println(hasil);

    }


    // DRAW XYZ Problem 6
    public static void DrawXYZ(int height) {
        for (int baris = 1; baris <= height; baris++) {
            for (int kolom = 1; kolom <= height; kolom++) {
                int nilai = kolom + (baris - 1) * height;
                if (nilai % 3 == 0) System.out.print("X");
                else if (nilai % 2 == 0) System.out.print("Z");
                else System.out.print("Y");
            }
            System.out.println();
        }
    }

    // MEAN PROBLEM 7
    public static void Deretmean(int[] value) {
        double total = 0;
        for (int numb : value) {
            total += numb;
            // total = total + numb
        }

        System.out.println(total / value.length);

    }

    // NOMOR 3
    public static void InputNilai(int InputNilai) {
        for (int i = InputNilai; i >= 1; i--) {
            if (InputNilai % i == 0) {
                System.out.println(i);
            }
        }
    }







}

