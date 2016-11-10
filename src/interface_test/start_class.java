package interface_test;

import system_class_package.SQL_Class;

import java.io.IOException;

import javax.swing.JFrame;

public class start_class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("xui");
		System.out.println(SQL_Class.readInt32("select count(*) from testt"));
		TestForm window = new TestForm();
		window.frame.setVisible(true);
	}

}
