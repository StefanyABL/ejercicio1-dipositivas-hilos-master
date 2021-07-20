package runner;

import logica.ExampleThread;

public class Runner {
	public static void main(String[] args) {
		ExampleThread thReadOne= new ExampleThread("Hilo uno");
		ExampleThread thReadTwo= new ExampleThread("Hilo Dos");
		thReadOne.start();
		thReadTwo.start();
	}
}
