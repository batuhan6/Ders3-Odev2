package Odev2;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println( user.name + " kursa katildi" );
	}
}
