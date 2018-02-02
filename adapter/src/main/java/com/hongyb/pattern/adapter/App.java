package com.hongyb.pattern.adapter;

/**
 * 这种是 对象适配模式，class适配模式并没有给出示例。不要误会哟。
 * Created by hongyanbo on 2018/2/1.
 */
public class App {
    public static void main(String[] args) {

        Captain captain = new Captain(new FishingBoatAdapter(new FishingBoat()));
        captain.row();
    }
}
