# tesseract-ocr
OCR implementation in java using tess4j library

## Step 1
Download langugae specific data from https://github.com/tesseract-ocr/tessdata
Tessdata can be downloaded in all languages from here - https://github.com/tesseract-ocr/tessdata

## Step 2
Add the below dependency in the pom.xml
<dependency>
	    <groupId>net.sourceforge.tess4j</groupId>
	    <artifactId>tess4j</artifactId>
	    <version>3.2.1</version>
</dependency>

## Step 3
Set data path to Tesseract
tesseract.setDatapath("/Users/shyam/Documents/work/javatesseractocr/tessdata");

## Step 4
Do OCR by passing the image
String text = tesseract.doOCR(new File("/Users/shyam/Documents/work/javatesseractocr/image.jpg"));
