package com.oriharakun.kidosanswitch.mysetlist;

import java.util.List;

import com.oriharakun.kidosanswitch.Names;

import java.io.IOException;
import java.util.ArrayList;

/**
 * ここで取得したパスを分解して収納する
 */
public class ListSet {

    // 変数
    private int mysetCount;

    private List<Myset> mysetList = new ArrayList<>();
    private List<String> mysetTextList;
    
    /**
     * コンストラクタ
     */
    public ListSet(){
        // 規則: セットID(数字1文字) + セット名(6文字) + 起動パス
        try {
            mysetTextList = PathTextRead.read();
        } catch (IOException e){
            e.printStackTrace();
        }

        setMysetList();
        setTrueMysetTargetFlag(Counts.START_TARGET_FLAG.getCount());
    }

    /**
     * 規則付けられたマイセットパスを読み込んでまとめる処理
     */
    private void setMysetList(){

        // インデックスで区切りRuntimePathに分ける
        for(int i=0; i<mysetTextList.size(); i++){
            List<String> pathList = new ArrayList<>();
            String mysetName = Names.LIST_NANASHI_SET.getName();

            for(String path : mysetTextList){

                // マイセットIDを抽出
                // 現状マイセットIDが1文字なのでこの仕様
                // 登録できる数を増やすとき変更の必要あり
                int mysetId = Character.getNumericValue(path.charAt(0));
                updateMysetCount(mysetId);
                
                if(mysetId == i){
                    int idLastIndex = Counts.ID_COUNT.getCount();
                    int nameLastIndex = idLastIndex + Counts.NAME_COUNT.getCount();
                    
                    // セット名, 空欄である"_"を取り除く
                    mysetName = path.substring(idLastIndex, nameLastIndex).replace("_", "");

                    // 7文字目まではセットID+セット名になるためpathだけ取り出す
                    pathList.add(path.substring(nameLastIndex));
                }
            }

            mysetList.add(new Myset(pathList, mysetName, i));
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
