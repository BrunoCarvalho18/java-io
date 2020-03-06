package br.com.io;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Cliente cliente = new Cliente();
		//cliente.setNome("Bruno");
		//cliente.setProfissao("Dev");
		//cliente.setCpf("42304200900");
		
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		//oos.writeObject(cliente);
		//oos.close();
		
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente =(Cliente) ios.readObject();
		ios.close();
		System.out.println(cliente.getCpf());
		
	}

}
