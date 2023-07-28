//print A with curved edges

public class StarQue3 {
    public static void main(String[] args) {
        int i , j ; 
        int n = 10 ; 
        for(i = 0 ; i < n ; i++){
            for(j= 0 ; j< n ; j++){
                if(i==0 || j==0 || i==(n-1)/2 || j==n-1){
                    if(i==0 && j==0 || i==0 && j==n-1){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println();
        //draw D
        int p , q  ;
        int r = 15 ; 
        for(p=0 ; p<r ; p++){
            for(q=0 ; q<r ; q++){
                if(p==0 && q<(r-1)/2 || q==0 || p ==(r-1) && q<(r-1)/2 || q ==(r-1)/2 && p>0 && p<r-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            } System.out.println();
        }


    }
}
