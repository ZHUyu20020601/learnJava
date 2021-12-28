package learningDemo.learnInheritfile;

public class learnInherit {
    public learnInherit(){
        System.out.println("Father");
    }
    void dosth(){
        System.out.println("Father.doSomething");
    }
    public static void main(String[] args){
        learnInherit a = new learnInherit();
        a.dosth();
    }
}
// do 是java的keyword不能用作函数名