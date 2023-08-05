class New {
    public int add (int nums[] ){
        int res = 0 ;
        for (int n : nums){
            
            res = res + n;
        }
        return res;
    } 
}

public class AnonymousArray {
    public static void main(String[] args) {
        New1 obj = new New1();
        
        int result = obj.add(new int[] {3 , 4, 5 ,6 });
        System.out.println(result);

    }
}
