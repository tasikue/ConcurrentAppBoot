package com.oriharakun.kidosanswitch.switchwindow.button.buttonaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

import com.oriharakun.kidosanswitch.setlist.*;
import com.oriharakun.kidosanswitch.switchwindow.targetflag;

public class OpenAppAction implements ActionListener{

    // 変数
    JButton button;
    MysetPathRead mpr = new MysetPathRead();

    // コンストラクタ
    public OpenAppAction(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == button){

            // アクティブになってるボタンで決まる
            for(int i=0; i<mpr.getAllMysetCount(); i++){
                if(mpr.getMysetList().get(i).getMysetId() == targetflag.getIndexTargetFlagTrue()){
                    for(String path : mpr.getMysetList().get(i).getRuntimePath()){
                        openApp(path.split(","));
                    }
                }
            }
        }
    }
    
    /**
     * パスで指定したアプリケーションを起動
     */
    private void openApp(String[] path){
        String[] argAppPath = path;

        try {
            Runtime.getRuntime().exec(argAppPath);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
