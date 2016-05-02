package edu.saintjoe.cs.brianc.realworld;

public class Course {
	
	// These next two pieces of data are static, and thus NOT instance variables
	public static final int MAXSTUDENTS = 25;
	// Create a new array instance and simultaneously assign the first 5 elements
	public static String[] classYrNames = {"ImpossibleClassYear", "Freshman", "Sophomore", "Junior", "Senior", "Special"};
	public static String[] LetterGrade = {"impossible", "C", "B", "A"};
	// public static String classYrNames = new String[5];
	// classYrNames[0] = "ImpossibleClassYr";
	
	/* Begin instance variables (aka data members) */
	private String title;
	private String teacher;
	private Student[] students;
	private String room;
	
	
	/* Data members above, methods below */
	
	// This is a String, String, int, int constuctor
	public Course (String newTitle, String newTeacher, String newRoom) {
		students = new Student[MAXSTUDENTS];
		title = newTitle;
		teacher = newTeacher;
		room = newRoom;
	}
	
	// This is a two-string constructor
	public Course(String newTitle, String newRoom) {
		students = new Student[MAXSTUDENTS];
		title = newTitle;
		room = newRoom;
	}
	
	// Mutator put in for the sake of my CMP112 students
	public void setStudent(Student newStudent, int whereAt) {
		// An important test is needed!!!!
		if (whereAt > ( MAXSTUDENTS -1 )) {
			System.out.println("You are a major idiot!!");
			return;
		}
		students[whereAt] = newStudent;
	}
	
	public String toString() {
		
		String output = "";
		output = "Class information for " + title + " taught by: " + teacher + " meeting in Room: " + room + "\n";
		
		for (Student oneStudent: students) {
			if (oneStudent == null)
				break;
			output += oneStudent.getName() + " " + oneStudent.getGender() + " " + classYrNames[oneStudent.getClassYr()] + " " + oneStudent.getAge()+ " " + LetterGrade[oneStudent.getLetterGrade()]  + oneStudent.getMonth() + oneStudent.getDay() + oneStudent.getYear() +"\n";
			}
		return output;
	}
	
	
	
}
