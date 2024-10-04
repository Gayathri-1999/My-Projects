package utilpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Utilc1 {
	
	public static String getCellValue(String le, String Sheet, int r, int c)
	{
		
		
		
       	FileInputStream fp = null;
		try 
		
		{
			fp = new FileInputStream(le);
		}
		
		catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		}
       		XSSFWorkbook wf = null;
			try
			{
				wf = new XSSFWorkbook(fp);
			}
			
			catch (IOException e)
			{
				
				
				e.printStackTrace();
			} 

           XSSFCell cell =wf.getSheet(Sheet).getRow(r).getCell(c);
           
           if(cell.getCellType()==CellType.STRING)
           {
                      return cell.getRawValue();

                        
           }
           else
           {
          	
          	 return"";
          	
           }
	}

	 public static int getRowCount (String le, String Sheet)
	 {
		 FileInputStream fp = null;
		try
		{
			fp = new FileInputStream(le);
		}
		catch (FileNotFoundException e)
		{
			
			
			e.printStackTrace();
		}
   		XSSFWorkbook wf;
		try
		{
			wf = new XSSFWorkbook(fp);
		} 
		
		catch (IOException e)
		{
			
			
			
			e.printStackTrace();
		} 

                return 0;

		 
		 
		 
	 }
	 
	
	
	 


		 
		 
		 
	 


}
