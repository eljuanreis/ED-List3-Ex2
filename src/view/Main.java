package view;

import controller.StackController;

public class Main {

	public static void main(String[] args) {
		try {
			StackController.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
