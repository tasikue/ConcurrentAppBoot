package com.oriharakun.kidosanswitch.constants;

/**
 * パスやリンクを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum ConstantPath {
    
    // 定数
    ICON_PATH("C:\\\\Users\\\\swing\\\\scoop\\\\apps\\\\vscode\\\\current\\\\data\\\\ConcurrentAppBoot\\\\icon\\\\momo3.png");

    // フィールド
    private String elementPath;

    // コンストラクタ
    private ConstantPath(String elementPath){
        this.elementPath = elementPath;
    }

    // メソッド
    public String getElement(){
        return this.elementPath;
    }
}