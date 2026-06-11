package com.kodewala.comparator;

import java.util.Comparator;


public class AgeComparator  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int result=0;
		if(o1.getAge()<o2.getAge())
			result=-1;
		else if(o1.getAge()<o2.getAge())
			result=1;
		else
			result =0;
		return result;
	}

}
