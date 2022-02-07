package StockManagement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Stock.Listeners.MyListeners.class)
public class StockManagementClass extends BaseContainer {
	StockPageManagement PagesDataForSM;

	@BeforeClass
	public void MultipleEnv() throws InterruptedException {
		Driver.get(PagesDataForSM.URL);
		Thread.sleep(2000);
	}

	public String ProductName001 = "Table Matters - Cereal Cup Collection";
	public String ScreenshotName = "Stock";
	
	@Test
	public void StockCheck() throws InterruptedException {
		PagesDataForSM = new StockPageManagement(Driver);
		PagesDataForSM.InputDataToSearch();
		PagesDataForSM.ScrollDown();
//		PagesDataForSM.ListOfItemsInPage();
		PagesDataForSM.ChooseProduct(ProductName001);
		PagesDataForSM.CheckStockAvailable();
		PagesDataForSM.TakeScreenShot01(ScreenshotName);
		Thread.sleep(2000);
		Driver.quit();
	}
	
}
