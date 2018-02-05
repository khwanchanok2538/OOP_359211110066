package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("khwanchanok kana","1111111111111",
                new Address("91 M.11","Phatthalung","93110"),
                new Job("Sutdent","7000"));

        System.out.println(person.toString());


    }//main
}//class
