package OOP.classes;
public class classesintro4constructortask2 {
    public static class Rectangle{
        int width;
        int height;

        Rectangle(int w, int h){
            width = w;
            height = h;
        }

        int area(){
            return width * height;
        }
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(50, 23);
        System.out.println(r1.area());
        Rectangle r2 = new Rectangle(3, 7);
        System.out.println(r2.area());
    }
}
