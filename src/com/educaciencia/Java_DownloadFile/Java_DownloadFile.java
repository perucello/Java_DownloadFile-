package com.educaciencia.Java_DownloadFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Java_DownloadFile {

    public static void main(String[] args) throws IOException {
    	downloadFile();
       
    }
    
    public static void downloadFile() throws IOException {
    	 URL url = new URL("http://dicasdejava.com.br/images/logo-java.png");
         File file = new File("C:\\\\educaciencia\\arquivo-baixado.png");

         InputStream is = url.openStream();
         FileOutputStream fos = new FileOutputStream(file);
         int bytes = 0;
         while ((bytes = is.read()) != -1) {
             fos.write(bytes);
         }
         is.close();
         fos.close();
    }


}