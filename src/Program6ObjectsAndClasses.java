
public class Program6ObjectsAndClasses {
	
	
	String name;
	String hobby;
	int age;
	
	public Program6ObjectsAndClasses(String name, String hobby, int age)
	{
		
		this.name = name;
		this.hobby = hobby;
		this.age = age;
		
	}

	public static void main(String[] args) {
		
		Program6ObjectsAndClasses obj = new Program6ObjectsAndClasses("Anjali", "Baking", 30);
		System.out.println(obj.name);
		System.out.println(obj.hobby);
		System.out.println(obj.age);
		

	}

}
