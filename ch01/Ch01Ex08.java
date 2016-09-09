import java.util.Scanner;
import java.io.FileReader; 
import java.io.IOException; 
import java.util.StringTokenizer;

public class Ch01Ex08 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("Input File Path : ");
		Scanner pathScanner = new Scanner(System.in); 
		String filePath = pathScanner.nextLine(); 
		Scanner fileScanner = new Scanner(new FileReader(filePath)); 
		while( fileScanner.hasNextLine() ) { 
			String gotLine = fileScanner.nextLine();
			StringTokenizer st = new StringTokenizer(gotLine, " ");
			while ( st.hasMoreTokens() ) 
				System.out.println(st.nextToken());
		} 
		fileScanner.close(); 
 
	}
}
