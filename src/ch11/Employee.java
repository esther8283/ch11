package ch11;import java.util.Objects;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Emplayee(" + eno + ") 가 메모리에 생성됨");
	}
	
	public void finalize() {
		System.out.println("Emplayee(" + eno + ") 가 메모리에서 제거됨");
	}
}