package learningDemo.learnInterface;

/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/25
 * @ Time 4:21 下午
 */
public class learnInterfaceInit {
    public static void main(String[] args){
//        randp value = new randp();
//  在使用interface做全局变量或者constant的时候不需要实例化
        double d = randp.RandomDouble;
        double e = randp.RandomDouble;
        System.out.println("d:"+d);
        System.out.println("e:"+e);
        //randp初始化后随机数不会改变，static只会初始化一次
    }
}

