package com.oriharakun.kidosanswitch.switchwindow.button.buttonaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import com.oriharakun.kidosanswitch.variables.*;

public class OpenAppAction implements ActionListener{

    // 変数
    JButton button;
    VariablesRuntimePathManagement vrpm = new VariablesRuntimePathManagement();


    // コンストラクタ
    public OpenAppAction(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == button){
            
            for(int i=1; i<2; i++){
                for(int j=1; j<4; j++){
                    openApp(vrpm.getArrayPath(i, j));
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
