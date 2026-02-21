public class DosenMain {
    public static void main(String[] args) {

        Lecturers d1 = new Lecturers();
        d1.idLecturer = "DS001";
        d1.name = "Dr. Andi";
        d1.activeStatus = true;
        d1.yearOfEntry = 2015;
        d1.expertiseCompetency = "AI";

        d1.showInformation();
        System.out.println("Masa kerja: " + d1.calculateTimeWork(2026));
        d1.setStatusActive(false);
        d1.changeSkill("Data Science");

        Lecturers d2 = new Lecturers("DS002","Dr. Budi",true,2018,"Network");
        d2.showInformation();
    }
}