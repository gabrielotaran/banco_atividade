package BancoSantoAndre;

import java.util.ArrayList;

public class Lista {

	private static ArrayList<String> cliente;

	public static void main(String[] args) {
		ArrayList<String> Gerente = new ArrayList<String>();
		setCliente(new ArrayList<String>());
		
		Gerente.add("Frank Sinatra");
		Gerente.add("M-key T-Rath");
		Gerente.add("Relampago Marquinhos");
		
		Cliente.add("Fiuk");
		Cliente.add("Péricles");
		

	}

	public static ArrayList<String> getCliente() {
		return cliente;
	}

	public static void setCliente(ArrayList<String> cliente) {
		Lista.cliente = cliente;
	}

}
