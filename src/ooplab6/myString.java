package ooplab6;

public class myString {
    public static void main(String[] args) {
      String msg1 = "Khwanchanok kana";
      System.out.println(msg1);
      char []c = {'H','e','l','l','o'};
      String msg2 = new String(c);
      System.out.println(msg2);

      //concatenation String การต่อสตริง
      //type 1 (+)
      String msg3 = msg2 +" "+ msg1;
      System.out.println(msg3);
      System.out.println(msg3.length());
      //type2 (concat()) การใช้คอนแทคแมดดอท
        String msg4 = msg3.concat(" RMUTSV");
        System.out.println(msg4);

        System.out.println(msg4.toLowerCase());
        System.out.println(msg4.toUpperCase()); //ตัวพิมพ์ใหญ่
        System.out.println(msg4.substring(5,10));  //การตัดคำ

        //trim() ตัดเว้นวรรคด้านซ้ายและด้านขวาออก
        String msg5 = " Hello ";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trim()+"*");



    }//main
}//class
