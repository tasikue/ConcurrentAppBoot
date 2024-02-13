package com.oriharakun.kidosanswitch.setlist;

import com.oriharakun.kidosanswitch.constants.ConstantPath;

/**
 * とりあえずべた書きで実装
 * そのうちテキストから取得して作りたい
 */
public class RuntimePathManagement {

    // javaセット: javabootcampウェブサイト, VSCode, GitBath
    private RuntimePath javaSet = new RuntimePath(
        ConstantPath.ARG_FIREFOX_PATH.getElement(),
        ConstantPath.ARG_VSCODE_PATH.getElement(),
        ConstantPath.ARG_GITBASH_PATH.getElement()
    );

    // スプラ配信セット
    private RuntimePath splaSet = new RuntimePath(ConstantPath.ARG_OBS_PATH.getElement());
    
    public RuntimePath getJavaSet(){
        return javaSet;
    }

    public RuntimePath getSplaSet(){
        return splaSet;
    }
}
