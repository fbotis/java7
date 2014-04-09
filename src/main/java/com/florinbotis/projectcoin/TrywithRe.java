package com.florinbotis.projectcoin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class TrywithRe {
	public static void main(String[] args) {
		try (OutputStream out = new FileOutputStream(new File("sadfas"));
				InputStream is = new URL("wsfas").openStream()) {
			byte[] buf = new byte[4096];
			int len;
			while ((len = is.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
