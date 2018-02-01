package com.hongyb.toy;

/**
 * Created by hongyanbo on 2018/2/1.
 */
public class App {
    public static void main(String[] args) {

        Captain captain = new Captain(new FishingBoatAdapter(new FishingBoat()));
        captain.row();
    }
}
