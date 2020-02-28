package translation;

import java.io.*;

public class Translation {
    public static String sourceFilePath;
    public static String targetFilePath;
    private BufferedReader FilePathReader = new BufferedReader(new InputStreamReader(System.in));

    public String sourceFilePath() {
        try {
            sourceFilePath = FilePathReader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return sourceFilePath;
    }

    public String targetFilePath() {
        try {
            targetFilePath = FilePathReader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return targetFilePath;
    }


}
