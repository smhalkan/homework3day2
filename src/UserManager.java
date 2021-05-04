
public class UserManager {
	
	public void add(User user) {
		System.out.println("Kaydýnýz Tamamlandý." + user.getEmail()+ "  "+ user.getEmail());
	}
	public void delete(User user) {
		System.out.println("Kaydýnýz Silindi!" + user.getEmail()+ "  "+ user.getEmail());
	}
	public void update(User user) {
		System.out.println("Kaydýnýz Güncellendi!" + user.getEmail()+ "  "+ user.getEmail());
	}
	
	
	public void add(Student student) {
		System.out.println("Kaydýnýz Tamamlandý." + student.getFirstName()+ "  "+ student.getLastName());
	}
	public void delete(Student student) {
		System.out.println("Kaydýnýz Silindi!" + student.getFirstName()+ "  "+ student.getLastName());
	}
	public void update(Student student) {
		System.out.println("Kaydýnýz Güncellendi!" + student.getFirstName()+ "  "+ student.getLastName());
	}
	
	
	public void add(Instructor instructor) {
		System.out.println("Kaydýnýz Tamamlandý." + instructor.getFirstName()+ "  "+ instructor.getLastName());
	}
	public void delete(Instructor instructor) {
		System.out.println("Kaydýnýz Silindi!" + instructor.getFirstName()+ "  "+ instructor.getLastName());
	}
	public void update(Instructor instructor) {
		System.out.println("Kaydýnýz Güncellendi!" + instructor.getFirstName()+ "  "+ instructor.getLastName());
	}
}
