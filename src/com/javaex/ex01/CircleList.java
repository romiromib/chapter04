package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
//필드
	private Circle[] cArray;
	private int crtPos;
	
//생성자	
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
//메소드 gs
		
//메소드 일반	
		public void add(Circle c) {
			//현재배열개수+1 하여 배열을 새로만듦.
			//이전배열의 값을 새 배열에 옮김.
			//마지막방에 새주소를 추가한다.
			//배열새로만들고 이전것 복사하고 받은것 
			cArray[crtPos]= c;
			//crtPos = crtPos + 1;
			crtPos += 1;
		}
		
		
		public int size() {
			return crtPos;
		}
		public Circle get(int index) {
			return cArray[index];
		}

		
		
		@Override
		public String toString() {
			return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
		}
		
		
		
		

		
	}
	

