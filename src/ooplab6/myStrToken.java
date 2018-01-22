package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
//        StringTokenizer ใช้เม็ดดอทเพื่อทำการอัพ token
        String msg = "Welcome to RMUTSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); //การนับจำนวนคำ

        while (myToken.hasMoreElements()){ //คำสั่งใช้อ่านคำทีละคำไปจนถึงคำสุดท้าย
            StringBuffer myBuff = new StringBuffer(myToken.nextToken()); //nextToken การอ่านคำทีละคำ
            System.out.println(myBuff.reverse()+" ");
        }



    }//main
}//class
