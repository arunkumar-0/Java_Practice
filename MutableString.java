class MutableString {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("ARUN");
        System.out.println(name);
        name.append(" KUMAR");
        System.out.println(name);

        //final keyword - it makes the natire of variable as constant

       final StringBuilder cls = new StringBuilder("tenth");
        cls.append("nine");

        // cls = new StringBuilder("Tenth");        
        // after using final keyword this line is not possible
        
        System.out.println(cls);

    }
}