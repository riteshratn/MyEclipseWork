package inherit;

public class StudentRunner {

	public static void main(String[] args) {
		// Student s=new Student();
		// s.setName("Ritesh_Kumar");
		// s.setEmail("ritesh12@gmail.com");

		/*
		Person p = new Person();
		p.setName("Ritesh_Kumar");
		p.setEmail("ritesh12@gmail.com");
		p.setPhoneNumber("12345667");

		
		String value = p.toString();
		System.out.println(value);
		System.out.println(p);
		*/

		Employee e = new Employee();
		e.setName("Ritesh_Kumar");
		e.setEmail("ritesh12@gmail.com");
		e.setPhoneNumber("12345667");
		e.setEmployeeGrade('A');
		e.setTitle("Programmer");

		System.out.println(e);

	}

}
