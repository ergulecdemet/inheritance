package odevUc;

public class instructorManager {
	public void information(Instructor instructor) {
		System.out.println("*****************ÖĞRETMEN***********************\n");

		System.out.println(instructor.enrolledStudents+" öğrenciniz mevcut.\n"
				+instructor.lesoons+" tane ders sisteme yüklediniz.\n");
		System.out.println("----------------------------------\n");

	}
	

}
