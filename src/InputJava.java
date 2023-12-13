import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String inputNama = "Nama saya "+scanner.nextLine();
        System.out.print("Masukkan Alamat Anda: ");
        String inputAlamat = "Alamat saya di "+scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin Anda: ");
        String inputGender = "Saya berjenis kelamin "+scanner.nextLine();
        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahunLahir = scanner.nextInt();
        int usia = 2023 - tahunLahir;
        String inputTahunLahir = "Saya berusia "+usia+" Tahun";
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Profile.txt")))) {
            writer.println(inputNama);
            writer.println(inputAlamat);
            writer.println(inputGender);
            writer.println(inputTahunLahir);
            if (usia <= 18){
                writer.println("Saya masih bocil");
            } else {
                writer.println("Apakah saya seorang manula?");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
