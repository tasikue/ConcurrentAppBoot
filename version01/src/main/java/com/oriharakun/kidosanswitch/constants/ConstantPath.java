package com.oriharakun.kidosanswitch.constants;

/**
 * パスを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum ConstantPath {
    
    // 定数
    ARG_FIREFOX_PATH("C:\\Program Files\\Mozilla Firefox\\firefox.exe,https://fs5013-furi-sutao.github.io/java-bootcamp/,https://drive.google.com/drive/home,https://github.com/tasikue/java-Bootcamp-orihara"),
    ARG_VSCODE_PATH("C:\\Users\\swing\\scoop\\apps\\vscode\\current\\Code.exe"),
    ARG_GITBASH_PATH("C:\\Users\\swing\\scoop\\apps\\git\\current\\git-bash.exe"),
    ARG_OBS_PATH("C:\\Program Files\\obs-studio\\bin\\64bit\\obs64.exe");

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
