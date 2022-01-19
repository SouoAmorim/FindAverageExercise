package exercise;

public class Main {


	public static void main(String[] args) {

		Logic app = new Logic();

		app.run(); //this method can be recalled because it will wipe the old list.

		System.out.println("---");

		app.getListValues();

		System.out.println("---");

		app.getAverage();

		System.out.println("---");

		app.run(); //wipes list and asks for new inputs.

		System.out.println("---");

		app.getListValues();

	}

}
