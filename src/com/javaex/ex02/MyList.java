package com.javaex.ex02;

import com.javaex.ex01.Point;

public class MyList {
	//필드
	private Object[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		//편의상 가정하여 만듦.원래는 안만듦.
		oArray = new Object[3];
		crtPos = 0;
	}
	
	//메소드-gs
	//메소드-일반
		public void add(Object o) {
			//현재배열개수+1 하여 배열을 새로만듦.
			//이전배열의 값을 새 배열에 옮김.
			//마지막방에 새주소를 추가한다.
			//배열새로만들고 이전것 복사하고 받은것 
			oArray[crtPos]= o;
			//crtPos = crtPos + 1;
			crtPos += 1;
		}
		
		public int size() {
			return crtPos;
		}
		public Object get(int index) {
			return oArray[index]; //index방 안에 있는 Point 주소
		}
	
	
}
