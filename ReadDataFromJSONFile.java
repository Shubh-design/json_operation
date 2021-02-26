package jsonproject.jsonproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {
private static int j=0;

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser=new JSONParser();
	
		/*File folder = new File("E:\\jsonfiles");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        //System.out.println(file.getName());
		    	FileReader reader1=new FileReader(file.getAbsolutePath());
		    	Object obj1=jsonparser.parse(reader1);
		    	JSONObject d1=(JSONObject)obj1;
		    	JSONArray array1=(JSONArray)d1.get("strikers");
		    	array1.add(j, listOfFiles);
		   j++;
		   if(listOfFiles.equals(null)) {
		    	try (FileWriter file1 =new FileWriter("E:\\merge1.json")){
		    		int k=0;
					file1.write(array1.get(k).toString());
					
				for(int i=0;i<array1.size();i++)
					file1.write(array1.get(i).toString());
				for(int i=0;i<array3.size();i++)
					file.write(array3.get(i).toString());
			
					file1.flush();
	
			catch(IOException e)
			{
				e.printStackTrace();
			}*/

		FileReader reader1=new FileReader("E:\\jsonfiles\\data1.json");
		FileReader reader2=new FileReader("E:\\jsonfiles\\data2.json");
		FileReader reader3=new FileReader("E:\\jsonfiles\\data3.json");
		Object obj1=jsonparser.parse(reader1);
		Object obj2=jsonparser.parse(reader2);
		Object obj3=jsonparser.parse(reader3);
		JSONObject d1=(JSONObject)obj1;
		JSONObject d2=(JSONObject)obj2;
		JSONObject d3=(JSONObject)obj3;
		JSONArray array1=(JSONArray)d1.get("strikers");
		JSONArray array2=(JSONArray)d2.get("strikers");
		JSONArray array3=(JSONArray)d3.get("strikers");
		//to check whether our output is desired or not
		String name1,name2,name3,club1,club2,club3;
		System.out.println("strikers:");
		for(int i=0;i<array1.size();i++)
		{
		JSONObject strikers=(JSONObject)array1.get(i);
		name1=(String)strikers.get("name");
		club1=(String)strikers.get("club");
		System.out.println("name:"+name1);
		System.out.println("club:"+club1);
		}
		for(int i=0;i<array2.size();i++)
		{
		JSONObject strikers=(JSONObject)array2.get(i);
		name2=(String)strikers.get("name");
		club2=(String)strikers.get("club");
		System.out.println("name:"+name2);
		System.out.println("club:"+club2);
		}
		for(int i=0;i<array3.size();i++)
		{
		JSONObject strikers=(JSONObject)array3.get(i);
		name3=(String)strikers.get("name");
		club3=(String)strikers.get("club");
		System.out.println("name:"+name3);
		System.out.println("club:"+club3);
		}
		//writing to a merge1.json
		try (FileWriter file =new FileWriter("E:\\jsonfiles\\merge1.json")){
	
				file.write(d1.toString());
			for(int i=0;i<array2.size();i++)
				file.write(array2.get(i).toString());
			for(int i=0;i<array3.size();i++)
				file.write(array3.get(i).toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
