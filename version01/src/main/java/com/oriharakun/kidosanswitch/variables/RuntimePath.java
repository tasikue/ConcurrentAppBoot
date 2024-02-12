package com.oriharakun.kidosanswitch.variables;

import java.util.ArrayList;
import java.util.List;

public class RuntimePath {

    List<String> path = new ArrayList<>();
    private int individualId; // グループ内の個別id

    public RuntimePath(int runtimeId, int individualId, String[] argStr){

        this.individualId = individualId; 
        
        for(String str : argStr){
            path.add(str);
        }
    }

    public int getIndividualId(){
        return this.individualId;
    }

    public List<String> getPath(){
        return this.path;
    }
}
