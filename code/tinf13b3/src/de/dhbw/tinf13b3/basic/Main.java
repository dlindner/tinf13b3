package de.dhbw.tinf13b3.basic;

import java.util.ArrayList;
import java.util.List;

public final class Main {

	private Main() {
		super();
	}
	
	public static void main(String[] args) {
		final Scientist scientist0 = new Newton();
		final Einstein scientist1 = new Einstein();

		final List<Scientist> scientists = new ArrayList<Scientist>();
		scientists.add(scientist0);
		scientists.add(scientist1);
		
		scientist0.research();
		scientist1.research();
		for (int i = 0; i < scientists.size(); i++) {
			Scientist each = scientists.get(i);
			each.research();
		}

		final DHBW university = new DHBW();
		university.invite(scientist0);
		university.invite((Scientist) scientist1);
		for (int i = 0; i < scientists.size(); i++) {
			university.invite(scientists.get(i));
		}
	}
}
