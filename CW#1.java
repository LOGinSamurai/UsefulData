import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;
public class TestApplicationJava {

	public static void main(String[] args) {
		
		final String ENDPOINT = "http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=643de6e2612540764f204114e57b4823";
		try{
			Scanner in = new Scanner(new URL(ENDPOINT).openStream() );
			String json_string = in.nextLine();
			System.out.println(json_string);
			JSONObject json = new JSONObject( json_string);  
			
		Float temp = json.getJSONObject("main").getFloat("temp");
		System.out.println( temp);
		}
		catch(IOException e)
		{System.out.println("An error pops up");}
		
		
		
//		 String json_string = "{ \"name\": \"Ion\",\"age\":25 }";
//		 
//		 JSONObject json = new JSONObject(json_string);
//		 System.out.println(json.getString("name"));
//		 System.out.println(json.get("age"));
	}

}
