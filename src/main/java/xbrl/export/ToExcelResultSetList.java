package xbrl.export;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import xbrl.factProcessor.ResultSet;
import xbrl.factProcessor.extractFundamentals.constants.CikToTicker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ToExcelResultSetList {
    public static void createWorkbook(List<ResultSet> results) {
        try {
            // create a new file
            FileOutputStream out = new FileOutputStream("workbook.xls");
            // create a new workbook
            Workbook wb = new XSSFWorkbook();
            // create a new sheet

            wb = addSheet(wb, results, "balance sheet", 0);
            wb = addSheet(wb, results, "cash flow", 1);
            wb = addSheet(wb, results, "income statement", 2);

            wb.write(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String labelvalue(ResultSet rs){
        if(rs.getCik() != null && !rs.getCik().isEmpty()){
            // return CikToTicker.createMapping().get(Integer.parseInt(rs.getCik()));
            String str = CikToTicker.find(rs.getCik());
            System.out.println("ticker: " + str);
            return str;
        } else {
            return rs.getName();
        }
    }

    private static Workbook addSheet(Workbook wb, List<ResultSet> results, String sheetname, Integer sheetNum){ //trying a simple list first.
//List<Map<String, Double>> values
        Set<String> combinedKeys = new LinkedHashSet<>();
        List<Map<String, Double>> values = new LinkedList<>();
        List<String> tickers = new LinkedList<>();


        if(sheetname.equalsIgnoreCase("balance sheet")){
            for(ResultSet rs: results){
                Map<String, Double> mp = rs.getBalanceSheet();
                combinedKeys.addAll(mp.keySet());
                values.add(mp);
                tickers.add(labelvalue(rs));

            }
        } else if(sheetname.equalsIgnoreCase("cash flow")){
            for(ResultSet rs: results){
                Map<String, Double> mp = rs.getCashFlow();
                combinedKeys.addAll(mp.keySet());
                values.add(mp);
                tickers.add(labelvalue(rs));
            }
        } else {
            for(ResultSet rs: results){
                Map<String, Double> mp = rs.getIncomeStatement();
                combinedKeys.addAll(mp.keySet());
                values.add(mp);
                tickers.add(labelvalue(rs));
            }
        }



        Sheet s = wb.createSheet();
        wb.setSheetName(sheetNum, sheetname);
        // declare a row object reference
        Row r = null;
        // declare a cell object reference
        Cell c = null;
        // create 3 cell styles
        CellStyle cs = wb.createCellStyle();
        CellStyle cs2 = wb.createCellStyle();
        CellStyle cs3 = wb.createCellStyle();
        Font f = wb.createFont();

        f.setFontHeightInPoints((short) 12);

        cs.setFont(f);

        cs.setDataFormat(HSSFDataFormat.getBuiltinFormat("text"));

        cs.setFont(f);


        r = s.createRow((short) 0);
        short cellOne = (short) 0;
//        short cellTwo = (short) 1;

        c = r.createCell(cellOne);
        c.setCellValue("Accounting Concept");

        for(int j=1; j<tickers.size() + 1; j++){
            String ss = tickers.get(j-1);
            c = r.createCell(j);
            c.setCellValue(ss);
        }


        int rownum = (short) 2;
        for (String str: combinedKeys) {
            r = s.createRow(rownum);
            for(int i=1; i<values.size() + 1; i++){
                //Map<String, Double> mp
                Double val = values.get(i-1).get(str);
//                System.out.println(val);


                c = r.createCell(cellOne);
                c.setCellValue(str);

                c = r.createCell(i);
                // do some goofy math to demonstrate decimals
                if(val != null){
                    c.setCellValue(val);
                } else {
                    c.setCellValue("-");
                }


                String cellValue;


            }
            rownum++;
        }

        return wb;
    }


  public static void createWrite() {
    try {
      // create a new file
      FileOutputStream out = new FileOutputStream("workbook.xls");
      // create a new workbook
      Workbook wb = new XSSFWorkbook();
      // create a new sheet
      Sheet s = wb.createSheet();
      // declare a row object reference
      Row r = null;
      // declare a cell object reference
      Cell c = null;
      // create 3 cell styles
      CellStyle cs = wb.createCellStyle();
      CellStyle cs2 = wb.createCellStyle();
      CellStyle cs3 = wb.createCellStyle();
//      DataFormat df = wb.createDataFormat();
      // create 2 fonts objects
      Font f = wb.createFont();
//      Font f2 = wb.createFont();

      // set font 1 to 12 point type
      f.setFontHeightInPoints((short) 12);
      // make it blue
//      f.setColor((short) 0xc);
      // make it bold
      // arial is the default font
//        f.setBold(true);
//      f.setBoldweight(Font.BOLDWEIGHT_BOLD);

      // set font 2 to 10 point type
//      f2.setFontHeightInPoints((short) 10);
//      // make it red
//      f2.setColor((short) Font.COLOR_RED);
//      // make it bold
////      f2.setBoldweight(Font.BOLDWEIGHT_BOLD);
//
//      f2.setStrikeout(true);

      // set cell stlye
      cs.setFont(f);
      // set the cell format
//      cs.setDataFormat(df.getFormat("#,##0.0"));

      // set a thin border
//      cs2.setBorderBottom(cs2.BORDER_THIN);
//        cs2.setBorderBottom(cs2.getBorderBottomEnum());
      // fill w fg fill color
//      cs2.setFillPattern((short) CellStyle.SOLID_FOREGROUND);
      // set the cell format to text see DataFormat for a full list
      cs.setDataFormat(HSSFDataFormat.getBuiltinFormat("text"));

      // set the font
        cs.setFont(f);

      // set the sheet name in Unicode
//      wb.setSheetName(
//          0,
//          "\u0422\u0435\u0441\u0442\u043E\u0432\u0430\u044F "
//              + "\u0421\u0442\u0440\u0430\u043D\u0438\u0447\u043A\u0430");
      // in case of plain ascii
       wb.setSheetName(0, "HSSF Test");
      // create a sheet with 30 rows (0-29)
      int rownum;
      for (rownum = (short) 0; rownum < 30; rownum++) {
        // create a row
        r = s.createRow(rownum);
        // on every other row
//        if ((rownum % 2) == 0) {
//          // make the row height bigger  (in twips - 1/20 of a point)
//          r.setHeight((short) 0x249);
//        }

        // r.setRowNum(( short ) rownum);
        // create 10 cells (0-9) (the += 2 becomes apparent later
        for (short cellnum = (short) 0; cellnum < 10; cellnum += 2) {
          // create a numeric cell
          c = r.createCell(cellnum);
          // do some goofy math to demonstrate decimals
          c.setCellValue(
              rownum * 10000 + cellnum + (((double) rownum / 1000) + ((double) cellnum / 10000)));

          String cellValue;

          // create a string cell (see why += 2 in the
          c = r.createCell((short) (cellnum + 1));

          // on every other row
          if ((rownum % 2) == 0) {
            // set this cell to the first cell style we defined
            c.setCellStyle(cs);
            // set the cell's string value to "Test"
            c.setCellValue("Test");
          } else {
            c.setCellStyle(cs2);
            // set the cell's string value to "\u0422\u0435\u0441\u0442"
            c.setCellValue("\u0422\u0435\u0441\u0442");
          }

          // make this column a bit wider
          s.setColumnWidth((short) (cellnum + 1), (short) ((50 * 8) / ((double) 1 / 20)));
        }
      }

      // draw a thick black border on the row at the bottom using BLANKS
      // advance 2 rows
      rownum++;
      rownum++;

      r = s.createRow(rownum);

      // define the third style to be the default
      // except with a thick black border at the bottom
//      cs3.setBorderBottom(cs3.BORDER_THICK);

      // create 50 cells
      for (short cellnum = (short) 0; cellnum < 50; cellnum++) {
        // create a blank type cell (no value)
        c = r.createCell(cellnum);
        // set it to the thick black border style
        c.setCellStyle(cs3);
      }

      // end draw thick black border

      // demonstrate adding/naming and deleting a sheet
      // create a sheet, set its title then delete it
      s = wb.createSheet();
      wb.setSheetName(1, "DeletedSheet");
      wb.removeSheetAt(1);
      // end deleted sheet

      // write the workbook to the output stream
      // close our file (don't blow out our file handles
      wb.write(out);
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}


/*  public static void createWorkbook(Map<String, Double> values, Period period) {
      try {
          // create a new file
          FileOutputStream out = new FileOutputStream("workbook.xls");
          // create a new workbook
          Workbook wb = new XSSFWorkbook();
          // create a new sheet
          Sheet s = wb.createSheet();
          // declare a row object reference
          Row r = null;
          // declare a cell object reference
          Cell c = null;
          // create 3 cell styles
          CellStyle cs = wb.createCellStyle();
          CellStyle cs2 = wb.createCellStyle();
          CellStyle cs3 = wb.createCellStyle();
//      DataFormat df = wb.createDataFormat();
          // create 2 fonts objects
          Font f = wb.createFont();
//      Font f2 = wb.createFont();

          // set font 1 to 12 point type
          f.setFontHeightInPoints((short) 12);

          // set cell stlye
          cs.setFont(f);
          // set the cell format

          // set the cell format to text see DataFormat for a full list
          cs.setDataFormat(HSSFDataFormat.getBuiltinFormat("text"));

          // set the font
          cs.setFont(f);

          // set the sheet name
          // in case of plain ascii
          wb.setSheetName(0, "HSSF Test");
          // create a sheet with 30 rows (0-29)
          r = s.createRow((short) 0);
          short cellOne = (short) 0;
          short cellTwo = (short) 1;

          // create a numeric cell
          c = r.createCell(cellOne);
          c.setCellValue("Accounting Concept");

          c = r.createCell(cellTwo);
          // do some goofy math to demonstrate decimals
          c.setCellValue(period.getInstantOrDuration());

          int rownum = (short) 1;
          for (String str: values.keySet()) {
              // create a row
              Double val = values.get(str);
              System.out.println(val);
              r = s.createRow(rownum);
              // on every other row
//        if ((rownum % 2) == 0) {
//          // make the row height bigger  (in twips - 1/20 of a point)
//          r.setHeight((short) 0x249);
//        }
//            short cellOne = (short) 0;
//            short cellTwo = (short) 1;

              // create a numeric cell
              c = r.createCell(cellOne);
              c.setCellValue(str);

              c = r.createCell(cellTwo);
              // do some goofy math to demonstrate decimals
              c.setCellValue(val);

              String cellValue;

              // create a string cell (see why += 2 in the

              // on every other row


              // make this column a bit wider
//              s.setColumnWidth((short) (cellnum + 1), (short) ((50 * 8) / ((double) 1 / 20)));
              // r.setRowNum(( short ) rownum);
              // create 10 cells (0-9) (the += 2 becomes apparent later
*//*              for (short cellnum = (short) 0; cellnum < 10; cellnum += 2) {
                  // create a numeric cell
                  c = r.createCell(cellnum);
                  // do some goofy math to demonstrate decimals
                  c.setCellValue(
                          rownum * 10000 + cellnum + (((double) rownum / 1000) + ((double) cellnum / 10000)));

                  String cellValue;

                  // create a string cell (see why += 2 in the
                  c = r.createCell((short) (cellnum + 1));

                  // on every other row
                  if ((rownum % 2) == 0) {
                      // set this cell to the first cell style we defined
                      c.setCellStyle(cs);
                      // set the cell's string value to "Test"
                      c.setCellValue("Test");
                  } else {
                      c.setCellStyle(cs2);
                      // set the cell's string value to "\u0422\u0435\u0441\u0442"
                      c.setCellValue("\u0422\u0435\u0441\u0442");
                  }

                  // make this column a bit wider
                  s.setColumnWidth((short) (cellnum + 1), (short) ((50 * 8) / ((double) 1 / 20)));
              }*//*
              rownum++;
          }

          // draw a thick black border on the row at the bottom using BLANKS
          // advance 2 rows


          r = s.createRow(rownum);

          // define the third style to be the default
          // except with a thick black border at the bottom
//      cs3.setBorderBottom(cs3.BORDER_THICK);

          // create 50 cells
          for (short cellnum = (short) 0; cellnum < 50; cellnum++) {
              // create a blank type cell (no value)
              c = r.createCell(cellnum);
              // set it to the thick black border style
              c.setCellStyle(cs3);
          }

          // end draw thick black border

          // demonstrate adding/naming and deleting a sheet
          // create a sheet, set its title then delete it
          s = wb.createSheet();
          wb.setSheetName(1, "DeletedSheet");
          wb.removeSheetAt(1);
          // end deleted sheet

          // write the workbook to the output stream
          // close our file (don't blow out our file handles
          wb.write(out);
          out.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }*/