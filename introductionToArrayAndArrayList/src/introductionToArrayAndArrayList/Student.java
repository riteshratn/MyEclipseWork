package introductionToArrayAndArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name=name;
		this.marks=marks;
	}

	public int getNumberOfMarks() {
		
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum=0;
	for(int mark:marks) {
		sum+=mark;
	}
		return sum;
	}

	public int getMaximumMark() {
		int maximum=0;
		for(int mark:marks) {
			if(mark>maximum) {
				maximum=mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum=Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<minimum) {
				minimum=mark;
			}
		}
		
		return minimum;
	}

	public BigDecimal getAverageMark() {
		 int sum= getTotalSumOfMarks();
		 int number=getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);
	}

	public void addNewMark(int mark) {
	marks.add(mark);
		
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}
	
	
	

	
}
  
