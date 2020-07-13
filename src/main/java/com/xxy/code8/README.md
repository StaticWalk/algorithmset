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

Stream 流只能被消费一次，可以连接起来的流操作是中间操作，关闭流的操作的是终端操作。
生成流的方法：stream()创建穿行流  +  parallelStream()创建并行流
中间：
map(String::length) //map(Dish::getName)  flatMap(流扁平化！)映射每个元素到对应的结果
filter 过滤出元素
limit + skip(2) 获取指定数量的流
sorted 对流进行排序
distinct 去重
终端：
forEach 用来遍历流中每个数据
count
collect

查找和匹配：
allMatch boolean 
anyMatch(Dish::isVegetarian) boolean 是否有一个元素能匹配给定的谓词
noneMatch 与allMatch相对
findFirst
findAny Optional<List<T>> 返回当前流中的任意元素

归约操作 流折叠：
求和  int sum = numbers.stream().reduce(0,(a,b) -> a+b)
最大值、最小值  Optional<Integer> max = numbers.stream().reduce(Integer::max)  














