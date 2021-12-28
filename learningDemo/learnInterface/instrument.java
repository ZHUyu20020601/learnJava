package learnInterface;

/**
 * @Auther ZHUYU
 * @Project IntelliJ IDEA
 * @Data 2021/12/25
 * @Time 11:32 上午
 */

public interface instrument {
    public void play();
    public void adjust();
    //接口里的函数默认是 public and abstract的，但还是可以声明
    //Idea里似乎是要明确指出public否则访问不到

}
