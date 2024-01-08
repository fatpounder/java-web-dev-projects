package org.launchcode;

public class DVD extends BaseDisc {

    private boolean hasVideo;


    public DVD(int id, String name, String discType, int spinRate) {
        super(id, name, discType, spinRate);
        this.hasVideo = hasVideo;
        setDiscType(hasVideo ? "Yea Pics!" : "Nah Pics");
    }


}
