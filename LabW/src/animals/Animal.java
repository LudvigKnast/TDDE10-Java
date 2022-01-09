package animals;

public class Animal {
	public String name;
	public int age; 
	private static int currentYear;
	private int birthyear;
	public Animal(String name, int age){
		this.name = name; this.age = age;
		this.birthyear = Animal.currentYear - age;
	}
	public int getAge() {
		return Animal.currentYear - this.birthyear;
	}
	public static void setYear(int currentYear) {
		Animal.currentYear = currentYear;
	}
		public void introduceYourself(){
			System.out.println("Morr. Jag är ett djur som heter " + this.name + ".");
			System.out.println("Jag är " + this.age + " år gammal.");
		}
	}
