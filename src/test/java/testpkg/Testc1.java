package testpkg;




import org.testng.annotations.Test;

import basepkg.Basec1;
import pagepkg.Pagec1;
import utilpkg.Utilc1;
import utilpkg.Utilcls;

public class Testc1 extends Basec1 {
	
	@Test
	public void cred()
	{
		Pagec1  xp = new Pagec1(driver);
		
		String le ="C:\\Users\\gayat\\Downloads\\secret_sauce.xlsx";
		 String Sheet = "Sheet1";
		 
		 int rc= Utilc1.getRowCount(le, Sheet);
		 
		 for (int i=1;i<=rc;i++)
		 {
			  String UN=Utilcls.getCellValue(le, Sheet, i, 0);
			  System.out.println("username---"+UN);
			  String PD=Utilcls.getCellValue(le, Sheet, i, 1);
			  System.out.println("password---"+PD);
			  xp.values(UN, PD);
			  xp.clickLoginBtn();
			  xp.cart();
			 
			 
		 }

	}

}
