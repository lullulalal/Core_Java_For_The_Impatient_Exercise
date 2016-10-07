import java.io.File;

public class Ch03Ex11 {

	public static String[] FindByExtension(String path, String ext)
	{
		File file = new File (path);	
		
		String[] files = file.list( (File dir, String name) -> { 
			boolean rst = false;
			File f = new File(dir + "/" + name);
			if ( f.isFile() ) {
					int idx = name.lastIndexOf(("."));
					String extIn = name.substring(idx + 1);
					if (ext.equalsIgnoreCase(extIn))
						rst = true;
				}
			return rst;
			} );
		
		return files;
	}
	
	public static void main(String[] args) {
		
		String path = "C:/Users/06-18/Desktop/algo/algo";
		String[] result = FindByExtension(path, "cpp");
		for (String s : result)
			System.out.println(s);
	}
}
