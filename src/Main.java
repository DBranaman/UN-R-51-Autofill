import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) throws IOException{

        SOP sop = new SOP("UN", 88, 6, "SETTLING PLATE ENVIRONMENTAL MONITORING ");
        SOP sop2 = new SOP("UN", 88, 1, 6, "SETTLING PLATE ENVIRONMENTAL MONITORING - ATTACHMENT 1: PLANETARY DESTRUCTION");
        System.out.println(sop.getSOPName());
        System.out.println(sop2.getSOPName());

        String excelFilePath = "C:\\Users\\dbranaman\\Desktop\\IntelliJDE\\UN-R-51 Autofill\\src\\SOPs.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);


    }
}