/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Mujawa_
 */
public class writeDocx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BasicConfigurator.configure();
        
        String teks = "Jangan Biasakan Berfikiran Negatif, "
                + "Selalulah Berfikir Positif Tentang Segala Hal! "
                + "Karena Fikiran Anda Akan Menjadi Ucapan, "
                + "Ucapan Anda Akan Menjadi Perbuatan dan Pebuatan Anda Akan Menjadi Kebiasaan.";

        XWPFDocument documentDocx = new XWPFDocument();

        // write document
        String outDocxEn = "E://writedocx.docx";
        //create paragraph
        try (FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn))) {
            //create paragraph
            XWPFParagraph paragraphDocx = documentDocx.createParagraph();
            XWPFRun runDocx = paragraphDocx.createRun();
            runDocx.setText(teks);
            
            documentDocx.write(outDocx);
        }
        System.out.println("Write docx successfully");
    }
}


