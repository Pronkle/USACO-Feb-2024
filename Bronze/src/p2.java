import java.io.*;
import java.util.*;

public class p2 {
    static class cow{
        String dir;
        Long size;
        Integer flowrate;
        public cow(String d, long s, int f){
            this.dir = d;
            this.size = s;
            this.flowrate = f;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] d = new String[N];
        long[] a = new long[N];
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < N; i++) d[i] = st.nextToken();
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < N; i++) a[i] = Long.parseLong(st.nextToken());
        cow[] cows = new cow[N];
        for(int i = 0; i < N; i++){
            int fr = 0;
            if(i == 0){
                
            }
        }
        pw.close();
    }
}
