import java.io.*;
import java.util.*;

public class p3 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] t = new int[N];
        int[] c = new int[N];
        int[] rq = new int[N];
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < N; i++) c[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < N; i++) t[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) rq[i] = c[i] - t[i];
        Arrays.sort(rq);
        for(int i = 0; i < Q; i++){
            st = new StringTokenizer(r.readLine());
            int V = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            if(rq[N-1] <= S){
                pw.println("NO");
                continue;
            }
            if(rq[N-V] > S){
                pw.println("YES");
                continue;
            }
            else if(rq[N-V] <= S){
                pw.println("NO");
                continue;
            }
        }
        pw.close();
    }
}
