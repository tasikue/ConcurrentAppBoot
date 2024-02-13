package com.oriharakun.kidosanswitch.setlist;

public class MysetManagement {

    RuntimePathManagement rpm = new RuntimePathManagement();

    Myset javaMyset = new Myset(rpm.getJavaSet(), "java", 1);
    Myset splaMyset = new Myset(rpm.getSplaSet(), "スプラ", 2);

    public Myset getjavaMyset(){
        return javaMyset;
    }

    public Myset getSplaMyset(){
        return splaMyset;
    }
}
