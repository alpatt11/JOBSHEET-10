import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6]; 
        
        
        System.out.println("Input data survei (nilai 1-5):");
        for (int i = 0; i < hasilSurvei.length; i++) {
            System.out.println("\nResponden " + (i + 1) + ":");
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = input.nextInt();
            }
        }
        
        
        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < hasilSurvei.length; i++) {
            double total = 0;
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = total / hasilSurvei[i].length;
            System.out.printf("Responden %d: %.2f\n", (i + 1), rataRata);
        }
        
        
        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < hasilSurvei[0].length; j++) {
            double total = 0;
            for (int i = 0; i < hasilSurvei.length; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = total / hasilSurvei.length;
            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataRata);
        }
        
        
        double totalKeseluruhan = 0;
        int jumlahData = hasilSurvei.length * hasilSurvei[0].length;
        
        for (int i = 0; i < hasilSurvei.length; i++) {
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        
        double rataRataKeseluruhan = totalKeseluruhan / jumlahData;
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", rataRataKeseluruhan);
        
        input.close();
    }
}