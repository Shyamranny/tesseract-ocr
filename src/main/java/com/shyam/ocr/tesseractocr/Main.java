package com.shyam.ocr.tesseractocr;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/* shyam created on 9/2/20 */
public class Main {

    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("/Users/shyam/Documents/work/javatesseractocr/tessdata");
            String text = tesseract.doOCR(new File("/Users/shyam/Documents/work/javatesseractocr/image.jpg"));
            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
