---
layout: pattern
title: Adapter
folder: adapter
permalink: /patterns/adapter/
categories: Structural
tags:
 - Java
 - Gang Of Four
 - Difficulty-Beginner
---

## 别名
适配器模式(Wrapper)

## 意义
将一个接口转化成其他调用者想要的形式。适配器能够让接口互不兼容的类一起工作。

## 解释一下

现实说法

> 假设你有张内存卡里面存了不可描述的内容，你想把他存到电脑里面，这时候你就需要一个读卡器，那么这个例子中读卡器就是我们所说的适配器。
> 另外一个著名的例子就是，三项插头插不进两个口的插座里面，你需要一个转换器(适配器)才行
> 还有个例子就是翻译官(适配器)可以让两个语言不通的人明白对方的意思。

大白话

> 适配器模式能将一个对class A来讲不能使用的类转化的能使用。将不兼容变为兼容。

维基百科

> ***********(本内容需要翻墙才能查看)

**程序示例**

假设说一个Captain(船长)只会使用划艇，不会开帆船(FishingBoat)

现在有俩接口 `RowingBoat` and `FishingBoat`

```
public interface RowingBoat {
  void row();
}

public class FishingBoat {
  private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);
  public void sail() {
    LOGGER.info("帆船不用浆，全靠浪！");
  }
}
```

船长实现了接口 `RowingBoat` 拥有了划船的能力，并且拥有一条船可以划

```
public class Captain implements RowingBoat {

  private RowingBoat rowingBoat;

  public Captain(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  @Override
  public void row() {
    rowingBoat.row();
  }
}
```

现在海盗来了，船长必须跑，但是此时船长只有帆船可以用，凭他的能力无法使用。我们就需要一个适配器(adapter)来让船长使用帆船。

```
public class FishingBoatAdapter implements RowingBoat {

  private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoatAdapter.class);

  private FishingBoat boat;

  public FishingBoatAdapter() {
    boat = new FishingBoat();
  }

  @Override
  public void row() {
    boat.sail();
  }
}
```

这样船长 `Captain` 就可以用帆船 `FishingBoat` 来逃离海盗了(然而船长并没有意识到他划的是帆船)

```
Captain captain = new Captain(new FishingBoatAdapter());
captain.row();
```

## 什么时候用

* 你想使用一个存在的class，但是他的接口跟你需要的不匹配
* 你想让一个类可以被不相关的或者不可预见的类所复用。（就是说接口无法跟你兼容的类）
* 想要使用一些已经存在的子类，但是总不能每个都继承全都给他适配了吧，这时候可以用对象适配方法来直接适配他们的父类。
* 很多程序在用第三方库的时候会用适配器来解耦，这样如果要换其他库的时候就不用修改自己程序的代码了。

## 有哪些后果:
Class 和 object 适配器不太一样.对于class适配器（通过继承方式实现的适配器）

*	想要代理某个类和他的全部子类时，这招就不好使了。
*   可以覆盖一些被代理对象的行为，因为毕竟是要继承的嘛。
*   结构比较简单
*	introduces only one object, and no additional pointer indirection is needed to get to the adaptee.

object 适配器（通过直接关联被适配类实现的适配器，也就是本项目的做法）

*  一个适配器可以适配很多被适配者--就是说被适配的类和他所有的子类，还可以为所有被适配的类一次性的添加功能。
*  想要override被适配者变得更困难了，因为你要写子类去覆盖的同时修改适配器适配新的子类。


## 一些jdk里面的例子

* [java.util.Arrays#asList()](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList%28T...%29)
* [java.util.Collections#list()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-)
* [java.util.Collections#enumeration()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-)
* [javax.xml.bind.annotation.adapters.XMLAdapter](http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#marshal-BoundType-)
