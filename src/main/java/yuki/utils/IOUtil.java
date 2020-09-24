package yuki.utils;

import java.io.*;

/**
 * IO流操作，txt文本序列化
 */
public class IOUtil {

    /**
     *
     * @param path 文件路径
     * @return 返回字符串
     */
    public static String textToString(String path){
        if(path==null||"".equals(path)){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        File file = new File(path);
        InputStreamReader read = null;
        BufferedReader reader = null;
        try {
            read = new InputStreamReader(new FileInputStream(file), "utf-8");
            reader = new BufferedReader(read);
            String line;
            while ((line = reader.readLine()) != null) {     //逐行读取
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


        }
        return sb.toString();
    }


}
