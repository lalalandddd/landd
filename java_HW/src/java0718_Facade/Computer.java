package java0718_Facade;

public class Computer {
    // 인스턴스 변수
	private CPU cpu;
	private Memory memory;
	private DISK disk;

    // 생성자 구현
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk= new DISK();
	}

    // cpu,메모리,디스크 클래스 메서드 호출 실행
	public void startup() {
		System.out.println("컴퓨터 시작하는 중...");
		cpu.start();
		memory.load();
		disk.spinUp();
		System.out.println("환영합니다.");        
	}
}
