package learningDemo.learnInterface;

/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/25
 * @ Time 4:14 下午
 */
public class learnConstant {
    public static void main(String[] args){
        System.out.println( constant.A );
//        constant.A = 2; final int不可改变
    }
}

// 可以用interface来构建grouping constant
// 因为interface的内部成员变量是自动static final的
// 比如使用interface构建一个month的enum