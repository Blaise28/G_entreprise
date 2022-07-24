package m_saisie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Saisie {

	// methode pour la saisie des entiers et des chaines

	private static BufferedReader in = null;

	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public static int saisirEntier(String message) {
		int a = 0;
		String val = "";
		System.out.println(message);
		do {
			try {

				val = in.readLine();
				a = Integer.parseInt(val);
				break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException ex) {
				System.out.println("Tapez s'il vous plait un entier!!!");
			}
		} while (true);

		return a;
	}

	public static String saisirchaine(String mes) {

		String val = "";
		if (in != null) {
			System.out.println(mes);
			try {
				val = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return val;
	}
}
