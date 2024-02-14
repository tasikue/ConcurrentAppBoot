package com.oriharakun.kidosanswitch.setlist;

import java.util.List;
import java.util.ArrayList;

import com.oriharakun.kidosanswitch.constants.ConstantPath;

public class MysetPathRead {

    ConstantPath[] ARG_PATH = ConstantPath.values();
    List<Myset> mysetList = new ArrayList<>();
    final int MAX_SET_COUNT = 9;
    
    public MysetPathRead(){

        // インデックスで区切りRuntimePathに分ける
        for(int i=0; i<MAX_SET_COUNT; i++){
            List<String> tempList = new ArrayList<>();

            for(int j=0; j<ARG_PATH.length; j++){
                if(Character.getNumericValue(ARG_PATH[j].getElement().charAt(0)) == i){
                    
                    // 1文字目はセットIDになるためpathだけ取り出す
                    tempList.add(ARG_PATH[j].getElement().substring(1));
                }
            }

            mysetList.add(new Myset(tempList, "namae", i));
        }
    }

    public List<Myset> getMysetList(){
        return mysetList;
    }
}
