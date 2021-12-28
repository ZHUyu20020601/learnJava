package learningDemo;
import java.io.*;
/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/27
 * @ Time 4:43 下午
 */
public class learnFile{
    public static void main(String[] args)throws EOFException,IOException{
        LineNumberReader reader = null;
        try {
            reader = new LineNumberReader(new InputStreamReader(new FileInputStream("./learningDemo/learnFile.txt")));
            String line = new String();
            while((line = reader.readLine())!= null){
                System.out.println("Line."+reader.getLineNumber()+": "+line);
            }
        }catch(EOFException e){
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }
}
