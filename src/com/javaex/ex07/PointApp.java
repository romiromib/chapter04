package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
	
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet.toString());

		Point p04 = new Point(3,6);  
		pSet.add(p04);
		System.out.println(pSet.toString()); //Set에서 다르다고 인식함.object의 Set이기 때문에..
											 //->다르다고 인식하도록 하려면 Point에서 재정의가 필요함.
		for(Point p : pSet) {
			System.out.println(p.hashCode()); //hashcode가 재정의해준걸로 바뀐걸 볼수 있다
		}
		
		
	}

}
