package Odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.CompanyName="Samsung";
		instructor1.name="Engin";
		instructor1.id=99;
		
		Student student1 = new Student();
		student1.name= "Batuhan";
		student1.id=88;
		student1.Level="orta seviye";
		
		
		System.out.println(instructor1.CompanyName);
		System.out.println(instructor1.name);
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.hosgeldin(student1);
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.add(student1);
		
		InstructorManager instructor = new InstructorManager();
		instructor.add(instructor1);
		
		System.out.println("------------------");
		
		
		User[] users = new User[] {instructor1,student1}; 
		for(User user:users) {
			userManager.hosgeldin(user);
		}
		
		
	}
}
