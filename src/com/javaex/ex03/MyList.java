package com.javaex.ex03;

public class MyList<T> {
	//필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		//편의상 가정하여 만듦.원래는 안만듦.
		oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
	//메소드-gs
	//메소드-일반
		public void add(T o) {
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
		public T get(int index) {
			return oArray[index]; //index방 안에 있는 Point 주소
		}
	
	
}
