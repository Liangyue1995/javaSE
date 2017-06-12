package Project;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by 梁悦 on
 * 2017/6/12.
 */
// 方法
public class GetStackTraceString {
    public static String getStackTraceString(Exception e){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }

//    public static void String GetStackTraceString(Exception e) {
//        StringWriter sw = new StringWriter();
//        PrintWriter pw = new PrintWriter(sw);
//        e.printStackTrace(pw);
//        return sw.toString();
//    }
}
