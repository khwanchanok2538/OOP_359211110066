package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("khwanchanok kana","1111111111111",
                new Address("91 M.11","Phatthalung","93110"),
                new Job("Student","7000"));

        System.out.println(person.toString());

     //ต้องการเปลี่ยนจำนวนเงินเดือน
     person.getJob().setSalary("30000");
     System.out.println(person.getJob());

    }//main
}//class
