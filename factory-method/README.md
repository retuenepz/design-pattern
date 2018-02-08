## 别名
Virtual Constructor

## 目的
定义一个工厂接口，让子类决定初始化方式。想要改变所使用的类，只要改变工厂即可。

![alt text](./etc/presentation.png "factory method")

## 解释
Real world example

> 铁匠制造武器。精灵需要精灵武器，兽人需要兽人武器，什么样的客人就找什么样的铁匠。

In plain words

> 将类的初始化行为放到子类当中实现。


## 使用时机

* 工厂自己不知道客户到底要使用什么对象。
* 希望由子类来决定创建什么对象

## Presentations

* [Factory Method Pattern](etc/presentation.png)

## Real world examples

* [java.util.Calendar](http://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--)
* [java.util.ResourceBundle](http://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html#getBundle-java.lang.String-)
* [java.text.NumberFormat](http://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getInstance--)
* [java.nio.charset.Charset](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html#forName-java.lang.String-)
* [java.net.URLStreamHandlerFactory](http://docs.oracle.com/javase/8/docs/api/java/net/URLStreamHandlerFactory.html#createURLStreamHandler-java.lang.String-)
* [java.util.EnumSet](https://docs.oracle.com/javase/8/docs/api/java/util/EnumSet.html#of-E-)
* [javax.xml.bind.JAXBContext](https://docs.oracle.com/javase/8/docs/api/javax/xml/bind/JAXBContext.html#createMarshaller--)

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
