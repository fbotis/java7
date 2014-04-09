package com.florinbotis.projectcoin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.omg.CORBA.portable.ApplicationException;

public class Exc {
	public static void main(String[] args) {
		File f = new File("xadas");
		try {
			FileInputStream stream = new FileInputStream(f);
			stream.available();
			throw new ApplicationException("", null);
		} catch (IOException | ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
