package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();

		//로또 중복체크
		
		while(true) {
			if(iSet.size()>=6)
				break;
			for(Integer num:iSet) {
				System.out.println(num.toString());
			}
			
		}
		
		
		/* 6번만 돌아가므로 중복이 나왔을 경우에 6개보다 적게 숫자가 나올수 있음.
		for(int cnt=0;cnt <6; cnt++) {
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);
		}
		*/
		
		/*
		int num01 = (int)(Math.random()*45)+1;
		int num02 = (int)(Math.random()*45)+1;
		int num03 = (int)(Math.random()*45)+1;
		int num04 = (int)(Math.random()*45)+1;
		int num05 = (int)(Math.random()*45)+1;
		int num06 = (int)(Math.random()*45)+1;

		iSet.add(num01);
		iSet.add(num02);
		iSet.add(num03);
		iSet.add(num04);
		iSet.add(num05);
		iSet.add(num06);
		
		System.out.println(iSet.size());//
		System.out.println(iSet.toString());//HashSet의 내용
		
		for(Integer num:iSet) {
			System.out.println(num);
		}
		
		*/
	}

}
