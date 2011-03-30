import java.io.*; 

public class FtoC {
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double fahrenheit = 0.0;
		
		String input = "";
		System.out.println("Please enter the current temperature in fahrenheit. ");
		input = br.readLine();
		fahrenheit = Double.parseDouble(input); 
		
		
		double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
		System.out.print("The current temperature in Celsius is: ") ;
		System.out.println(celsius);
	}
}
