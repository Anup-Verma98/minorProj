package ocr;
import java.io.File;
import net.sourceforge.tess4j.*;
class Proj{
	public static void main(String args[]) 
	{
		File f=new File("C:\\Users\\intel\\eclipse-workspace\\minorproj\\imageset\\35.png");
		
		ITesseract instance= new Tesseract();
	
		instance.setDatapath("C:\\Users\\intel\\eclipse-workspace\\minorproj\\tessdata");
		
		try {
			String result=instance.doOCR(f);
			System.out.println(" ORIGINAL STRING IS -----> ");
			System.out.println(result);	
			
//			String regex=("\\+");
			String regex2=("\\*");
			String arr[]=result.split(regex2);
			System.out.println("left side : "+arr[0]);
			System.out.println("right side : "+arr[1]);
			
			
		
//			ADDITION MODULE 
//			char extractleft=arr[0].charAt(arr[0].length()-1);
//			char extractright=arr[1].charAt(0);
//
//			
//			int left=Character.getNumericValue(extractleft);
//			int right=Character.getNumericValue(extractright);
//			int sum=left+right;
//			System.out.println("Sum of "+left+"+"+right+"= "+sum);
			
			
//			//MULTIPLY MODULE 
			
			char extractleft=arr[0].charAt(arr[0].length()-1);
			char extractright=arr[1].charAt(0);
			int left=Character.getNumericValue(extractleft);
			int right=Character.getNumericValue(extractright);
			int prod=1;
			prod=left*right;
			System.out.println("Product of "+left+"*"+right+"= "+prod);
			
			
		
		}
		catch(TesseractException e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}
}
