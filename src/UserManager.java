
public class UserManager {
	
	public void add(User user) {
		System.out.println("Kayd�n�z Tamamland�." + user.getEmail()+ "  "+ user.getEmail());
	}
	public void delete(User user) {
		System.out.println("Kayd�n�z Silindi!" + user.getEmail()+ "  "+ user.getEmail());
	}
	public void update(User user) {
		System.out.println("Kayd�n�z G�ncellendi!" + user.getEmail()+ "  "+ user.getEmail());
	}
	
	
	public void add(Student student) {
		System.out.println("Kayd�n�z Tamamland�." + student.getFirstName()+ "  "+ student.getLastName());
	}
	public void delete(Student student) {
		System.out.println("Kayd�n�z Silindi!" + student.getFirstName()+ "  "+ student.getLastName());
	}
	public void update(Student student) {
		System.out.println("Kayd�n�z G�ncellendi!" + student.getFirstName()+ "  "+ student.getLastName());
	}
	
	
	public void add(Instructor instructor) {
		System.out.println("Kayd�n�z Tamamland�." + instructor.getFirstName()+ "  "+ instructor.getLastName());
	}
	public void delete(Instructor instructor) {
		System.out.println("Kayd�n�z Silindi!" + instructor.getFirstName()+ "  "+ instructor.getLastName());
	}
	public void update(Instructor instructor) {
		System.out.println("Kayd�n�z G�ncellendi!" + instructor.getFirstName()+ "  "+ instructor.getLastName());
	}
}
