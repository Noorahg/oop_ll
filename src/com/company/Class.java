package com.company;

import java.util.Arrays;

public class Class {
    private int num;
    private String word;
    private int[]myarr;

    public Class(int num, String word, int[]myarr){
        this.num=num;
        this.word=word;
        this.myarr=myarr;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMyarr() {
        return myarr;
    }

    public void setMyarr(int[] myarr) {
        this.myarr = myarr;
    }
@Override
    public String toString(){
    return "Class{" +
            "number=" + num +
            ", word='" + word + '\'' +
            ", arr=" + Arrays.toString(myarr) +
            '}';
}

}
