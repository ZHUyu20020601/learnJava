package learningDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ Auther ZHUYU
 * @ Project IntelliJ IDEA
 * @ Data 2021/12/26
 * @ Time 4:06 下午
 */
class student{
    String name;
    int code;

    student(int c,String s){
        name = s;
        code = c;
    }
    // attention：toString必须用public，因为是来自Object的函数
    public String toString(){
        return "NAME:"+name+"||"+"ID:"+code;
    }
}
public class learnIterator {
    public static void main(String[] args){
        ArrayList<student> students = new ArrayList<>();
        for(int i = 0;i < 6;i++){
            students.add(new student(i,("a"+i)));
        }
        Iterator<student> e = students.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }

        System.out.println("----foreach----");

        //foreach写法
        for(student t: students ){
            System.out.println(t);
        }
    }
}
/*
* 第一个ArrayList<student>必须说明类型，第二个则可以不用
* X.add是ArrayList的内置函数
* Iterator<T>来申请一个迭代器，指向一个container的量，比如ArrayList
* Next(),HasNext()都是迭代器的函数
* 用students.iterator()
*
* 如果写foreach语句，要申请一个数组内部元素的变量
* 比如(student t: students),students是数组名，t是对数组内元素的引用
 */
