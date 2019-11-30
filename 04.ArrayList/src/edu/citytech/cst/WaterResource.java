package edu.citytech.cst;

public class WaterResource implements AutoCloseable {

	public void on() {
		System.out.println("Water is on, dont forget to turn it off");
	}

	public void off() {
		System.out.println("Turning off resource");
	}

	@Override
	public void close() throws Exception {

		
		this.off();
	}

}
