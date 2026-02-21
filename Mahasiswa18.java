public class Mahasiswa18 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkaninformasi() {
        System.out.println("nama "+ nama);
        System.out.println("Nim"+ nim );
        System.out.println("IPK "+ ipk);
        System.out.println("Kelas: "+ kelas);
    }

    void ubahkelas (String kelasbaru) {
        kelas = kelasbaru;

    }
    
    void updateIpk(double ipkBaru) {
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    } else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
    }
    }


    String nilaiKinerja() {
        if (ipk >= 3.5 ) { 
            return "kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "kinerja baik";
        } else if (ipk >= 2.0){
            return "cukup";
        } else {
            return "kinerja kurang";
        }
    }

public Mahasiswa18 (String nm, String nim, double ipk, String kls){
    nama = nm; 
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}
}