## 难度系数：初级
## 用来干啥
将一块代码交给其他代码来执行，让其他代码来决定自己何时执行。

![alt text](./etc/callback.png "Callback")

## 啥时候用

* 一些行为必须要在另外一些行为执行后再执行（老铁这么翻译没毛病）

## tips
注意这个工程有两个主函数哟 App 和 LambdaApp

## jdk里边的例子

* [CyclicBarrier](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CyclicBarrier.html#CyclicBarrier%28int,%20java.lang.Runnable%29) constructor can accept callback that will be triggered every time when barrier is tripped.
