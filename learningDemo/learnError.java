package learningDemo;

/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/25
 * @ Time 4:55 下午
 */
public class learnError{
    public static void main(String[] args) throws Exception{
        try{
            System.err.println("error from 'try'");
            throw new Exception();
        }catch(Exception e){
            System.out.println("error from 'catch1'");
            System.err.println("error from 'catch2'");
            e.printStackTrace();
        }
    }
}
/*result:
error from try
error from catch2
java.lang.Exception
	at learningDemo.learnError.main(learnError.java:13)
error from catch1
 */

//out和err的区别在于
//err的优先级更高，并且标红