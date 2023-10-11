package D4.no3124;

import java.io.*;
import java.util.*;

public class Solution {
    static int V,E;

    static class Edge implements Comparable<Edge>{
        int v, w;

        Edge(int e, int v) {
            this.v = e;
            this.w = v;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;

        int t=Integer.parseInt(br.readLine());

        for(int tc=1;tc<=t;tc++) {
            st=new StringTokenizer(br.readLine()," ");
            V=Integer.parseInt(st.nextToken());
            E=Integer.parseInt(st.nextToken());
            boolean[] visited= new boolean[V];

            List<Edge>[] edgeList = new ArrayList[V];

            for(int i=0;i<V;i++) {
                edgeList[i] = new ArrayList<Edge>();
            }

            for(int i=0; i<E; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken())-1;
                int to = Integer.parseInt(st.nextToken())-1;
                int weight=Integer.parseInt(st.nextToken());

                edgeList[from].add(new Edge(to,weight));
                edgeList[to].add(new Edge(from,weight));
            }

            PriorityQueue<Edge> pq=new PriorityQueue<Edge>();

            long result=0;
            int cnt=0;
            visited[0]=true;

            for(Edge e : edgeList[0]) {
                pq.add(e);
            }
            while(!pq.isEmpty()){
                Edge cur=pq.poll();

                if(visited[cur.v]) continue;
                result+=cur.w;

                visited[cur.v]=true;

                if(cnt++ == V-1) break;

                for(Edge e:edgeList[cur.v]) {
                    if(visited[e.v]) continue;
                    pq.add(e);
                }
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}