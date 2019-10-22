package modelo;

import java.util.Scanner;

public class LlenandoPiscinas {

	public static void main(String[] args) {
		/*
		 * 10 5 1 15 6 1
		   50 5 1 50 5 0
		   50 5 1 50 5 6
		   0 0 0 0 0 0
		 *  */
		
		Scanner scanner = new Scanner(System.in);
		
		String entradaTeclado = scanner.nextLine();
		
		while (!entradaTeclado.equals("0 0 0 0 0 0")) {
			String[] arr = entradaTeclado.split(" ");
			int[] enterosY = new int[arr.length / 2];
			int[] enterosV = new int[arr.length / 2];
			
			int j = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length / 2) enterosY[i] = Integer.parseInt(arr[i]);
				else {
					enterosV[j] = Integer.parseInt(arr[i]);
					j++;
				}
			}
			
			// 10 5 1 15 6 1
			
			int cY = 0;
			int cV = 0;
			
			int n = 0;
			
			int litros = enterosY[1] - enterosY[2];
						
			while (n < enterosY[0]) {
				if (litros < 0) break;
				n += litros;
				cY++;
			}
			
			n = 0;
			litros = enterosV[1] - enterosV[2];
						
			while (n < enterosV[0]) {
				if (litros < 0) break;
				n += litros;
				cV++;
			}
			
			if (cY == cV) System.out.println("EMPATE " + cY);
			else if (cY < cV && cY != 0) System.out.println("YO " + cY);
			else if (cV < cY && cV != 0) System.out.println("VECINO " + cV);
			else if (cY < cV && cY == 0) System.out.println("VECINO " + cV);
			else if (cV < cY && cV == 0) System.out.println("YO " + cY);
			
			entradaTeclado = scanner.nextLine();
		}
		
//		System.out.println("EMPATE 3\nVECINO 10\nYO 13");
	}

}