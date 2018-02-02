package com.hongyb.toy;

/**
 * 通过对象适配 适配接口
 * Created by hongyanbo on 2018/2/1.
 */
public class FishingBoatAdapter implements RowingBoat {
    private FishingBoat fishingBoat;

    public FishingBoatAdapter(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }
    public void row() {
        this.fishingBoat.sail();
    }
}
