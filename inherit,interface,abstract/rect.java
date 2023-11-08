public class rect extends shape{
    public void rect(){
        System.out.println("I am a rectangle");
    }
    public void rect(int x, int y){
        width = x;
        height = y;
    }
    public int calcArea(){
        return width * height;
    }
    @Override
    public void draw() {
        //TODO 自动生成的方法存根
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}