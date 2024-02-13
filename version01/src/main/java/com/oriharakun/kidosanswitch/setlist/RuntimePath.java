package com.oriharakun.kidosanswitch.setlist;

import java.util.ArrayList;
import java.util.List;

public class RuntimePath {

    List<String> runtimePath = new ArrayList<>();

    public RuntimePath(String... pathString){ 
        
        for(String str : pathString){

            runtimePath.add(str);
        }
    }

    public List<String> getPath(){
        return this.runtimePath;
    }
}
