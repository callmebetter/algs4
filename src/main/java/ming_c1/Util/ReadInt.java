package ming_c1.Util;

import java.io.*;

public class ReadInt {
    public ReadInt() throws IOException {
        File file = new File("../../");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        fr.close();
        
        System.out.println(sb.toString());
    }
}
