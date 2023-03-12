package Student_management;

import java.util.ArrayList;
import java.util.List;

public class class_infor {
	private List<student_infor> liststudent = new ArrayList<>();

	public void add_new_student(student_infor student) {
		liststudent.add(student);
	}

	public void displays_student() {
		System.out.println("List student là: ");
		for (student_infor i : liststudent) {
			System.out.println(i.getName() + "-" + i.getAge() + "-" + i.getAddress());
		}
	}

	public void checkCondition_student() {
		for (student_infor i : liststudent) {
			if (i.getAge() == 23 && i.getAddress() == "Đà Nẵng") {
				System.out.println("Thông tin student đủ điều kiện là: ");
				System.out.println(i.getName() + "-" + i.getAge() + "-" + i.getAddress());
			}

		}
	}
}
