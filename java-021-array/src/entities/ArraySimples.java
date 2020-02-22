package entities;

import java.util.Random;

public class ArraySimples {

	public static void main(String[] args) {

		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
		String[] nipes = { "Espadas", "Paus", "Copas", "Ouros" };

		Random r = new Random();

		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		int indiceNaipe = r.nextInt(nipes.length);
		String naipe = nipes[indiceNaipe];

		System.out.println(face + " " + naipe);

	}

}
