package com.oriharakun.kidosanswitch.variables;

import java.util.ArrayList;
import java.util.List;

public class VariablesRuntimePath {

    List<String> path = new ArrayList<>();
    private int runtimeId; // 起動グループid
    private int individualId; // グループ内の個別id

    public VariablesRuntimePath(int runtimeId, int individualId, String[] argStr){

        this.runtimeId = runtimeId;
        this.individualId = individualId; 
        
        for(String str : argStr){
            path.add(str);
        }
    }

    public int getRuntimeId(){
        return this.runtimeId;
    }

    public int getIndividualId(){
        return this.individualId;
    }

    public List<String> getPath(){
        return this.path;
    }
}
