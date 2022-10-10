package ad211.dolgih;

public class Student extends Person {
    private int group;
    private int numberOfStudentTicket;


    public void setInfoStudent(String name, String lastname, int age,int group,int numberOfStudentTicket) {
        super.setInfo(name, lastname, age);
        this.group=group;
        this.numberOfStudentTicket=numberOfStudentTicket;

    }


    @Override
    public void printInfo() {
        System.out.println("Студент группы - "+group);
        super.printInfo();
        System.out.println("Номер студ. билета - "+numberOfStudentTicket);

    }
}
