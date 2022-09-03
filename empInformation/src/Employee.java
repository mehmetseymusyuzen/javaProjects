public class Employee {
    String name;
    double salary;
    double workHours;
    int startYear;

    Employee(String name, double salary, double workHours, int startYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startYear = startYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0.0;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0.0;
    }

    public double raiseSalary() {
        if (this.startYear <= 2021) {
            if (2021 - this.startYear < 10) {
                return this.salary * 5 / 100;
            } else if (2021 - this.startYear < 20) {
                return this.salary * 10 / 100;
            } else {
                return this.salary * 15 / 100;
            }
        } else {
            return 0.0;
        }
    }

    public double totalSalary() {
        return this.salary + bonus() + raiseSalary() - tax();
    }

    public double salaryWithoutTotal() {
        return this.salary + bonus() - tax();
    }

    public void toPrint() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Start Year : " + this.startYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Raise Salary : " + raiseSalary());
        System.out.println("Salary with Taxes and Bonuses : " + salaryWithoutTotal());
        System.out.println("Total Salary : " + totalSalary());
        System.out.println();
    }
}
