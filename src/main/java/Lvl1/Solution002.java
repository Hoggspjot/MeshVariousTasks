package Lvl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Solution002 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strPath = reader.readLine();
            Path path = Path.of(strPath);
            List<String> list = Files.readAllLines(path);

            System.out.println(list);
        }

    }
}
