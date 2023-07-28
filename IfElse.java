public class IfElse {
    public static void main(String[] args) {
        int price = 20000 ; 
        if (price <= 20000 && price > 3000){
            if(price > 4000 ){
                System.out.println("price above 4000");
            }else{
                System.out.println("price suitable");
            }
            
        }else if(price > 20000){
            System.out.println("you can't buy ");
        }else{
            System.out.println("nothing to buy");
        }

    }
}
