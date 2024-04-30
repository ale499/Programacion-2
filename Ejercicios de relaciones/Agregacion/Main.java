package Agregacion;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Franco", "Gerente");
        Employee employee2 = new Employee("Ale", "Desarrollador");
        Employee employee3 = new Employee("Bobi", "Contador");

        Department department1 = new Department("Ventas");

        department1.addEmployee(employee1);
        department1.addEmployee(employee2);

        System.out.println("Empleados del departamento de " + department1.getName() + ":");
        for (Employee employee : department1.getEmployees()) {
            System.out.println("- Nombre: " + employee.getName() + ", Cargo: " + employee.getPosition());
        }
    }

    }
