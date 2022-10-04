package org.fasttrackit.patru;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Citit {
    public static void main(String[] args) throws IOException {
        readFileBuffered();//citire din "tema.txt" si inlocuirea cuvintelor care incep cu "M/m" si se termina cu "e"
    }

    private static void readFileBuffered() throws IOException {
        System.out.println("Buffered read:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/tema.txt")));
        String line;
        while ((line = bufferedReader.readLine()) != null) {

            System.out.println(line.replaceAll("[Mm](\\w+)e", "*"));
        }
    }
}