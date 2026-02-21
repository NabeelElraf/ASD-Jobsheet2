public class Lecturers {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturers() {
    }

    public Lecturers(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void showInformation() {
        System.out.println("ID: " + idLecturer);
        System.out.println("Nama: " + name);
        System.out.println("Status Aktif: " + activeStatus);
        System.out.println("Tahun Masuk: " + yearOfEntry);
        System.out.println("Keahlian: " + expertiseCompetency);
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}