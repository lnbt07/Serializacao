package br.com.carolinabartoli.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.carolinabartoli.bean.Cliente;

public class TesteDeserializacao {

	public static void main(String[] args) throws Exception {

		FileInputStream input = new FileInputStream("objeto.txt");
		ObjectInputStream stream = new ObjectInputStream(input);
		
		Cliente cliente = (Cliente) stream.readObject();
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
	}

}
