package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globaldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("/home/abhishek/eclipse-workspace/testngwork/data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("firstname"));
		prop.setProperty("firstname", "anurag");
		System.out.println(prop.getProperty("firstname"));
		FileOutputStream fos=new FileOutputStream("/home/abhishek/eclipse-workspace/testngwork/data.properties");
		prop.store(fos, null);

	
	
	}

}
