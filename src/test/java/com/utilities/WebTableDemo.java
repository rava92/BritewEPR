package com.utilities;
//
//import com.vytrack.pages.DashboardPage;
//import com.vytrack.pages.LoginPage;
//import com.vytrack.pages.VehiclesPage;
//import com.vytrack.tests.TestBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class WebTableDemoTest{
//
//
//    public static void printTable(){
//
//
//        WebElement table = driver.findElement(By.id("table1"));
//
//        System.out.println(table.getText());
//    }
//
//    // headers
//
//    @Test
//    public void headersTest(){
//        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
//
//        headers.forEach((cell-> System.out.println(cell.getText())));
//        System.out.println("headers.size() = " + headers.size());
//
//    }
//
//    // get table size
//    @Test
//    public void tableSizeTest(){
//        // TODO number of columns
//        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
//        System.out.println("Number of columns: " + headers.size());
//        // TODO number row including headers
//
//        List<WebElement> rowsWithHeaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
//        System.out.println("Number of rows including headers: " + rowsWithHeaders.size());
//
//        // TODO number row without headers
//        List<WebElement> rowsWithOutHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
//        System.out.println("Number of rows withouth headers:" + rowsWithOutHeaders.size());
//
//
//    }
//
//    @Test
//    public void getWholeRow(){
//        WebElement row =driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[1]"));
//        System.out.println(row.getText());
//        int index=2;
//        String rowXpath = "//table[@id='table2']/tbody/tr["+index+"]";
//        row = driver.findElement(By.xpath(rowXpath));
//        System.out.println(row.getText());
//        // System.out.println(driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[1]")));
//
//
//    }
//
//    //get all cells from certain row
//
//    @Test
//    public void getCellsInRow(){
//        List<WebElement>cellsInRow =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
//
//        cellsInRow.forEach((cell-> System.out.println(cell.getText())));
//        System.out.println("cellInRow: "+cellsInRow.size());
//
//        int index = 3;
//        String ceelInRowXpath = "//table[@id='table1']/tbody/tr["+index+"]/td";
//        cellsInRow = driver.findElements(By.xpath(ceelInRowXpath));
//        cellsInRow.forEach( (cell-> System.out.println(cell.getText())));
//    }
//
//    //get certain cell
//    @Test
//    public void getCellTest(){
//        WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[6]/a[2]"));
//        System.out.println(cell.getText());
//    }
//    @Test
//    public void getCelMethodTest(){
//        WebElement cell = getCell(3,4);
//        Assert.assertEquals(cell.getText(),"$100.00");
//
//        cell = getCell(4,5);
//        Assert.assertEquals(cell.getText(),"http://www.timconway.com");
//
//
//
//    }
//
//    //get do you get a value a cell based on its cordinate/index?
//    public WebElement getCell(int rowIndex, int colIndex) {
//        String xpath = "//table[@id='table1']/tbody/tr[" + rowIndex + "]/td[" + colIndex + "]";
//        return driver.findElement(By.xpath(xpath));
//    }
//
//
//    //go to the page
//    //click on email
//    //verify email column is sorted in ascending order
//
//    @Test
//    public void columnSortTest() throws InterruptedException {
//        // click on column email
//        // get all columns names
//        // click on col email
//
//        List<WebElement> colNames = getAllColumnsNames();
//
//        System.out.println(BrowserUtils.getElementsText(colNames));
//
//        for (WebElement colName : colNames) {
//            if (colName.getText().equals("LICENSE PLATE")) {
//                colName.click();
//                break;
//            }
//        }
//        //driver.findElement(By.xpath("//table[contains(@class,'grid table-hover')]/thead//th[1]")).click();
//        // get all data under the Email col
//        // get the index of the Email
//        BrowserUtils.waitFor(1);
//        int colIndex = getColumnIndex("LICENSE PLATE");
//        //System.out.println(colIndex);
//        // generate the xpath all cells under the email col
//
//        String xpath = "//table[contains(@class,'grid')]/tbody/tr/td[" + colIndex + "]";
//
//
//
//        List<WebElement> licensePlates = driver.findElements(By.xpath(xpath));
//
//        licensePlates.forEach((licensePlate -> System.out.println(licensePlate.getText())));
//
//        for (int i = 0; i < licensePlates.size() - 1; i++) {
//            String email1 = licensePlates.get(i).getText();
//            String email2 = licensePlates.get(i + 1).getText();
//            Assert.assertTrue(email1.compareTo(email2) < 0);
//
//        }
//
//
//    }
//
//
//
//    private List<WebElement> getAllColumnsNames() {
//        VehiclesPage vehiclesPage = new VehiclesPage();
//
//        List<WebElement> cols = vehiclesPage.gridHeaders;
//        return cols;
//    }
//
//    private int getColumnIndex(String col) {
//        List<WebElement> cols = getAllColumnsNames();
//        for (int i = 0; i < cols.size(); i++) {
//            if (cols.get(i).getText().equals(col)) {
//                return i + 1;
//            }
//        }
//        return 0;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println("a".compareTo("c"));
//    }
//

//}
