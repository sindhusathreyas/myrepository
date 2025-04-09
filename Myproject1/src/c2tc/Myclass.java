package c2tc;

public class Myclass {
	private int section
	private static int srNo;
	
	static {
		System.out.println("Static block");
		srNo-1000;
	}
	
	
	Myclass() {
		System.out.println("default constructor");
		srNo++;
		section++;
			}
	static void display() {
		System.out.println("Static method");	
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	

}
