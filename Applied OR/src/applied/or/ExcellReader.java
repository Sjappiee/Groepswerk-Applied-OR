/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applied.or;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author stephan
 */
public class ExcellReader {
    private String inputFile;
    private ArrayList <Nurse> nurses = new ArrayList <Nurse> ();
    
    public void setInputFile (String inputFile) { //nodig voor inlezen excel document
        this.inputFile = inputFile;
    }
    
    public void read () throws IOException { //methode om alle data in te lezen EN in de nurse objecten te steken
        File inputWorkbook = new File (inputFile);
        Workbook w;
        
        try{
            w = Workbook.getWorkbook(inputWorkbook); //workbook in java initialiseren 
            Sheet sheet = w.getSheet(0); //om eerste sheet te nemen van excel bestand
            int startRow = searchFirstRow();


        
        }
        
        catch (BiffException e) {
            e.printStackTrace();
        }
    }
    
    public int searchFirstRow () throws IOException { //methode voor het vinden van de eerste cell ongeacht department etc.
        File inputWorkbook = new File (inputFile);
        Workbook w;
        int startRow = 0;
        int startColumn = 0;
        
        try{
            w = Workbook.getWorkbook(inputWorkbook); //workbook in java initialiseren 
            Sheet sheet = w.getSheet(0); //om eerste sheet te nemen van excel bestand
            int i = 0;
            while (i < sheet.getRows())
            {
                Cell cell = sheet.getCell (startColumn, i);
                if (cell.getContents().contains("30"))
                {   
                    startRow = i;
                    i = i + 1000000000;
                }
                else {
                    i++;
                }
            }
          }
          catch (BiffException e) {
              e.printStackTrace();
        }
          return startRow;
    }
    
        public int searchLastRow () throws IOException { //methode voor het vinden van de laatste cell ongeacht department en hoeveel nurses er daar gepland zijn.
        File inputWorkbook = new File (inputFile);
        Workbook w;
        int lastRow = 0;
        int startColumn = 0;
        
        try{
            w = Workbook.getWorkbook(inputWorkbook); //workbook in java initialiseren 
            Sheet sheet = w.getSheet(0); //om eerste sheet te nemen van excel bestand
            int i = 0;
            while (i < sheet.getRows())
            {
                Cell cell = sheet.getCell (startColumn, i);
                if (cell.getContents().contains("Scheduled"))
                {   
                    lastRow = i;
                    i = i + 1000000000;
                }
                else {
                    i++;
                }
            }
          }
          catch (BiffException e) {
              e.printStackTrace();
        }
          return lastRow-1;
    }
}
