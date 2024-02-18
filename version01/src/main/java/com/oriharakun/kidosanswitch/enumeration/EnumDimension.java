package com.oriharakun.kidosanswitch.enumeration;

import java.awt.Dimension;

/**
 * サイズを管理するクラス
 * @auther oriharakun
 * @version 1.0
 */
public enum EnumDimension{
    
    // 定数
    WINDOW_DIMENSION(new Dimension(280, 280*3/4)),
    SWITCH_PANEL_DIMENSION(new Dimension(200, 200*1/2)),
    RUNTIME_BUTTON_DIMENSION(new Dimension(100, 100*1/2));

    // フィード
    private Dimension elementNumber;

    // コンストラクタ
    private EnumDimension(Dimension elementNumber){
        this.elementNumber = elementNumber;
    }

    // メソッド
    public Dimension getElement(){
        return this.elementNumber;
    }
}
