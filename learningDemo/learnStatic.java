package learningDemo;
import java.util.*;
public class learnStatic {
//  Sundea s = new Sundea();
//  Sundea a = Sundea.makeAsundea(); 无法从静态上下文引用非静态方法
    public static void main(String[] args){
        Sundea a = Sundea.makeAsundea();
    }
}

class Sundea{
    private Sundea(){
        System.out.println("a new sundea");
    }
//    public Sundea makeAsundea(){
//        return new Sundea();
//    }
//只有static方法才可以用类名加函数名来调用
//static声明和public等access声明无关
    static Sundea makeAsundea() {
        return new Sundea();
    }
    /*
    使用static{ sundea makeAsundea()……} 这种写法也可以
     */
}