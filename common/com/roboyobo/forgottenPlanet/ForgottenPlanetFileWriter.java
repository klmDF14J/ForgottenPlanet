package com.roboyobo.forgottenPlanet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ForgottenPlanetFileWriter {
	public static void saveObjectToFile(String fileToSave, Object objectToWrite) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileToSave + ".fpd"));
		oos.writeObject(objectToWrite);
		oos.close();
	}
	
	public static Object readBooleanFromFile(String fileToOpen, Object objectToOpen) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois;
		ois = new ObjectInputStream(new FileInputStream(fileToOpen));
		objectToOpen = (String) ois.readObject();
		ois.close();
		return objectToOpen;
	}
}
