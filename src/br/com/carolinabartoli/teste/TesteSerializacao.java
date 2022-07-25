package br.com.carolinabartoli.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.carolinabartoli.bean.Cliente;

public class TesteSerializacao {
	
	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente("Carolina",1);
		FileOutputStream output = new FileOutputStream("objeto.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(output);
		
		out.writeObject(cliente);
		
		out.close();
	}

}
