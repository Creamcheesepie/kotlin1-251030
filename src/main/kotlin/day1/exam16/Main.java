package day1.exam16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            copy("a.txt","b.txt");
        } catch (IOException e) {
            e.printStackTrace(); // 딱히 예외 처리가 일어나고 있지 않음
        }

    }

    public static void copy(String source,String target) throws IOException {
        Files.copy(Paths.get(source),Paths.get(target));
    }
}
