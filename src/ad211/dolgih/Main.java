package ad211.dolgih;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Scanner console1 = new Scanner(System.in);
        byte answer=0;
        byte size=1;
        byte counter=0;
        Person [] array = new Person[size];


                    System.out.println("Сколько человек хотите добавить в базу данных?");
                    size = console.nextByte();
                    array = new Person[size];
                    while (size < 0 || size > 50) {
                        if (size < 0) {
                            System.out.println("Напиши нормально!");
                        } else {
                            System.out.println("Да ну,не будешь ты больше 50 человек добавлять,пиши другое");
                        }
                    }
                    while (counter<size) {
                        System.out.println("Кого хотите добавить в базу данных?\n");

                        System.out.println("1.Студент");
                        System.out.println("2.Преподаватель");
                        answer = console.nextByte();
                        if (answer == 1) {
                            Person objS = new Student();

                            Student obj1 = (Student) objS;
                            System.out.println("Порядок заполнения:\n1.Name\n2.Lastname\n3.Age\n4.Group\n5.Number of Student Ticket");
                            obj1.setInfoStudent(console.next(), console1.next(), console.nextInt(), console.nextInt(), console1.nextInt());
                            array[counter] = obj1;
                            counter++;
                        } else if (answer == 2) {
                            Person objL = new Lecturer();
                            Lecturer obj2 = (Lecturer) objL;
                            System.out.println("Порядок заполнения:\n1.Name\n2.Lastname\n3.Age\n4.Department\n5.Salary");

                            obj2.setInfoLecturer(console.next(), console.next(), console.nextInt(), console.next(), console.nextDouble());
                            array[counter] = obj2;
                            counter++;
                        }


                }


                    if(size<0){
                        System.out.println("Вы еще никого не добавили!");
                    }else {
                        for (int i = 0; i < size; i++) {
                            array[i].printInfo();
                            System.out.println();
                        }
                    }


            }








    }

