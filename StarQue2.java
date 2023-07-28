// print   * * * * *
//         *       *
//         *       *
//         *       *
//         * * * * *

public class StarQue2 {
    public static void main(String[] args) {
        int n = 5 ; 
        int i , j ; 
        for (i = 0 ; i<n ; i++){
            for(j = 0 ; j<n ; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");

        // print *       *
        //       *       *
        //       * * * * * 
        //       *       *  
        //       *       *

        for (i = 0 ; i < n ; i++){
            for(j = 0 ; j< n  ; j++)
            if( j==0 || i==(n-1)/2 || j==n-1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println(" ");


        // print I , E , F patterns

        // printing I        
        for (i = 0 ; i < n ; i++){
            for(j = 0 ; j< n  ; j++)
            if( i==0 || j==(n-1)/2 || i==n-1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println(" ");
        //printing E

        for (i = 0 ; i < n ; i++){
            for(j = 0 ; j< n  ; j++)
            if( j==0 || i==(n-1)/2 || i==n-1 || i==0){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println(" ");
        //printing F

        for (i = 0 ; i < n ; i++){
            for(j = 0 ; j< n  ; j++)
            if( i==0 || i==(n-1)/2 || j==0){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
