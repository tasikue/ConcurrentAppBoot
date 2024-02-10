package com.oriharakun.concurren_app_boot.prototype01;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ActionPrototype01 implements ActionListener{

    // 変数
    JButton button;
    String[] argAtomPath = {"C:\\Users\\swing\\AppData\\Local\\atom\\atom.exe", "01"};
    String[] argFfftpPath = {"C:\\Users\\swing\\Documents\\ソフトウェア\\ffftp-v5.8-x64\\ffftp.exe", "01"};


    public ActionPrototype01(JButton button){
        this.button = button;
    }

    // ボタンクリック時のアクション
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == button) {
            openApp(argAtomPath);
            openApp(argFfftpPath);
        }
    }

    /**
     * パスで指定したアプリケーションを起動
     */
    public void openApp(String[] path){
        String[] argAppPath = path;

        try {
            Runtime.getRuntime().exec(argAppPath);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
