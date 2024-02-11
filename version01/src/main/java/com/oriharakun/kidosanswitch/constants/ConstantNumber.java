package com.oriharakun.kidosanswitch.constants;

/**
 * 数値を管理するクラス
 * @auther oriharakun
 * @version 1.0
 */
public enum ConstantNumber {
    
    // 定数
    WINDOW_WIDTH(280),
    WINDOW_HEIGHT(WINDOW_WIDTH.elementNumber * 3/4),
    LUNTIME_BUTTON_WIDTH(200),
    LUNTIME_BUTTON_HEIGHT(LUNTIME_BUTTON_WIDTH.elementNumber * 1/2),
    LUNTIME_BUTTON_X(50),
    LUNTIME_BUTTON_Y(50),;

    // フィード
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
