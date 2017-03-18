import java.util.Scanner;

public class quizlab {
  public static Scanner input = new Scanner(System.in);

  public static int isWithinRange(float x, float min, float max) { //memeriksa range nilai
    byte result = 1;//return 1 jika x diantara min dan max, selain itu return 0
    if (x < min || x > max) {
      result = 0;
    }
    return result;
  }

  public static void main(String[] args) {
    float grade_points = 0, sum_grade_points = 0, average_mhs = 0;
    int count_mhs = 0, passed_mhs = 0, failed_mhs = 0;
    boolean exit = false;

    /*
      =========================================================
                                Data
      *********************************************************
      1. Banyak Mahasiswa dengan IP Valid;
      2. Banyak Mahasiswa lulus; (grade_points >= 2.75)
      3. Banyak Mahasiswa tidak lulus;
      4. Rata-rata IP (grade_points) di kelas tersebut,
         data grade_points salah diabaikan;
      5. Jika tidak ada IP valid, tampilkan pesan "Tidak ada data".
      =========================================================
    */

    do {
      System.out.print("Masukan IP Mahasiswa                : ");
      grade_points = input.nextFloat();
      if (isWithinRange(grade_points, 0f, 4f) == 1) {
        count_mhs++;
        if (isWithinRange(grade_points, 2.75f, 4f) == 1) {
          passed_mhs++;
        }
        else {
          failed_mhs++;
        }
        sum_grade_points += grade_points;
      }
      else if (grade_points == -999) {
        exit = true;
      }
      else {
        //abaikan
      }
    } while (!exit);

    System.out.println("\n========================================\n");
    if (count_mhs > 0) {
      average_mhs = sum_grade_points / count_mhs;
      System.out.println("Banyak Mahasiswa                    : " + count_mhs);
      System.out.println("Banyak Mahasiswa Lulus (IP >= 2.75) : " + passed_mhs);
      System.out.println("Banyak Mahasiswa Tidak Lulus        : " + failed_mhs);
      System.out.println("Rata-Rata IP Mahasiswa              : " + average_mhs);
    }
    else {
      System.out.println("Tidak ada data.");
    }
    System.out.println("\n=======================================\n");
    System.out.println("Aplikasi selesai dieksekusi.");
  }
}