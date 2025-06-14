package filePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	FileInputStream fin = null;
	FileOutputStream fout = null;

	public FileHandling() throws Exception {
		fin = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Files\\inputfile.txt");
		fout = new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Files\\outputfile.txt");
		int c;
		while ((c = fin.read())!=-1) {
			fout.write(c);// write or copy data to outputfile
		} // -1 indicates no data or end of file 
	}

	public static void main(String[] args) throws Exception {
		new FileHandling();

	}

}
//Basically there are 4 classes that are used to handle text and binary files.
//1. ByteStream -> (InputStream->FileInputStream, OutputStream->FileOutputStream
//2. CharacterStream->(Reader->FileReader and Writer->FileWriter)

