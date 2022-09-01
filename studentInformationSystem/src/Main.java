public class Main {
    public static void main(String[] args) {

        Course mathematics = new Course("Mathematics", "101", "MATH");
        Course physics = new Course("Physics", "202", "PHYSICS");
        Course english = new Course("English", "303", "ENG");

        Teacher teacher1 = new Teacher("Ridvan", "444", "MATH");
        Teacher teacher2 = new Teacher("Mehmet", "333", "PHYSICS");
        Teacher teacher3 = new Teacher("Maria", "222", "ENG");

        mathematics.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        english.addTeacher(teacher3);

        Student student1 = new Student("Mustafa", "622", 11, mathematics, physics, english);
        student1.addBulkmidtermNote(87,73,91);
        student1.addBulkfinalNote(82,81,88);
        student1.isPass();

        Student student2 = new Student("Fuat", "631", 11, mathematics, physics, english);
        student2.addBulkmidtermNote(92, 63, 55);
        student2.addBulkfinalNote(84, 79, 66);
        student2.isPass();

        Student student3 = new Student("Mesut", "627", 11, mathematics, physics, english);
        student3.addBulkmidtermNote(43,23,87);
        student3.addBulkfinalNote(55, 30, 65);
        student3.isPass();


    }
}