package ooplab9;

public class Person {
    private String name;
    private String personid;
    private Address Address;
    private Job Job;

    public Person(String name, String personid, Address address, Job job) {
        this.name = name;
        this.personid = personid;
        this.Address = address;
        this.Job = job;
    }

    //tostring
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid='" + personid + '\'' +
                ", Address=" + Address +
                ", Job=" + Job +
                '}';
    }

    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        this.Address = address;
    }

    public Job getJob() {
        return Job;
    }

    public void setJob(Job job) {
        this.Job = job;
    }
}
