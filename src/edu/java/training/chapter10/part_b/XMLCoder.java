package edu.java.training.chapter10.part_b;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import edu.java.training.chapter4.plane.Plane;

public class XMLCoder {

	public void saveObjectToXML(Plane plane) {
		try (XMLEncoder xmlEncoder = new XMLEncoder(
				new BufferedOutputStream(new FileOutputStream("resources/plane" + plane.getRegNum() + ".xml")))) {
			xmlEncoder.writeObject(plane);
			xmlEncoder.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Plane getObjectFromXML(String regNum) {
		Plane plane = null;
		try (XMLDecoder xmlDecoder = new XMLDecoder(
				new BufferedInputStream(new FileInputStream("resources/plane" + regNum + ".xml")))) {
			plane = (Plane) xmlDecoder.readObject();
			System.out.println(plane);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return plane;
	}
}