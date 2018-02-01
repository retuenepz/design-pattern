package com.hongyb.toy;

/**
 * Created by hongyanbo on 2018/2/1.
 */
public class Captain implements RowingBoat{
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
