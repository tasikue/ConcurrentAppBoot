package com.oriharakun.kidosanswitch.setlist;

import java.util.List;

import com.oriharakun.kidosanswitch.enumeration.EnumMysetPath;
import com.oriharakun.kidosanswitch.enumeration.EnumNumber;

import java.util.ArrayList;

/**
 * ここで取得したパスを分解して収納する
 */
public class MysetPathRead {

    // 規則: セットID(数字1文字) + セット名(6文字) + 起動パス
    EnumMysetPath[] ARG_PATH = EnumMysetPath.values();

    List<Myset> mysetList = new ArrayList<>();

    // 変数
    private int mysetCount;
    
    public MysetPathRead(){
        setMysetList();
        setTrueMysetTargetFlag(EnumNumber.START_TARGET_FLAG.getElement());
    }

    /**
     * 規則付けられたマイセットパスを読み込んでまとめる処理
     * 暫定対応として列挙型に記述したものを読み込んでる
     */
    private void setMysetList(){

        // インデックスで区切りRuntimePathに分ける
        for(int i=0; i<EnumNumber.MAX_SET_COUNT.getElement(); i++){
            List<String> tempList = new ArrayList<>();
            String tempSetName = "名無しセット";

            for(int j=0; j<ARG_PATH.length; j++){

                int mysetId = Character.getNumericValue(ARG_PATH[j].getElement().charAt(0));
                updateMysetCount(mysetId);
                if(mysetId == i){
                    int idEndIndex = EnumNumber.ID_COUNT.getElement();
                    int nameEndIndex = idEndIndex + EnumNumber.NAME_COUNT.getElement();
                    
                    // セット名, 空欄である"_"を取り除く
                    tempSetName = ARG_PATH[j].getElement().substring(idEndIndex, nameEndIndex).replace("_", "");

                    // 7文字目まではセットID+セット名になるためpathだけ取り出す
                    tempList.add(ARG_PATH[j].getElement().substring(nameEndIndex));
                }
            }

            mysetList.add(new Myset(tempList, tempSetName, i));
        }
    }

    /**
     * マイセットの最大個数を更新する
     * @param mysetId マイセットID
     */
    private void updateMysetCount(int mysetId){

        if(mysetId >= mysetCount){
            mysetCount = mysetId;
        }
    }

    /**
     * @return マイセットリスト
     */
    public List<Myset> getMysetList(){
        return mysetList;
    }

    /**
     * @return マイセットの個数
     */
    public int getAllMysetCount(){
        return mysetCount+1;
    }

    /**
     * すべてのターゲットフラグをオフにする
     */
    private void setAllFalseMysetTargetFlag(){
        
        for(int i=0; i<this.getAllMysetCount(); i++){
            mysetList.get(i).setFalseTargetFlag();
        }
    }

    /**
     * 指定のターゲットフラグをオンにする
     * @param mysetId ターゲットのフラグ
     */
    public void setTrueMysetTargetFlag(int mysetId){
        this.setAllFalseMysetTargetFlag();

        mysetList.get(mysetId).setTrueTargetFlag();
    }
}
