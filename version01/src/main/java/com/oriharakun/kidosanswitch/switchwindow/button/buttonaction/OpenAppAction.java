package com.oriharakun.kidosanswitch.switchwindow.button.buttonaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

import com.oriharakun.kidosanswitch.setlist.*;

public class OpenAppAction implements ActionListener{

    // 変数
    JButton button;
    MysetManagement mm = new MysetManagement();


    // コンストラクタ
    public OpenAppAction(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == button){

            // 定数1はマイセットid, アクティブになってるボタンで決まる
            if(mm.getjavaMyset().getMysetId() == 1){
                for(String path : mm.getjavaMyset().getRuntimePath().getPath()){
                    openApp(separateString(path));
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

    /**
     * カンマでStringを配列に分解する
     * これは後でクラスに切り離す
     */
    private String[] separateString(String text){
        return text.split(",");
    }
}
