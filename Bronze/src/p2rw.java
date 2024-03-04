import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2rw {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        char[] dir = st.nextToken().toCharArray();
        st = new StringTokenizer(r.readLine());
        long[] cap = new long[N];
        for(int i = 0; i < N; i++) cap[i] = Long.parseLong(st.nextToken());
        long[] cows = Arrays.copyOf(cap, N);
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(dir[j] == 'R' && cows[j] > 0){
                    if(j != N-1) cows[j+1]++;
                    else cows[0]++;
                    cows[j]--;
                }
                else if(dir[j] == 'L' && cows[j] > 0){
                    if(j != 0) cows[j-1]++;
                    else cows[N-1]++;
                    cows[j]--;
                }
            }  
            for(int j = 0; j < N; j++){
                if(cows[j] > cap[j]) cows[j] = cap[j];
            }
        }
        long ans = 0;
        for(int i = 0; i < N; i++){
            ans += cows[i];
        }
        pw.println(ans);
        pw.close();
    }
}
