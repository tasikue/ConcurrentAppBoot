package com.oriharakun.concurren_app_boot.prototype02;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ActionPrototype01 implements ActionListener{

    // 変数
    JButton button;
    String[] argFirefoxPath = {"C:\\Program Files\\Mozilla Firefox\\firefox.exe", "https://fs5013-furi-sutao.github.io/java-bootcamp/", "https://drive.google.com/drive/home", "https://github.com/tasikue/java-Bootcamp-orihara"};
    String[] argVSCodePath = {"C:\\Users\\swing\\scoop\\apps\\vscode\\current\\Code.exe"};
String[] argGitBashPath = {"C:\\Users\\swing\\scoop\\apps\\git\\current\\git-bash.exe"};


    public ActionPrototype01(JButton button){
        this.button = button;
    }

    // ボタンクリック時のアクション
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == button) {
            openApp(argFirefoxPath);
            openApp(argVSCodePath);
            openApp(argGitBashPath);
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
