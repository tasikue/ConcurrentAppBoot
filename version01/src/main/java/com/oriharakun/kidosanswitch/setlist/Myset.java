package com.oriharakun.kidosanswitch.setlist;

public class Myset {

    private RuntimePath runtimePath;
    private String mysetName;
    private int mysetId;
    private boolean targetFlag;

    public Myset(RuntimePath runtimePath, String mysetName, int mysetId){
        
        this.runtimePath = runtimePath;
        this.mysetName = mysetName;
        this.mysetId = mysetId;
        targetFlag = false;
    }

    public RuntimePath getRuntimePath() {
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
