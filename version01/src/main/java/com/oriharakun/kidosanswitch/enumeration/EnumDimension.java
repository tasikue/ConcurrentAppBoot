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
    SWITCH_PANEL_DIMENSION(new Dimension(240, 240*1/4)),
    RUNTIME_BUTTON_DIMENSION(new Dimension(120, 120*3/8));

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
