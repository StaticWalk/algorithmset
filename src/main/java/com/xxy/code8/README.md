Java8实战（看目录很吸引人，希望内容精彩）
花最少的时间写出更清晰、更简洁的代码！
mark目录中感兴趣的点：
流处理
函数式编程的其他好思想
匿名类
函数式接口
Optional
CompletableFuture组合式异步编程


1.
Unix
cat file1 file2 | tr "[A-Z]" "[a-z]" | sort |tail -3
！！把这样的流变成那样的流

没有共享的可变数据，键方法和函数传递给其他方法的能力

::把布尔方法作为值
File[] hiddeniFiles = new File(".").listFiles(File::isHidden) 
```aidl

 new FileFilter(){
    public boolean accept(File file){
        return file.isHidden();
        }
 }
```

optional + 模式匹配


2.
行为参数化  (谓词predicate ??)
函数式接口就是只定义一个抽象方法的接口
lambda区别：表达式  xxx --- 语句 {xxx;}
环绕执行模式（装饰器模式、模板方法）：

!!! 函数式接口和函数描述符
Predicate<T> bool test();
Consumer<T> void accept
Function<T> R apply(T t)  (输入T，输出R，需要将输入对象的信息映射搭配输出时使用) 






