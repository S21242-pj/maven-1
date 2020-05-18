package pl.pjatk;

import pl.pjatk.zjazd5.Calculator;
import pl.pjatk.zjazd5.FileService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//Dołączyć do swojego projektu https://mvnrepository.com/artifact/commons-io/commons-io/2.6
//Utworzyć dowolny plik tekstowy w projekcie (np testFile.txt) z dowolną zawartością.
//Za pomocą FileUtils odczytać zawartość tego pliku
//Utworzyc nowa metodę któa przyjmuje nazwę i content, gdzie za pomocą FileUtils utworzysz nowy plik
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));


        FileService fileService = new FileService();
        System.out.println(fileService.fileContent());
        fileService.writeFile("testFile2", "test file content");


    }
}
