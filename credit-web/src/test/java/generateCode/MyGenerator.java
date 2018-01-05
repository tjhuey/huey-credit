package generateCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by admin on 2017/8/2.
 */
public class MyGenerator {
    public static void main(String[] args) {
        try {
            File directory = new File(".");
            String path = directory.getCanonicalPath(); //得到的是C:\
            System.out.println(path);
            String runPath = path + "\\credit-web\\src\\test\\resources";//huey
            // String runPath=path+"\credit-web\\src\\test\\resources";//other
            String batPath = runPath + "\\generator.bat";
            File file = new File(runPath);
            Process ps = Runtime.getRuntime().exec(batPath, null, file);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            BufferedReader error = new BufferedReader(new InputStreamReader(ps.getErrorStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = error.readLine()) != null) {
                sb.append(line).append("\n");
            }
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

