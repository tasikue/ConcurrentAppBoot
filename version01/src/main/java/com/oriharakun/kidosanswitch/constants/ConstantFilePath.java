package com.oriharakun.kidosanswitch.constants;

/**
 * 名前やラベルを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum ConstantFilePath {
    
    // 定数
    ICON_PATH("C:\\\\Users\\\\swing\\\\scoop\\\\apps\\\\vscode\\\\current\\\\data\\\\ConcurrentAppBoot\\\\icon\\\\momo3.png");

    // フィールド
    private String elementPath;

    // コンストラクタ
    private ConstantFilePath(String elementPath){
        this.elementPath = elementPath;
    }

    // メソッド
    public String getElement(){
        return this.elementPath;
    }
}
