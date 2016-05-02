package edu.saintjoe.cs.brianc.realworld;

public class StudentDriver {

	public static void main(String[] args) {
		// See what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student nextStudent = new Student("Wiley Abbott", "M", 1, 18, 1, "May", 2, 1997);
		// To put data into our private array, we had to write a mutator
		//  We pass it a filled-in Student record, and our "counter" which is studentCount
		cmp112.setStudent(nextStudent, (studentCount++));
		nextStudent = new Student("Jim Ballew", "M", 2, 19, 2, "January", 18, 1996);
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Christine Black", "F", 1, 20, 3, "December", 20, 1995);
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Zach Bobos","M",1,19, 3, "October", 24, 1996);
		cmp112.setStudent(nextStudent, studentCount++);
		System.out.println(cmp112.toString()); 

	}

}
