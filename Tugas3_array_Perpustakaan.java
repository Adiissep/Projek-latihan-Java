package fungsi_array;
/**
 *
 * @author ADVANG4C
 * Nama : Adi Sepriyadi
 * NIM  : 20200040093
 * Kelas: TI20E Reg B
 * 
 */
import java.util.ArrayList; //library arraylist
import java.util.Scanner; //library scan data input
class Mahasiswa {
  String nim, nama;

  public Mahasiswa(String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
  }
}
class Buku {
  String kode,judul;

  public Buku(String kode, String judul) {
    this.kode = kode;
    this.judul = judul;
  }
}

class Transaksi {
  String nim, nama_mahasiswa, judul_buku;
  int jumlah_buku ;

  public Transaksi(String nim, String nama_mahasiswa, String judul_buku, int jumlah_buku) {
    this.nim = nim;
    this.nama_mahasiswa = nama_mahasiswa;
    this.judul_buku = judul_buku;
    this.jumlah_buku = jumlah_buku;
  }
}
public class Tugas3_array_Perpustakaan {
  public static void main(String[] args) {

    int exit = 0;
    ArrayList <Mahasiswa> D_Mahasiswa = new ArrayList<>(); 
    D_Mahasiswa.add(new Mahasiswa("20200040093", "Adi Sepriyadi"));
    D_Mahasiswa.add(new Mahasiswa("20200040092", "Dzeks dzikri"));
    D_Mahasiswa.add(new Mahasiswa("20200040091", "Yudha Raga"));

    ArrayList <Buku> D_Buku = new ArrayList<>(); 
    D_Buku.add(new Buku("BR001", "Mobile Development"));
    D_Buku.add(new Buku("BR002", "Data science"));
    D_Buku.add(new Buku("BR003", "Web Development"));

    ArrayList <Transaksi> D_Transaksi = new ArrayList<>(); 
    D_Transaksi.add(new Transaksi(
        D_Mahasiswa.get(0).nim,
        D_Mahasiswa.get(0).nama,
            D_Buku.get(0).judul,
            1
            ));

    while(exit != 1) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\n");
      System.out.print("=== Selamat Datang di Perpustakaan === \n");
      System.out.print("\n");
      System.out.print("============  Menu Utama  ============ \n");
      System.out.print("[1] Mahasiswa \n");
      System.out.print("[2] Buku \n");
      System.out.print("[3] Transaksi \n");
      System.out.print("[4] Keluar dari Aplikasi \n");
      System.out.print("====================================== \n");
      System.out.print("Pilih Menu : ");
      int menu = scanner.nextInt();

      switch(menu) {
        case 1: 
          M_Mahasiswa(D_Mahasiswa);
          break;
        case 2: 
          M_Buku(D_Buku);
          break;
        case 3: 
          M_Transaksi(D_Transaksi, D_Buku, D_Mahasiswa );
          break;
        case 4:
          System.out.print("Keluar dari Aplikasi [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();
          exit = confirm;
          break;
      }
    }
  }

  public static void M_Mahasiswa(ArrayList <Mahasiswa> D_Mahasiswa) {
    int exit = 0;
    Scanner scanner = new Scanner(System.in);

    while(exit != 1) {
      System.out.print("\n");
      System.out.print("------------- Form Mahasiswa ----------- \n");
      System.out.println("");
      System.out.print("--------------- Pilih Menu ------------- \n");
      System.out.print("[1] Tampilkan Data Mahasiswa \n");
      System.out.print("[2] Tambah Data Mahasiswa \n");
      System.out.print("[3] Hapus Data Mahasiswa \n");
      System.out.print("[4] Kembali Ke Menu Utama \n");
      System.out.print("---------------------------------------- \n");
      System.out.print("Pilih Aksi : ");
      int menu = scanner.nextInt();

      switch(menu) {

        case 1: 
          System.out.println("");
          for (Mahasiswa mhs:D_Mahasiswa) {
            System.out.println(mhs.nim + " | " + mhs.nama);
          }
          System.out.println("");
          break;

        case 2:
          System.out.println("Masukan Data Mahasiswa");

          System.out.print("Nim : ");
          String nim = scanner.next();

          System.out.print("Nama : ");
          String nama = scanner.next();
          nama += scanner.nextLine();

          D_Mahasiswa.add(new Mahasiswa(nim, nama));
          break;

        case 3:
          System.out.print("Masukan Index untuk dihapus : ");
          int index = scanner.nextInt();
          D_Mahasiswa.remove(index);
          break;

        case 4:
          System.out.print("Keluar dari Menu Mahasiswa [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();
          exit = confirm;
          break;
        default:
          break;
      }
    }



  } 

  public static void M_Buku(ArrayList <Buku> D_Buku) {
    int exit = 0;
    Scanner scanner = new Scanner(System.in);

    while(exit != 1) {
      System.out.print("\n");
      System.out.print("--------------- Form Buku --------------- \n");
      System.out.println("");
      System.out.print("--------------- Pilih Menu -------------- \n");
      System.out.print("[1] Tampilkan Data Buku \n");
      System.out.print("[2] Tambah Data Buku \n");
      System.out.print("[3] Hapus Data Buku \n");
      System.out.print("[4] Kembali Ke Menu Utama \n");
      System.out.print("----------------------------------------- \n");
      System.out.print("Pilih Aksi : ");
      int menu = scanner.nextInt();

      switch(menu) {

        case 1: 
          System.out.println("");
          for (Buku buku:D_Buku) {
            System.out.println(buku.kode + " | " + buku.judul);
          }
          System.out.println("");
          break;

        case 2:
          System.out.println("Masukan Data Buku");

          System.out.print("Kode : ");
          String kode = scanner.next();

          System.out.print("Judul : ");
          String judul = scanner.next();
          judul += scanner.nextLine();

          D_Buku.add(new Buku(kode, judul));
          break;

        case 3:
          System.out.print("Masukan Index untuk dihapus : ");
          int index = scanner.nextInt();

          D_Buku.remove(index);

          break;

        case 4:
          System.out.print("Keluar dari Menu Buku [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();

          exit = confirm;
          break;

        default:
          break;
      }
    }


  } 

  public static void M_Transaksi(
      ArrayList <Transaksi> D_Transaksi,
      ArrayList <Buku> D_Buku,
      ArrayList <Mahasiswa> D_Mahasiswa
      ) {
    int exit = 0;
    Scanner scanner = new Scanner(System.in);

    while(exit != 1) {
      System.out.print("\n");
      System.out.print("------------- Form Transaksi ------------ \n");
      System.out.println("");
      System.out.print("--------------- Pilih Menu -------------- \n");
      System.out.print("[1] Tampilkan Data Transaksi \n");
      System.out.print("[2] Tambah Data Transaksi \n");
      System.out.print("[3] Hapus Data Transaksi \n");
      System.out.print("[4] Kembali Ke Menu Utama \n");
      System.out.print("----------------------------------------- \n");
      System.out.print("Pilih Aksi : ");
      int menu = scanner.nextInt();

      switch(menu) {

        case 1: 
          System.out.println("");
          for (Transaksi transaksi:D_Transaksi) {
            System.out.println(
                  transaksi.nim + 
                  " | " + 
                  transaksi.nama_mahasiswa + 
                  " | " + 
                  transaksi.judul_buku + 
                  " | " + 
                  transaksi.jumlah_buku 
                );
          }
          System.out.println("");
          break;

        case 2:
          System.out.println("Masukan Data Transaksi");

          System.out.print("Nomor Index Mahasiswa : ");
          int indexMahasiswa = scanner.nextInt();

          System.out.print("Nomor Index Buku : ");
          int indexBuku = scanner.nextInt();

          System.out.print("Jumlah Buku yg ingin dipinjam: ");
          int jumlah_buku = scanner.nextInt();

          D_Transaksi.add(new Transaksi(
                D_Mahasiswa.get(indexMahasiswa).nim,
                D_Mahasiswa.get(indexMahasiswa).nama,
                D_Buku.get(indexBuku).judul,
                jumlah_buku

                ));
          break;

        case 3:
          System.out.print("Masukan Index untuk dihapus : ");
          int index = scanner.nextInt();
          D_Transaksi.remove(index);

          break;

        case 4:
          System.out.print("Keluar dari Menu Transaksi [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();
          exit = confirm;
          break;

        default:
          break;
      }
    }
  } 
}

