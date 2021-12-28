package learningDemo.learnInterface;
/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/25
 * @ Time 4:18 下午
 */
import java.util.*;
public interface randp {
    Random p = new Random();
    int RandomInt = p.nextInt();
    double RandomDouble = p.nextDouble();
}
// interface的成员变量不能是blank static
// 但是一开始可以不写明是多少，依靠函数来初始化