package com.oriharakun.kidosanswitch.enumeration;

/**
 * 名前やラベルを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum EnumNumber {
    
    // 定数
    MAX_SET_COUNT(9), // 登録できるマイセットの限界（暫定）
    ID_COUNT(1), // IDの桁数
    NAME_COUNT(6), // 名前の桁数
    START_TARGET_FLAG(1); // 起動時のフラグ

    // フィールド
    private int elementNumber;

    // コンストラクタ
    private EnumNumber(int elementNumber){
        this.elementNumber = elementNumber;
    }

    // メソッド
    public int getElement(){
        return this.elementNumber;
    }
}
