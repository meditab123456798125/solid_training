package com.meditab.training.dip.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.Base64;

public class EncodingModule
{
    public void encodeWithFiles(Reader reader, String stringReadFile, Writer writer, String stringWriteFile) throws IOException
    {
        try {
            if(reader instanceof BufferedReader) {
            	reader = new BufferedReader(
                        new FileReader(stringReadFile));
            }
        	if(writer instanceof BufferedWriter) {
        		writer = new BufferedWriter(
                        new FileWriter(stringWriteFile));
        	}
            
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeBasedOnNetworkAndDatabase(URL url, MyDatabase database) throws IOException
    {
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        database.write(encodedString);
    }
}

