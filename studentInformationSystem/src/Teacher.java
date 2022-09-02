public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    public Teacher(String name, String phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    public void print() {
        System.out.println("========================================");
        System.out.println("Teacher added to the system");
        System.out.println("Teacher's name : " + this.name);
        System.out.println("Teacher's number : " + this.phoneNumber);
        System.out.println("Teacher's branch : " + this.branch);
    }

}
