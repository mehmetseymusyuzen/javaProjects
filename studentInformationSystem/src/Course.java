public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int midTermExam;
    int finalExam;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.midTermExam = 0;
        this.finalExam = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println(this.name + " teacher cannot teach this lesson.");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
