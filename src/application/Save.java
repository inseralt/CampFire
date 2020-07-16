package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Save {

	public static void sauvegarder(Data data) {
		try {
			FileOutputStream res = new FileOutputStream("sauvegarde");
			ObjectOutputStream ext = new ObjectOutputStream(res);
			ext.writeObject(data);
			ext.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("rr");
		}
	}

	public static Data charger() {
		Data data = null;
		try {
			FileInputStream res = new FileInputStream("sauvegarde");
			ObjectInputStream ext = new ObjectInputStream(res);
			data = (Data) ext.readObject();
			ext.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("rr");
		}
		return data;
	}
}
