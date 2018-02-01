package com.hongyb.toy;

/**
 * 适配器类
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
