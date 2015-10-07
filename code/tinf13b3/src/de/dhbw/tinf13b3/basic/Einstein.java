package de.dhbw.tinf13b3.basic;

public class Einstein extends Scientist {
	
	public Einstein() {
		super();
	}
	
	@Override
	public void research() {
		System.out.println("M1: sort patents... do physics... sort patents");
	}

	@Override
	public void relevation() {
		System.out.println("M2: everything is relatively better than here!");
	}
}
