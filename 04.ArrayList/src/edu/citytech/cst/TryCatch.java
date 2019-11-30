package edu.citytech.cst;

public class TryCatch {

	public static void main(String[] args) {

		try (WaterResource w = new WaterResource();) {

			w.on();
			int salary = 100 / 6;
			String name = null;
			name.toUpperCase();

			w.off();
		} catch (ArithmeticException a) {
			System.out.println("Email Manager");
		}

		catch (NullPointerException n) {

			System.out.println("Email Administrator");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
