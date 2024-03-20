package clase19_3;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Pérez");
        System.out.println(empleado);

        Operario operario = new Operario("María López",36162172);
        operario.setDni(12345678);
        System.out.println(operario);

        Directivo directivo = new Directivo("Pedro García", "Recursos Humanos");
        System.out.println(directivo);

        Oficial oficial = new Oficial("Carlos Martínez", 98765432, 35);
        System.out.println(oficial);

        Tecnico tecnico = new Tecnico("Ana Sánchez", 87654321, 40);
        System.out.println(tecnico);
    }
}



