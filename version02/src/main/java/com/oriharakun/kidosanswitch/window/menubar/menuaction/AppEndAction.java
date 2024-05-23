package com.oriharakun.kidosanswitch.window.menubar.menuaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.oriharakun.kidosanswitch.window.menubar.MenuItem;

public class AppEndAction implements ActionListener{

    MenuItem menuItem;

    public AppEndAction(MenuItem menuItem){
        this.menuItem = menuItem;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == menuItem){
            System.exit(0);
        }
    }
    
}
