public class EmpInformation {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maria", 2000.0, 34.0, 1999);
        Employee employee2 = new Employee("Mehmet", 3200.0, 50.0, 2003);
        Employee employee3 = new Employee("Mustafa", 2500.0, 45.0, 2011);
        Employee employee4 = new Employee("Fuat", 999, 60, 2021);
        employee1.toPrint();
        employee2.toPrint();
        employee3.toPrint();
        employee4.toPrint();
    }
}
