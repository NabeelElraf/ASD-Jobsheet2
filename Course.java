public class Course {
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public Course() {
    }

    public Course(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    void showInformation() {
        System.out.println("Kode: " + kodeCourse);
        System.out.println("Nama: " + name);
        System.out.println("SKS: " + credits);
        System.out.println("Jam: " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        credits = sksNew;
        System.out.println("SKS berhasil diubah menjadi " + credits);
    }

    void addHour(int hours) {
        numberOfHours += hours;
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Jam sekarang: " + numberOfHours);
        } else {
            System.out.println("Pengurangan gagal. Jam tidak cukup.");
        }
    }
}