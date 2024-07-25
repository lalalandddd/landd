package java0718_Facade;

public class Computer {
    // �ν��Ͻ� ����
	private CPU cpu;
	private Memory memory;
	private DISK disk;

    // ������ ����
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk= new DISK();
	}

    // cpu,�޸�,��ũ Ŭ���� �޼��� ȣ�� ����
	public void startup() {
		System.out.println("��ǻ�� �����ϴ� ��...");
		cpu.start();
		memory.load();
		disk.spinUp();
		System.out.println("ȯ���մϴ�.");        
	}
}
