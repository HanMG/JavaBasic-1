package pjtTest2;

public class InterfaceClass implements InterfaceA, InterfaceB{
	

	public InterfaceClass() {
		System.out.println("--InterfaceClass--");
	}

	@Override
	public void funB() {
		System.out.println("--funA()--");
		
	}

	@Override
	public void funA() {
		System.out.println("--funB()--");
		
	}
}
