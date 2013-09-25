package org.kyle.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileAppendTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		FileManager a = new FileManager("a.txt", new char[]{'\n'});
		FileManager b = new FileManager("b.txt", new char[]{'\n', ' '});
		FileWriter c = new FileWriter("c.txt");
		String aWord = null;
		String bWord = null;
		while((aWord = a.nextWord()) != null){
			c.write(aWord + "\n");
			bWord = b.nextWord();
			if(bWord != null)
				c.write(bWord + "\n");
		}
		
		while((bWord = b.nextWord()) != null){
			c.write(bWord + "\n");
		}
		c.close();
	}

}


class FileManager{
	String[] words = null;
	int pos = 0;
	
	public FileManager(String fileName, char[] seperators) throws Exception{
		File file = new File(fileName);
		FileReader reader = new FileReader(file);
		char[] buf = new char[(int)file.length()];
		int len = reader.read(buf);
		String results = new String(buf, 0, len);
		String regex = null;
		if(seperators.length > 1){
			regex = "" + seperators[0] + "|" + seperators[1];
		}else{
			regex = "" + seperators[0];
		}
		
		words = results.split(regex);
		
	}
	
	public String nextWord(){
		if(pos == words.length)
			return null;
		return words[pos++];
	}
}