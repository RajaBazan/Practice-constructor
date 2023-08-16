package hello.com;
class k{
    k(){
        System.out.println("I'm a constructor");
    }
    k(int x){

        System.out.println("I'm a overloaded constructor" + x);
    }}
    class Ali1  extends k{

        Ali1(){
            super(12);
            System.out.println("I'm a constructor of G");
        }
        Ali1(int x, int y){
            super(x);
            System.out.println("I'm overloaded constructor of G: " + y);
        }
    }


public class Prac_constructor {
    public static void main(String[] args) {
//        k key = new k();
        Ali1 g = new Ali1(14, 13);
    }
}
