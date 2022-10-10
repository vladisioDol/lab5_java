package ad211.dolgih;

public class Person {
    private String name;
    private String lastname;
    private int age;

    public void setInfo(String name,String lastname,int age){
        this.name = name;
        this.lastname= lastname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Человек: "+ name+" "+lastname+ "\nВозраст - "+age);
    }
}


