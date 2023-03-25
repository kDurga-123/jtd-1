class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str="yesterday";
        String bag="";
        for(int i=str.length()-1;i>=0;i--){
            bag+=str.charAt(i);
        }
        System.out.println(bag);
    }
}
