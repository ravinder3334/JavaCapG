package com.capg.work;

import java.io.IOException;

public class Mythrows {

	void m() throws IOException  {
		throw new IOException(); // Unchecked exception
		// when we give checked exceptions it do not propagate through methods.
	}
	void n() throws IOException {
		m();
		
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
	public static void main(String[] args) {
		Mythrows n = new Mythrows();
		n.p();
		System.out.println("Ending");
	}
}
