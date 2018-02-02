## 这个模式是干啥的
blaking pattern ： 一个对象如果不在某个特定的状态时就不能执行某些代码

![alt text](./etc/balking.png "Balking")

## 什么时候适合用

* 只在某个状态下才能调用(invoke)目标对象的一个行为(action)
* 对象总是处在一个要暂停的状态，但是不知道要暂停多久。

# tips
 要看懂洗衣机的例子可能需要一点java8的知识。如果不懂可以看这个[博客](http://zh.lucida.me/blog/java-8-lambdas-insideout-language-features/)

## 相关模式
* Guarded Suspension Pattern
* Double Checked Locking Pattern
