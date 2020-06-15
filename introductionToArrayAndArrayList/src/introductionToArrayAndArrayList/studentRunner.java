package introductionToArrayAndArrayList;

import java.math.BigDecimal;

public class studentRunner {

	public static void main(String[] args) {
		int[] marks={97,98,100};
		Student student=new Student("Ritesh",marks);
		int number=student.getNumberOfMarks();
				System.out.println("number of marks : " +number);
				
				int sum=student.getTotalSumOfMarks();
				System.out.println("number of marks : " +sum);
				
				int maximumMark=student.getMaximumMark();
				System.out.println("maximum of marks : " +maximumMark);
				
				
				int minimumMark=student.getMinimumMark();
				System.out.println("minimum of marks : " +minimumMark);
				
				BigDecimal average=student.getAverageMark();
				System.out.println("average of marks : " +average);
				
				student.addNewMark(35);
				System.out.println(student);
				
				student.removeMarkAtIndex(1);
				System.out.println(student);
	}

}
