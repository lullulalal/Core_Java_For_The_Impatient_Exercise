package Ch03;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Ch03Ex12 {
	
	public static void fileSort(File[] files)
	{
		Arrays.sort(files, (first, second) -> {
			if (first.isDirectory() && second.isFile())
				return -1;
			else if (first.isFile() && second.isDirectory() )
				return 1;
			else
				return 0;
		});
	}
	
	public static void findFileRecursive(String path, ArrayList<File> result)
	{
		File file = new File (path);	
		
		File[] files = file.listFiles();
		
		for( File f : files )
		{
			if ( f.isDirectory() ) {
				result.add(f);
				findFileRecursive( f.getAbsolutePath() , result );
			}
			else 
				result.add(f);
		}
	}
	
	public static void main(String[] args) {

		ArrayList<File> filesList = new ArrayList<>();
		String path = "C:/Users/06-18/Desktop/algo";
		
		findFileRecursive( path, filesList );
		
		File[] files = new File[filesList.size()];
		files = filesList.toArray(new File[0]);
	
		fileSort( files );
		
		for( File f : files )
			System.out.println(f.getPath());
	}
}
