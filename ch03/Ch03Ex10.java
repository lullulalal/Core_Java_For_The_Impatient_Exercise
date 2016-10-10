import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

class FileFilterEx implements FileFilter {
	public boolean accept(File f){
		return f.isDirectory();
	}
}

public class Ch03Ex10 {

	public static void findFileRecursive(String path, ArrayList<String> result)
	{
		File file = new File (path);	
		
		// using class
		//File[] files = file.listFiles(new FileFilterEx());
		
		// using Anonymous Inner class
		/*File[] files = file.listFiles(new FileFilter() {
			public boolean accept(File f){
				return f.isDirectory();
			}
		});*/
		
		//using lamda
		//File[] files = file.listFiles( (File f) -> f.isDirectory() );
		//using lamda, method expression 
		File[] files = file.listFiles( File::isDirectory );
		for( File f : files )
		{
			result.add(f.getName());
			//System.out.println(f.getPath());
			findFileRecursive( f.getAbsolutePath() , result );
		}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<String> result = new ArrayList<>();
		String path = "C:/Users/06-18/Desktop/algo";
		findFileRecursive( path, result );
		
		for( String s : result)
			System.out.println(s);
	}
}
