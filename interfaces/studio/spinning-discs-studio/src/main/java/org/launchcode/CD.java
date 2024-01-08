package org.launchcode;

public class CD extends BaseDisc {


    private static final CD discType = null;
    private static final int spinRate = 50;
    private boolean hasMusic;


    public CD(int id, String name) {
        super(id, name, String.valueOf(discType), spinRate);
        this.hasMusic = hasMusic;
        setDiscType(hasMusic ? "Yeah Tunes!" : "Nah Bro");
    }


}
