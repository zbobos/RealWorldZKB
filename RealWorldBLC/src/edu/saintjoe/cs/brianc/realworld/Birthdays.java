package edu.saintjoe.cs.brianc.realworld;

public class Birthdays {

	public String month;
	public int day;
	public int year;
	
	public void Student(String newMonth, int newDay, int newYear) {
		month = newMonth;
		day = newDay;
		year = newYear;		
	}

	public void setMonth(String newMonth) {
	} {
		month = getMonth();
	}
	public String getMonth(){
		return month;
	}
	public void setDay(int newDay) {
		day = newDay;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int newYear) {
		year = newYear;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		return ("Month: " + month + " Day: " + day + " Year: " + year);
	}
}
	