package com.example.demo12.model;

public class NodongDTO {
    private String empmCt;
    private String newJhntNmpr;
    private String newJoNmpr;

    public String getEmpmCt() {
        return empmCt;
    }

    public void setEmpmCt(String empmCt) {
        this.empmCt = empmCt;
    }

    public String getNewJhntNmpr() {
        return newJhntNmpr;
    }

    public void setNewJhntNmpr(String newJhntNmpr) {
        this.newJhntNmpr = newJhntNmpr;
    }

    public String getNewJoNmpr() {
        return newJoNmpr;
    }

    public void setNewJoNmpr(String newJoNmpr) {
        this.newJoNmpr = newJoNmpr;
    }

    @Override
    public String toString(){
        return  "취업건수:"  + empmCt+
                "신규 구직 건수:"+newJhntNmpr+
                "신규 구직 인원수:"+newJoNmpr+ "\n";
    }

}


