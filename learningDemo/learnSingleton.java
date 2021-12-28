package learningDemo;

public class learnSingleton {
    private learnSingleton(){
        System.out.println("creating a Singleton variable");
    }
    private static learnSingleton a = new learnSingleton();
    public learnSingleton get(){
        return a;
    }
}
// 如何得到一个singleton的量？
// 1. 构造器私有
// 2. 构造一个私有的 static的变量
// 3. 通过public的函数返回这个量的引用
