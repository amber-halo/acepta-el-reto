package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YongeStreet {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<>();
//		lista1.add("A");
//		lista1.add(".");
//		lista1.add("|");
//		lista1.add(".");
//		lista1.add("B");
		
//		lista1.add("A");
//		lista1.add("B");
//		lista1.add(".");
//		lista1.add(".");
//		lista1.add("C");
//		lista1.add("|");
		
		List<Integer> lista2 = new ArrayList<>();
//		lista2.add(1);
//		lista2.add(2);
//		lista2.add(3);
//		lista2.add(4);
//		lista2.add(5);
		
//		lista2.add(6);
//		lista2.add(5);
//		lista2.add(4);
//		lista2.add(3);
//		lista2.add(1);
		
		List<List<String>> listasSemaforos = new ArrayList<>();
		List<List<Integer>> listasConsultas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		String entradaTeclado = scanner.nextLine();
		
		while (!entradaTeclado.isEmpty()) {
			String[] arr = entradaTeclado.split(" ");
			listasSemaforos.add(Arrays.asList(arr));
			
			entradaTeclado = scanner.nextLine();
			
			List<Integer> aux = new ArrayList<>(); 
			String[] arr1 = entradaTeclado.split(" ");
			
			for (String string : arr1) {
				aux.add(Integer.parseInt(string));
			}
			
			listasConsultas.add(aux);
			
			entradaTeclado = scanner.nextLine();
		}
		
		System.out.println(listasSemaforos);
		
		List<String> resultados = new ArrayList<>();

		for (List<String> list : listasSemaforos) {	
			
			int index1 = 0;
			String salida = "";
			
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals("|")) {
					String puntos = "";
					String letras = "";
					for (int j = index1; j < i; j++) {
						if (list.get(j).equals(".")) {
							puntos += ".";
						} else {
							letras += list.get(j);
						}
					}
					salida += puntos + letras + "|";
					index1 = i + 1;
				}
			}
			
			for (int i = index1; i < list.size(); i++) {			
				salida += ".";
			}
			
//			System.out.println(salida);
			resultados.add(salida);
		}
		
		System.out.println(resultados);
		
		int k = 0;
		for (List<Integer> list : listasConsultas) {
			String salidaT = "";
			
			for (int i = 0; i < list.size(); i++) {
				salidaT += resultados.get(k).charAt(i);
			}
			k++;
			
			System.out.println(salidaT);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		///////////////////// PRUEBAS //////////////////////////////
		
//		for (int i = 0; i < lista1.size(); i++) {
//			if (lista1.get(i).equals("|")) {
//				String puntos = "";
//				String letras = "";
//				for (int j = index1; j < i; j++) {
//					if (lista1.get(j).equals(".")) {
//						puntos += ".";
//					} else {
//						letras += lista1.get(j);
//					}
//				}
//				salida += puntos + letras + "|";
//				index1 = i + 1;
//			}
//		}
		
//		for (int i = index1; i < lista1.size(); i++) {
//			String puntos = "";
//			String letras = "";
//			if (lista1.get(i).equals(".")) {
//				puntos += ".";
//			} else {
//				letras += lista1.get(i);
//			}
//			salida += puntos + letras;
			
//			salida += ".";
//		}
		
//		System.out.println(salida);
		
		////////////////////////////////////////////////////////////////
		
//		String salidaT = "";
//		
//		for (int i = 0; i < lista2.size(); i++) {
//			salidaT += salida.charAt(lista2.get(i) - 1);
//		}
//		
//		System.out.println(salidaT);
		
	}

}
