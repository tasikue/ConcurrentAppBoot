package com.oriharakun.kidosanswitch.constants;

/**
 * 名前やラベルを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum ConstantName {
    
    // 定数
    FRAME_MAIN_TITLE("きどうさんスイッチ");

    // フィールド
    private String elementName;

    // コンストラクタ
    private ConstantName(String elementName){
        this.elementName = elementName;
    }

    // メソッド
    public String getElement(){
        return this.elementName;
    }
}
