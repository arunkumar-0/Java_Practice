class Calc {
    public int add (int n1 , int n2){
       int res =  n1 + n2;
       return res;
    }

    public int add (int n1 , int n2,int n3){
       int res =  n1 + n2 +n3;
       return res;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
            Calc obj = new Calc();
            int res = obj.add(7, 9 );
            int res2 = obj.add(8 , 9 , 2 );
            System.out.println(res);
            System.out.println(res2);
    }

}
