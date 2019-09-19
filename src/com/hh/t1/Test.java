package com.hh.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//스캐너를 사용해서 주민등록번호 입력받기. 991122-1234567
		//현재 이사람의 나이
		//태어난 계절
		//성별
		System.out.println("주민등록번호를 입력 해 주세요.");
		String idnumber = sc.next();//입력받은 주민등록번호
		
		int age = 0; //받아온 나이
		int nage =0; //현재나이
		int season = 0; //계절
		int gender = 0; //성별
		idnumber.replace("-", "");

			////////////////////////////////////////////////////////////////
			char ch = idnumber.charAt(7); //성별체크
		
			if(ch=='1' || ch == '3') {
				
				System.out.println("남자");
				
			}else if (ch=='2' || ch =='4') {
				System.out.println("여자");
			}
			
			////////////////////////////////////////////////////////////////
			
			String ch2 = idnumber.substring(0,2); //나이체크
			//문자열의 비교는  equals
			//- 클래스명.parseXXX("문자열") : 문자열을 해당 데이터타입으로 바꿔줌.
			
			age = Integer.parseInt(ch2); //년도를 숫자타입으로 바꿈
			
			if(age>=00&&age<=19) {//2000년대 이후 출생
				nage = 20-age;
				
				if(ch=='1') { //2000년대 이전 100살이상
				nage = 2020-(1900+age);
				}
				
			}else { //1900년대 출생
				nage = 2020-(1900+age);
			}
				System.out.println(nage+"살");
			
			
			//////////////////////////////////////////////////////////////////
			
			String ch3 = idnumber.substring(2,4); //계절체크
			
			season = Integer.parseInt(ch3);
			
			if(season/3 == 1 ) {	
				System.out.println("봄");	
			}else if(season/3 == 2) {		
				System.out.println("여름");
			}else if(season/3 == 3) {
				System.out.println("가을");
			}else if(season/3 == 4 || season==01 || season==02) {
				System.out.println("겨울");
			}
			

	}

}
