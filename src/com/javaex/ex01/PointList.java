package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
//필드
	private Point[] pArray;
	private int crtPos;
	
//생성자
	public PointList() {
		//편의상 가정하여 만듦.원래는 안만듦.
		pArray = new Point[3];
		crtPos = 0;
	}
	
//메소드-gs
//메소드-일반
	public void add(Point p) {
		//현재배열개수+1 하여 배열을 새로만듦.
		//이전배열의 값을 새 배열에 옮김.
		//마지막방에 새주소를 추가한다.
		//배열새로만들고 이전것 복사하고 받은것 
		pArray[crtPos]= p;
		//crtPos = crtPos + 1;
		crtPos += 1;
	}
	public int size() {
		return crtPos;
	}
	public Point get(int index) {
		return pArray[index]; //index방 안에 있는 Point 주소
	}

	
	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
}
