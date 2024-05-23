package com.oriharakun.kidosanswitch.window;

/**
 * サイズを管理するクラス
 * 幅と高さを定数で保持
 */
public enum Dimensions{
    
    // 定数
    WINDOW_DIMENSION(280, 280*3/4),
    SWITCH_PANEL_DIMENSION(240, 240*1/4),
    RUNTIME_BUTTON_DIMENSION(120, 120*3/8);

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
