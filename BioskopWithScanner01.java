import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil ditambahkan!");
                                break;
                            } else {
                                System.out.println("Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Baris atau kolom tidak tersedia. Silakan masukkan kembali.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = penonton[i][j];
                            if (namaPenonton == null) {
                                namaPenonton = "***";
                            }
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, namaPenonton);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        }
    }
}