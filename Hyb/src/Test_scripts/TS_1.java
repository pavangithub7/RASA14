package Test_scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genric_scripts.Base_Test;
import Genric_scripts.Generic_excel;
import POM_scripts.POM1;

public class TS_1 extends Base_Test {
@Test
public void script() throws EncryptedDocumentException, IOException
{
	String username=Generic_excel.getData("Sheet1", 0, 0);
	String password=Generic_excel.getData("Sheet1", 1, 0);
	POM1 pmc= new POM1(driver);
	pmc.uname(username);
	pmc.pwd(password);
	pmc.login();
	
}
}
