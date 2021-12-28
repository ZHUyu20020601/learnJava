package learnInterface;

/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/25
 * @ Time 11:36 上午
 */
class wind implements instrument {
    //    void play(){
    //        System.out.println("wind.play");
    //    }
    public void play() {
        System.out.println("wind.play");
    }

    public void adjust() {
        System.out.println("wind.adjust");
    }
}

public class music {
    static void perform(instrument x) {
        x.play();//注意到instrument的play其实没有实现，但是传进去的x会被downcast成wind
    }

    public static void main(String[] args) {
        wind x = new wind();
        music.perform(x);
    }
}
// interface被继承后所有函数都要以public具体实现
// 即使继承interface的类不是public，函数也要是public，否则缩小范围