package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(6);
		Integer i03 = new Integer(9);
		
		//int a = 3;
		//Integer b = new Integer(3);
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);

		System.out.println(iSet.size());//
		System.out.println(iSet.toString());//HashSet의 내용
		
		System.out.println("-------------------------------");
		
		//set은 순서가 없으므로 지금까지 사용하던 반복문을 사용하여 i를 입력하던 방법은 못씀.
		//for(int i=0;i<iSet.size();i++) {...}
		//반복문->for문, while문
		//향상된 for문 사용(해야될 기능:위치)
		for(Integer num :iSet) {
			System.out.println(num.toString());
		}//실제로 사용되는 출력값
		
		System.out.println("-------------------------------");
		
		Integer i04 = new Integer(150);
		iSet.add(i04);
		System.out.println(iSet.size());//4개->i04의 값이 3,6,9중에 중복되는게 있으면 3개
		System.out.println(iSet.toString());//내용확인
		
		for(Integer num:iSet) {
			System.out.println(num.toString());
		}
		
		
		
	}

}
