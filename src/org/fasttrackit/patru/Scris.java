package org.fasttrackit.patru;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scris {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Fisiere/tema.txt", true));

        writer.write("Marilenne are 4 kg mere" + System.lineSeparator());
        writer.write("Marianne are 3 kg pere" + System.lineSeparator());
        writer.write("Anca are 1 pepene");
        writer.newLine();

        writer.close();
    }
}
