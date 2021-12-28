package learningDemo;
//import java.util.io.*;

class learnCleanupFather {
    learnCleanupFather(int i) {
        System.out.println("Father:" + i);
    }

    void cleanup() {
        System.out.println("Father cleanup");
    }
}

public class learnCleanup extends learnCleanupFather {
    learnCleanup() {
        super(5);
        System.out.println("Son:" + 6);
    }

    void cleanup() {
//        super.cleanup();
        System.out.println("Son cleanup");
        super.cleanup();
    }

    public static void main(String[] args) {
        learnCleanup a = new learnCleanup();
        a.cleanup();
    }
}

// 销毁顺序和构造顺序相反
// java没有自己的析构函数