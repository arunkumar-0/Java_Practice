public class EnhancedLoop {
    public static void main(String[] args) {
        int nums[] = { 3 , 8 , 1 , 10};
        for(int n:nums){
        
        System.out.println(n);
      };
     

     //2-d array
     int no[][] ={
        {2 , 4, 6},
        {4 , 7, 1},
        {1 , 9 , 2},
     };
     for(int a[]:no){
        for(int b : a){
            System.out.print(b + " ");
        }
        System.out.println();
     }
    }
}

    
