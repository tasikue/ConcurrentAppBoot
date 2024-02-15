package com.oriharakun.kidosanswitch.constants;

/**
 * 名前やラベルを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum ConstantNumber {
    
    // 定数
    MAX_SET_COUNT(9), // 登録できるマイセットの限界（暫定）
    ID_COUNT(1), // IDの桁数
    NAME_COUNT(6); // 名前の桁数

    // フィールド
    private int elementNumber;

    // コンストラクタ
    private ConstantNumber(int elementNumber){
        this.elementNumber = elementNumber;
    }

    // メソッド
    public int getElement(){
        return this.elementNumber;
    }
}
