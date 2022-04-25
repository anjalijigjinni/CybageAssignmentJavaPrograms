
public class InheritanceChild extends InheritanceParent {

	public InheritanceChild() {

		super();

	}

	String str1 = "child variable";

	public void childNonStaticMethod() {

		System.out.println("I am child class non static method");

	}

	public static void childStaticMethod() {
		
		System.out.println("I am child class from static method");

	}

	public static void main(String[] args) {
		
		
		InheritanceChild ic = new InheritanceChild();
		System.out.println(" Non static Integer variable from parent class " + ic.a); // parentclass variable
		System.out.println("Static variable from parent class " + s);
		System.out.println( "Non static String variable from child class " + ic.str1);
		childStaticMethod();
		parentStaticMethod();
		ic.parentNonStaticMethod();
		ic.childNonStaticMethod();
		

	}

}
