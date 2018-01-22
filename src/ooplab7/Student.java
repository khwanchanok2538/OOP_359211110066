package ooplab7;

//desing class
    // taking about Student
    // 1. student id
    // 2. name
    // 3. major
    // 4. group
public class Student {
    public static String faculty = "Management Technology";
    private String id;
    private String name;
    private String major;
    private String group;
//ถ้าต้องการใช้งาน 4 ตัวนี้ต้องใช้งานผ่าน class
    //constructor
    //default
    public Student (){}
    public Student (String id, String n, String m, String g){
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }//constructor

    //getter and setter methods
    //id
    public void setId(String id){
        this.id = id;
    }//setID //ใช้ในการเซ็ตค่าของรหัส
    public String getId (){ return this.id; } //getID //การอ่านค่า

    public void setName(String n){
        this.name = n;
    }//setName
    public String getName(){
        return this.name;
    }//getName

    public void setMajor(String m){
        this.major = m;
    }//setMajor
    public String getMajor(){
        return this.major;
    }//getMajor

    public void setGroup(String g){
        this.group = g;
    }//setGroup
    public String getGroup(){
        return this.group;
    }//getGroup

//ไมสามารถรันได้เพราะเป็นแค่คำสั่ง

}//class
