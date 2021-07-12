package com;
import java.io.File ;
import java.io.FileReader;
import java.io.FileWriter;
import com.sun.source.tree.CatchTree;
public class testReadwrite {
  public static void main(String[] args) {
   //	String text = "Hello evvryone, This a  Java FSD course";

	  //   try {
//	FileWriter	 writer = new FileWriter("demo txt");
//		    writer.write(text); 
//			writer.flush();
//			writer.close();
// }catch(Exception e) {
//  	e.printStackTrace();
//	  } 
 try {
//	ensure the file is created inside the project parent direc tory
	 FileReader reader =new FileReader("demo.txt");
	FileWriter writer =new FileWriter("hello.txt");
    int c = 0;
	while(( c= reader.read()) != -1) {
    writer.write(c);
    writer.flush();
	 }
	 writer.close();	 
     reader.close();
	System.out.println("....Done....");
	} catch (Exception e) {
	e.printStackTrace();
}
 }
 
 
		
	
	}
	}
} 
 
  }
}

