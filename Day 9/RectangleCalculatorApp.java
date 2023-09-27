class Rectangle{
    int a,b;
    public int Area (){
        return a*b;
    }
    public int Parameter (){
        return 2*(a+b);
    }
}




public class RectangleCalculator {
    public static void main(String[] args) {
        Rectangle CallMethod = new Rectangle();
        CallMethod.a = 5;
        CallMethod.b = 5;
        System.out.println(CallMethod.Area());
        System.out.println(CallMethod.Parameter());
    }
}
