package com.javaex.ex08;

public class Point {

	private int x;
	private int y;
	
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result;
		
		Point p =(Point)obj;
		if(this.x==p.x&&this.y==p.y) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
				
	}
	
	@Override //04.pptx_17pqge. hashcode를 재정의 해줘야 우리가 재정의한 equels로 넘어가서 비교할수 있음.
	public int hashCode() {
		int result = x+y;
		return result;
	}
	
	
	

	
}
