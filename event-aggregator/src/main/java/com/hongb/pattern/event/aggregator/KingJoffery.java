package com.hongb.pattern.event.aggregator;

/**
 * 监听首相的工作
 * 有了首相国王就不需要去对接那么多人，只要跟首相对接就可以处理工作了。
 */
public class KingJoffery  implements EventObserver{

    @Override
    public void onEvent(Event e) {
        System.out.println("接受到了来自首相的报告："+e.toString());
    }
}
