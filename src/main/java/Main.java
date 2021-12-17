import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public  static void main(String[] args) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Mi 1ra hoja");
        // Descripción, Monto, Tipo (Ingreso o Gasto), Categoría (Comida, Teléfono, Electricidad, Agua, Renta, o lo que se te ocurra).
        ArrayList<String> columns = new ArrayList<>(Arrays.asList("No","Description","Amount","Category","Date"));
        /*
            HashMap<String,String,String,String,String> datas = new HashMap<String,String,String,String,String>();
            datas.put("1","Salud","5.00","Gasto","2021-12-17");
        */
        HSSFRow row = sheet.createRow(0);

        for (int i = 0 ; i < columns.size() ; i++){
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(columns.get(i));
        }


        OutputStream out = new FileOutputStream("src/main/resources/SimpleExcel.xls");
        workbook.write(out);
        System.out.println("Hola mundo");
    }
}
