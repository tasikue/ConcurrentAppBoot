package com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.oriharakun.kidosanswitch.switchwindow.menubar.MenuItem;

public class MysetAction implements ActionListener{
    
    MenuItem menuItem;

    public MysetAction(MenuItem menuItem){
        this.menuItem = menuItem;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == menuItem){
            // ここにフラグを切り替える
            System.out.println("!");
        }
    }
}
