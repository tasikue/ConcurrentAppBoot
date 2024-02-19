package com.oriharakun.kidosanswitch.switchwindow.label;

import javax.swing.JLabel;

import com.oriharakun.kidosanswitch.enumeration.EnumName;
import com.oriharakun.kidosanswitch.setlist.MysetPathRead;

public class ProgramTitle extends JLabel{

    MysetPathRead mpr = new MysetPathRead();
    
    public ProgramTitle(){
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    /**
     * パスからアプリ名を取り出す処理
     * @param path 元のパス
     * @return アプリ名
     */
    private String getAppTitle(String path){
        String tempString = path;

        // .exe以降を切り離す
        int lastIndex = tempString.indexOf(EnumName.DOTEXE.getElement());
        tempString = tempString.substring(0, lastIndex);

        // 前を切り離す
        int firstIndex = tempString.lastIndexOf(EnumName.BACKSLASH.getElement());
        tempString = tempString.substring(firstIndex + 1);

        return tempString;
    }

    /**
     * マイセットすべてのアプリ名を文字列にする処理
     * @param mysetId マイセットID
     * @return すべてのアプリ名
     */
    public String getAllAppTitle(int mysetId){
        String tempString = "";

        for(int i=0; i<mpr.getAllMysetCount(); i++){
            if(mpr.getMysetList().get(i).getMysetId() == mysetId){
                for(String path : mpr.getMysetList().get(i).getRuntimePath()){
                    tempString += String.format(getAppTitle(path) + " ");
                }
            }
        }

        return tempString;
    }
}
