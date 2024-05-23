package com.oriharakun.kidosanswitch.window.menubar;

import com.oriharakun.kidosanswitch.mysetlist.ListSet;

/**
 * targetflag
 * タブ切り替えのフラグを管理するクラス
 * @author orihara
 * @version 1.0
 */
public class targetflag {

    static ListSet mpr = new ListSet();

    /**
     * リストの中からターゲットになってるフラグのインデックスを返す
     * @return ターゲットになってるフラグのインデックス
     */
    public static int getIndexTargetFlagTrue(){

        for(int i=0; i<mpr.getAllMysetCount(); i++){
            if(mpr.getMysetList().get(i).getTargetFlag()){
                return i;
            }
        }

        return -1;
    }

    /**
     * フラグをセットする
     * @param targetId ターゲットになるリストのID
     */
    public static void setTargetFlag(int targetId){
        mpr.setTrueMysetTargetFlag(targetId);
    }
}