public class CourseMain {
    public static void main(String[] args) {

        Course c1 = new Course();
        c1.kodeCourse = "SIB101";
        c1.name = "Algoritma";
        c1.credits = 3;
        c1.numberOfHours = 4;

        c1.showInformation();
        c1.updateSKS(4);
        c1.addHour(2);
        c1.reduceHours(3);

        Course c2 = new Course("SIB102","Struktur Data",3,4);
        c2.showInformation();
        c2.reduceHours(5);
    }
}