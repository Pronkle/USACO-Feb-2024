import java.io.*;
import java.util.*;

public class p1 {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(r.readLine());
            String s = st.nextToken();
            if(s.length() == 1) pw.println("B");
            else{
                String s1 = s.substring(0, (s.length()/2));
                String s2 = s.substring((s.length()/2), s.length());
                if(s1.equals(s2)) pw.println("B");
                else{
                    if(Long.valueOf(s.charAt(s.length()-1)) > Long.valueOf(s.charAt(0))) pw.println("B");
                    else pw.println("E");
                }
            }
        }
        pw.close();
    }
} 
