package Tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestLectureEcritureFichier {
    public static void main(String[] args) throws IOException {
        String filePath =  new File("").getAbsolutePath() + "\\src\\Tests\\stagiaire.dat";
        System.out.println(filePath);

        BufferedReader in = new BufferedReader(new FileReader( filePath));

        String line;

        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
