public class B extends A{
    public B(){
        System.out.println("333");
    }
    public B(int a){
        System.out.println("444");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        new B();
        System.out.println("================================================================");
        new B(10);
    }
}