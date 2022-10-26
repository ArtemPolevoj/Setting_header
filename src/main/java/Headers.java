import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Headers {

    public static void setting(File file) {

        if(file.getName().toLowerCase().contains("ver.2")) {

            System.out.println("Изменяется файл - " + file.getName());

            String name = "";

            try (XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))) {

                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    XSSFSheet sheet = workbook.getSheetAt(i);

                    if(sheet.getSheetName().contains("ВВК")) name = "ВЕДОМОСТЬ ВХОДНОГО - ВЫХОДНОГО КОНТРОЛЯ";
                    else if (sheet.getSheetName().contains("ТКР")) name = "ТЕХНОЛОГИЧЕСКАЯ КАРТА РАЗБОРКИ";
                    else if (sheet.getSheetName().contains("ДВ")) name = "ДЕФЕКТНАЯ ВЕДОМОСТЬ";
                    else if (sheet.getSheetName().contains("Заключение")) name = "ЗАКЛЮЧЕНИЕ";
                    else if (sheet.getSheetName().contains("ТЗ")) name = "ТЕХНИЧЕСКОЕ ЗАДАНИЕ НА\nВОССТАНОВЛЕНИЕ ДЕТАЛЕЙ";
                    else if (sheet.getSheetName().contains("ТКС")) name = "ТЕХНОЛОГИЧЕСКАЯ КАРТА СБОКИ";
                    else   name = sheet.getSheetName();

                    Header headerFirst = sheet.getFirstHeader();
                    headerFirst.setLeft("");
                    headerFirst.setRight("");
                    headerFirst.setCenter("");


                    Footer footerFirst = sheet.getFirstFooter();
                    footerFirst.setRight("");
                    footerFirst.setLeft("");

                    Header header = sheet.getHeader();
                    header.setLeft("");
                    header.setRight("");
                    header.setCenter(name);

                    Footer footer = sheet.getFooter();
                    footer.setRight("");
                    footer.setLeft("");

                }
                try (FileOutputStream out = new FileOutputStream(file)) {
                    workbook.write(out);
                } catch (IOException e) {
                    System.out.println("Не удалось записать" + file.getName());
                }
            } catch (IOException e) {
                System.out.println("Не удалось обработать" + file.getName());
            }
        }
    }
}
