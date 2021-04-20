package practice;

import java.util.Random;
import java.util.Scanner;

public class 암복호화 {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String msg="", msg2, enc, dec="";
        System.out.print("Message : ");
        msg = sc.nextLine(); // 입력받고
        System.out.println("길이 : "+msg.toUpperCase().trim().length());
        int r = random.nextInt(26);
        
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w' ,'x', 'y', 'z'};
        char[] answer = new char[msg.length()]; // 암호화를 위한 배열 선언
        char[] decword = new char[msg.length()]; //복호화를 위한 배열 선언 
        
       
        
        for(int i=0; i<msg.length(); i++) {
           // 복호화 배열에 삽입
          decword[i] = msg.charAt(i);
           //a~z의 값이 아닌 아스키코드의 값을 가졌을 경우 
//           if(!(97 <= msg.charAt(i) && msg.charAt(i) <= 122)) {
        	   if(97 > msg.charAt(i) || msg.charAt(i) > 122) {
              
              // 암호화 배열에 삽입
              answer[i]= msg.charAt(i);
           }
           //a~z의 값을 가졌을 경우
           else {
              r = random.nextInt(26);
              //값이 같을 경우 제외
               if(msg.charAt(i)==(alpha[r])) {
                  if(r==25) r--; 
                  else r++;
                  answer[i]= alpha[r];
               }
               else {
                  answer[i]= alpha[r];
               }
               
           }
        }
        //암호와 메시지 enc 생성을 위해 char 배열을 String으로 변환 
        enc = new String(answer);
        System.out.print("Encoded : ");
        System.out.println(enc);
        System.out.print("Decode(y/n)? ");
        msg2 = sc.next();
   
        if(msg2.charAt(0) == 'y' || msg2.charAt(0) == 'Y') {
           //복호화 과정 
           dec = new String(decword);
           //비교 부분 
           if(dec.equals(msg)) {
           //성공 메시지
              System.out.println("Decoded : " + dec);
              System.out.println("Decoding is successful.");
              sc.close();
           }
           else {
           // 실패 메시지
              System.out.println("Decoding is failed.");
           }
        }
        else System.out.println("종료합니다.");
    }
}