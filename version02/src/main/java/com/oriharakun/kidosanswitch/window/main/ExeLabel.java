package com.oriharakun.kidosanswitch.window.main;

import javax.swing.JLabel;

import com.oriharakun.kidosanswitch.Names;
import com.oriharakun.kidosanswitch.mysetlist.ListSet;

/**
 * 指定の.EXEファイルのラベルを書き出すクラス
 */
public class ExeLabel extends JLabel{

    // マイセットに登録されたアプリのリスト
    private ListSet mysetList = new ListSet();
    
    /**
     * コンストラクタ
     */
    public ExeLabel(){
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
        int lastIndex = tempString.indexOf(Names.DOTEXE.getName());
        tempString = tempString.substring(0, lastIndex);

        // 前を切り離す
        int firstIndex = tempString.lastIndexOf(Names.BACKSLASH.getName());
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

        for(int i=0; i<mysetList.getAllMysetCount(); i++){
            if(mysetList.getMysetList().get(i).getMysetId() == mysetId){
                for(String path : mysetList.getMysetList().get(i).getRuntimePath()){
                    tempString += String.format(getAppTitle(path) + " ");
                }
            }
        }

        return tempString;
    }
}
