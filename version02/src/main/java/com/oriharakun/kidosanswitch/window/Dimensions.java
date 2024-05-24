package com.oriharakun.kidosanswitch.window;

/**
 * サイズを管理するクラス
 * 幅と高さを定数で保持
 */
public enum Dimensions{
    
    // 定数
    SWITCH_SCREEEN(280, 280*3/4),
    SETTING_SCREEN(600, 400),
    SWITCH_PANEL(240, 240*1/4),
    RUNTIME_BUTTON(120, 120*3/8);

    // フィード
    private int width;
    private int height;

    // コンストラクタ
    private Dimensions(int width, int height){
        this.width = width;
        this.height = height;
    }

    // メソッド
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
}
