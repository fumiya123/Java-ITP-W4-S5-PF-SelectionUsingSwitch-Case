import java.util.Scanner;

public class KasirTokoBuku {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // definisi variabel
        String nama_barang;
        double harga_barang, diskon, total_harga;
        int jumlah_barang;

        System.out.println("Nama Barang: ");
        nama_barang = scan.nextLine();

        System.out.println("Harga Barang: ");
        harga_barang = scan.nextDouble();

        System.out.println("Jumlah Barang: ");
        jumlah_barang = scan.nextInt();

        // menghitung total harga
        total_harga = harga_barang * jumlah_barang;
        System.out.println("HARGA: Rp" + total_harga);

        // Membuat variabel kategori harga dengan pembagian total harga
        int kategoriHarga = (int) total_harga / 100000;

        switch (kategoriHarga) {
            case 5:  // Untuk total harga >= 500000
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                diskon = total_harga * 50 / 100;
                total_harga -= diskon;
                System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
                break;
            case 3:  // Untuk total harga > 200000
            case 4:
                diskon = total_harga * 20 / 100;
                total_harga -= diskon;
                System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
                break;
            case 1:  // Untuk total harga >= 100000
            case 2:
                diskon = total_harga * 10 / 100;
                total_harga -= diskon;
                System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
                break;
            default:  // Untuk total harga < 100000
                diskon = total_harga * 1;
                System.out.println("Total Harga: Rp" + total_harga);
                break;
        }

        scan.close();
    }
}
