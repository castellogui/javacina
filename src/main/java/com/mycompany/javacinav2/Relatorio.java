package com.mycompany.javacinav2;

public class Relatorio {

    private int mediaTotal;
    private int mediaMaiores90;
    private int mediaEntre70E90;
    private int mediaEntre50E70;
    private int mediaMenores50;

    
    //GETs
    public int getTotal() {
        return mediaTotal;
    }

    public int getMaiores90() {
        return mediaMaiores90;
    }

    public int getEntre70E90() {
        return mediaEntre70E90;
    }

    public int getEntre50E70() {
        return mediaEntre50E70;
    }

    public int getMenores50() {
        return mediaMenores50;
    }

    //SETs
    public void setTotal(int mediaTotal) {
        this.mediaTotal = mediaTotal;
    }

    public void setMaiores90(int mediaMaiores90) {
        this.mediaMaiores90 = mediaMaiores90;
    }

    public void setEntre70E90(int mediaEntre70E90) {
        this.mediaEntre70E90 = mediaEntre70E90;
    }

    public void setEntre50E70(int mediaEntre50E70) {
        this.mediaEntre50E70 = mediaEntre50E70;
    }

    public void setMenores50(int mediaMenores50) {
        this.mediaMenores50 = mediaMenores50;
    }

}
