package com.oriharakun.concurren_app_boot.prototype01;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionPrototype01 implements ActionListener{

    JButton button;

    public ActionPrototype01(JButton button){
        this.button = button;
    }

    // ボタンクリック時のアクション
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == button) {
            System.out.println("!");
        }
    }
}
