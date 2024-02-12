package com.oriharakun.kidosanswitch.variables;

import java.util.ArrayList;
import java.util.List;

public class VariablesRuntimePathManagement {

    List<VariablesRuntimePath> pathList = new ArrayList<>();
 
    String[] argFirefoxPath = {"C:\\Program Files\\Mozilla Firefox\\firefox.exe", "https://fs5013-furi-sutao.github.io/java-bootcamp/", "https://drive.google.com/drive/home", "https://github.com/tasikue/java-Bootcamp-orihara"};
    String[] argVSCodePath = {"C:\\Users\\swing\\scoop\\apps\\vscode\\current\\Code.exe"};
    String[] argGitBashPath = {"C:\\Users\\swing\\scoop\\apps\\git\\current\\git-bash.exe"};

    int totalRuntime = 1;
    int totalIndvidual = 3; 
    
    public VariablesRuntimePathManagement(){

        pathList.add(new VariablesRuntimePath(1, 1, argFirefoxPath));
        pathList.add(new VariablesRuntimePath(1, 2, argVSCodePath));
        pathList.add(new VariablesRuntimePath(1, 3, argGitBashPath));
    }

    public String[] getArrayPath(int runtimeId, int individualId){

        String[] arrayPath = {""};

        for(int i=0; i<pathList.size(); i++){
            VariablesRuntimePath tmpPath = pathList.get(i);

            if(tmpPath.getRuntimeId() == runtimeId){
                if(tmpPath.getIndividualId() == individualId){
                    arrayPath = tmpPath.getPath().toArray(new String[tmpPath.getPath().size()]);
                    return arrayPath;
                }
            }
        }
        return arrayPath;
    }
}
