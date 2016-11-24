package com.elektrobit.eso_MIBHigh_Speech.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by riri9385 on 21.11.2016.
 */
public class FileContentLoader {
    private final String contentPath =  "/contents/";

    /**
     * Method to read the file and return the content
     * @param name : Name of the file
     * @return : The formated content of the file
     * @throws IOException
     */
    public String getTextContent(String name) throws IOException {
        final StringBuilder fileContent = new StringBuilder(5000);
        final InputStream is = this.getClass().getResourceAsStream(contentPath + name);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            while ((line = br.readLine()) != null){
                fileContent.append(line).append("\n");
            }
        }
        return fileContent.toString();
    }

}
