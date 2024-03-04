import java.io.*;
import java.util.*;

public class p2_2 {
    static class cow{
        Character dir;
        Long size;
        public cow(char d, long s){
            this.dir = d;
            this.size = s;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[] d = new char[N];
        long[] a = new long[N];
        st = new StringTokenizer(r.readLine());
        d = st.nextToken().toCharArray();
        st = new StringTokenizer(r.readLine());
        long sum = 0;
        for(int i = 0; i < N; i++){
            a[i] = Long.parseLong(st.nextToken());
        }
        cow[] cows = new cow[N];
        for(int i = 0; i < N; i++){
            cows[i] = new cow(d[i], a[i]);
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                cow left;
                cow right;
                if(j == 0){
                    left = cows[N-1];
                    right = cows[j+1];
                }
                else if(j == N-1){
                    left = cows[j-1];
                    right = cows[0];
                }
                else{
                    left = cows[j-1];
                    right = cows[j+1];
                }
                if(cows[j].dir == 'R'){
                    if(left.dir == 'R' && right.dir == 'L'){
                        if(right.size != 0 && left.size != 0) cows[j].size++;
                        else if(right.size == 0 && left.size == 0) cows[j].size--;
                        if(cows[j].size != 0) right.size++;
                    }
                    else if(left.dir == 'R' && right.dir == 'R'){
                        if(cows[j].size != 0) right.size++;
                        if(left.size == 0) cows[j].size--;
                    }
                    else if(left.dir == 'L' && right.dir == 'L'){
                        if(cows[j].size != 0) right.size++;
                        if(right.size == 0) cows[j].size--;
                    }
                    else if(left.dir == 'L' && right.dir == 'R'){
                        if(cows[j].size != 0){
                            right.size++;
                            cows[j].size--;
                        }
                    }  
                } 
                else if(cows[j].dir == 'L'){
                    if(left.dir == 'R' && right.dir == 'L'){
                        if(right.size != 0 && left.size != 0) cows[j].size++;
                        else if(right.size == 0 && left.size == 0) cows[j].size--;
                        if(cows[j].size != 0) left.size++;
                    }
                    else if(left.dir == 'R' && right.dir == 'R'){
                        if(cows[j].size != 0) left.size++;
                        if(left.size == 0) cows[j].size--;
                    }
                    else if(left.dir == 'L' && right.dir == 'L'){
                        if(cows[j].size != 0) left.size++;
                        if(right.size == 0) cows[j].size--;
                    }
                    else if(left.dir == 'L' && right.dir == 'R'){
                        if(cows[j].size != 0){
                            left.size++;
                            cows[j].size--;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < N; i++){
            if(cows[i].size >= a[i]) sum+= a[i];
            else if(cows[i].size < a[i]) sum+= cows[i].size;
        }
        pw.println(sum);
        pw.close();
    }
}
