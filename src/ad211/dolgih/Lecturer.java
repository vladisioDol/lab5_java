package ad211.dolgih;

public class Lecturer extends Person {
    private String department;
    private double salary;


    public void setInfoLecturer(String name, String lastname, int age,String department,double salary) {
        super.setInfo(name, lastname, age);
        this.department=department;
        this.salary=salary;

    }

    @Override
    public void printInfo() {
        System.out.println("Преподаватель кафедры "+department);
        super.printInfo();
        System.out.println("Зарплата - "+ salary);

    }
}
