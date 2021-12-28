package learningDemo.learnInheritfile;

public class learnInheritSon extends learnInherit {
    learnInheritSon(){
        System.out.println("Son");
    }
    void dosth(){
        System.out.println("Son:dosomething");
        super.dosth();
    }
    public static void main(String[] args){
        learnInheritSon b = new learnInheritSon();
        b.dosth();
    }
}

// * 注意在同一个文件夹（package）下不需要import
// * default函数在同一package下也是共用的，是package不是.java文件，更不是scope
// * 子类调用父类的函数用super.method()，在重写中也可以调用
// * 如果要用super来向上传值给constructor，super要写在第一行
// * 子类不会调用父类的main函数，因为main函数是static的

// * 注意在overload的时候，没有形参或者形参相同的同名函数，不能用返回类型来区分
