import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by Kisnik on 15.02.2018.
 */
public class PathTest {
    public static void main(String[] args) throws IOException {

        File testFilePath = new File("C:\\Users\\Kisnik\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Media Cache");
        if(testFilePath.isDirectory()) {
            for (File tmp : testFilePath.listFiles()) {
                Path path = Paths.get("D:\\MusicCashe13\\" + tmp.getName() + ".mp3");
                if(Files.exists(path)==false){
                    Files.createFile(path);
                }
                try {
                    Files.copy(tmp.toPath(), path, REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}

