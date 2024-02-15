package com.oriharakun.kidosanswitch.constants;

/**
 * 名前やラベルを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum ConstantName {
    
    // 定数
    FRAME_MAIN_TITLE("きどうさんスイッチ"),
    RUNTIME_BUUTON_LABEL("起動"),
    FILE_MENU_LABEL("ファイル"),
    FILE_SETTING_MENU_LABEL("設定"),
    FILE_ENDING_MENU_LABEL("終了"),
    MYSET_MENU_LABEL("マイセット"),
    MYSET_MENU_NOSET_TEXT("何も登録されていません");

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
