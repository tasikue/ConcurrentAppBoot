package com.oriharakun.kidosanswitch.mysetlist;

/**
 * 主にマイセットで使う定数INTクラス 
 */
public enum Counts{

    // 定数
    START_TARGET_FLAG(0), // 起動時のフラグ、外で管理する？
    
    ID_COUNT(1), // IDの桁数
    NAME_COUNT(6);  // 名前の桁数

    // フィールド
    private int count;

    // コンストラクタ
    private Counts(int count){
        this.count = count;
    }

    // メソッド
    public int getCount(){
        return this.count;
    }
}