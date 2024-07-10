import java.util.ArrayList;

import java.util.* ;

public class AdjList {
    public static void addEdge(  ArrayList <ArrayList<Integer>> al , int u , int v){
        //get the source or the place where to add edge and then add adge
        al.get(u).add(v);
        //for undirected graph there would be
        //al.get(v).add(v) also     
    }
    public static void main(String[] args) {
        int v = 4; 
        ArrayList <ArrayList<Integer>> al = new ArrayList<>();

        for(int i=0 ; i<v ; i++){
            al.add(new ArrayList<>());
        }
        addEdge(al, 0, 1 );
        addEdge(al, 1, 0 );
        addEdge(al, 0, 2 );
        addEdge(al, 2, 1 );
        addEdge(al, 2, 0 );

        System.out.println(al);

    }
}
