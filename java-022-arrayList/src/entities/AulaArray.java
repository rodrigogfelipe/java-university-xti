package entities;

import java.util.ArrayList;

public class AulaArray {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add(0,"Amarelo");
		cores.add("Amarelo");
		cores.add("Azul");
		System.out.println(cores.toString());
		
		System.out.println("Tamanho=" + cores.size());/*Tamanho da quantidade de elementos*/
		System.out.println("Elemento " + cores.get(2));/*posicao do elemento*/
		System.out.println("Indice " + cores.indexOf("Branco"));/*cores.indexOf verificar index do Branco*/
		
		cores.remove("Branco");/*Remove o elemento*/
		
		/*Metado contains tem a função de boolean true ou false */
		System.out.println("Tem cor amarelo? " + cores.contains("Amarelo"));

	}

}
