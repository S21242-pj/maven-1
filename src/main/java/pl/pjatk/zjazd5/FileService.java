package pl.pjatk.zjazd5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileService {


    public String fileContent() throws IOException {
        return FileUtils.readFileToString(FileUtils.getFile("testFile.txt"), Charset.defaultCharset());
    }

    public void writeFile(String name, String content) throws IOException {
        FileUtils.writeStringToFile(new File(name + ".txt"), content, Charset.defaultCharset());
    }
}
