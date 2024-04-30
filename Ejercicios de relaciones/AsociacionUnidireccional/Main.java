package AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        University u1 = new University("Universidad 1");
        University u2 = new University("Universidad 2");


        Student s1 = new Student("estudiante 1",u1);
        Student s2 = new Student("estudiante 2", u2);

        System.out.println(s1.getName() + " pertenece a la universidad " + s1.getUniversity().getName());
        System.out.println(s2.getName() + " pertenece a la universidad " + s2.getUniversity().getName());

        s1.changeUniversity(u2);
        System.out.println("Después de cambiar de universidad:");
        System.out.println(s1.getName() + " ahora pertenece a la universidad " + s1.getUniversity().getName());
    }
}
