package random;

public class Test {
	public static void main(String[] args) {
	
		String x = "John";
		String y = "John";
		
		String a = new String("John");
		String b = new String("John");
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Person p1 = new Person("John");
		Person p2 = new Person("John");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}
}


class Person{
	private String name;
	
	Person (String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

	
	
