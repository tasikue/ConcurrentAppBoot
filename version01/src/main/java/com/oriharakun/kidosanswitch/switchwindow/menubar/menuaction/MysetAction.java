package com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.oriharakun.kidosanswitch.switchwindow.MainWindow;
import com.oriharakun.kidosanswitch.switchwindow.targetflag;
import com.oriharakun.kidosanswitch.switchwindow.menubar.MenuItem;

public class MysetAction implements ActionListener{
    
    private MenuItem menuItem;
    private int targetId;

    public MysetAction(MenuItem menuItem, int targetId){
        this.menuItem = menuItem;
        this.targetId = targetId;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == menuItem){

            // ここにフラグを切り替える
            targetflag.setTargetFlag(targetId);
            // メニューバーの更新
            MainWindow.updateMenuber();
        }
    }
}
