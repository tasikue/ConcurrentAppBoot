package com.oriharakun.kidosanswitch.window.menubar.menuaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.oriharakun.kidosanswitch.window.main.Switch;
import com.oriharakun.kidosanswitch.window.menubar.MenuItem;
import com.oriharakun.kidosanswitch.window.menubar.targetflag;

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
            Switch.updateMenuber();
        }
    }
}
