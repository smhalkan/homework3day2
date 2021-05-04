
public class StudentManager extends UserManager {
	
	public void add(Student  student) {
	
		System.out.println("Sisteme " + student.getFirstName() + " isimli öðrenci eklendi.");
	}
	
	public void delete(Student  student) {
		System.out.println("Sistemden " + student.getFirstName() + " isimli Öðrenci silindi.");
	}
	
	public void update(Student  student) {
		System.out.println("Sistemde " + student.getFirstName() + " isimli Öðrenci ile ilgili güncelleme gerçekleþti.");
	}
	
}
