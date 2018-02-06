package com.hongb.pattern.event.aggregator;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        KingJoffery kingJoffery = new KingJoffery();
        // 国王监听首相，如果有其他人也想知道大臣们在干什么只要监听首相就可以了，不用一个一个监听所有人。
        KingsHand kingsHand = new KingsHand(kingJoffery);

        List<EventEmitter> emitters = new ArrayList<>();
        emitters.add(new LordBaelish(kingsHand));
        emitters.add(new LordVarys(kingsHand));
        emitters.add(new Scout(kingsHand));

        for (WeekDay day : WeekDay.values()) {
            for (EventEmitter emitter : emitters) {
                emitter.timePass(day);
            }
        }
    }
}
