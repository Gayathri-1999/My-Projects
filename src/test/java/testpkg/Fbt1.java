package testpkg;


import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Fbpage;
import utilpkg.Utilcls;

public class Fbt1  extends Basecls{
	
	
		@Test
		public void verifyLoginWithValidCred () throws Exception

		{
			            
		           Fbpage p1= new Fbpage(driver);

		// Reading the data from excel file by the specified path

		            String xl = "C:\\Users\\gayat\\OneDrive\\Documents\\Datadriven.xlsx";

		            String Sheet = "Sheet1";

		            int rowCount = Utilcls.getRowCount(xl, Sheet);

		            for (int i=1;i<=rowCount;i++)

		            {

		                 String userName=Utilcls.getCellValue(xl, Sheet, i, 0);
	                       System.out.println("username---"+userName);
	                       
	                       
		                   String Pwd=Utilcls.getCellValue(xl, Sheet, i, 1);
	                       System.out.println("password---"+Pwd);
	                       
		                    //Passing Username and password as parameters
		                    p1.setvalues(userName, Pwd);
		                    
	                        //Submitting the data by clicking on login button                   
	                          p1.clickLoginBtn();
		                        
		                        
		                        
		                      String expectedurl="https://www.facebook.com";
		          			  String actualurl= driver.getCurrentUrl();
		          			  
		          			     if(actualurl.equalsIgnoreCase(expectedurl))
		          			     {
		          			    	System.out.println("pass");
		          			     }else
		          			     {
		          			    	System.out.println("fail");
		          			     }
		                         

		            }
		}}


