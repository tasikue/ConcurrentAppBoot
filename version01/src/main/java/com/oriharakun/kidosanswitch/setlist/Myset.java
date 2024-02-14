package com.oriharakun.kidosanswitch.setlist;

import java.util.List;

public class Myset {

    private List<String> runtimePath;
    private String mysetName;
    private int mysetId;
    private boolean targetFlag;

    public Myset(List<String> runtimePath, String mysetName, int mysetId){
        
        this.runtimePath = runtimePath;
        this.mysetName = mysetName;
        this.mysetId = mysetId;
        targetFlag = false;
    }

    public List<String> getRuntimePath() {
        return runtimePath;
    }

    public String getMysetName() {
        return mysetName;
    }

    public int getMysetId() {
        return mysetId;
    }
    
    public boolean getTargetFlag(){
        return targetFlag;
    }
    /**
     * targetFragをtrueにする
     */
    public void setTrueTargetFlag(){
        targetFlag = true;
    }

    /**
     * targetFlagをfalseにする
     */
    public void setFalseTargetFlag(){
        targetFlag = false;
    }
}
