package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\bird.jpg");
		FileOutputStream fw = new FileOutputStream("D:\\bird1.jpg");
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();

	}

}
