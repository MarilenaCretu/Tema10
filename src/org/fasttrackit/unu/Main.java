package org.fasttrackit.unu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        readfile();


    }

    private static void readfile() throws IOException {
        System.out.println("Buffered read:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Fisiere/content.data"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);

            StringTokenizer tema10 = new StringTokenizer(line, (Pattern.quote("|")));


            while (tema10.hasMoreTokens())


                System.out.println(tema10.nextToken());
        }
    }
}
