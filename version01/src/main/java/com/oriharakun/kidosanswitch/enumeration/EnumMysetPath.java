package com.oriharakun.kidosanswitch.enumeration;

import java.util.List;
import java.util.ArrayList;

/**
 * パスを管理する定数クラス
 * @author oriharakun
 * @version 1.0
 */
public enum EnumMysetPath {

    // 定数 規則: セットID(数字1文字) + セット名(6文字) + 起動パス
    ARG_FIREFOX_PATH("0java__C:\\Program Files\\Mozilla Firefox\\firefox.exe,https://fs5013-furi-sutao.github.io/java-bootcamp/,https://drive.google.com/drive/home,https://github.com/tasikue/java-Bootcamp-orihara"),
    ARG_VSCODE_PATH("0java__C:\\Users\\swing\\scoop\\apps\\vscode\\current\\Code.exe"),
    ARG_GITBASH_PATH("0java__C:\\Users\\swing\\scoop\\apps\\git\\current\\git-bash.exe"),
    ARG_OBS_PATH("1obs___C:\\Program Files\\obs-studio\\bin\\64bit\\obs64.exe");

    // フィールド
    private String elementPath;
    List<String> pathSend = new ArrayList<>();

    // コンストラクタ
    private EnumMysetPath(String elementPath){
        this.elementPath = elementPath;
    }

    // メソッド
    public String getElement(){
        return this.elementPath;
    }
}
