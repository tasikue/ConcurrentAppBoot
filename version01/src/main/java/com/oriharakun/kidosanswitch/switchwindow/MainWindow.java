package com.oriharakun.kidosanswitch.switchwindow;

import com.oriharakun.kidosanswitch.switchwindow.frame.*;
import com.oriharakun.kidosanswitch.switchwindow.panel.*;
import com.oriharakun.kidosanswitch.switchwindow.button.*;
import com.oriharakun.kidosanswitch.switchwindow.menubar.*;

import com.oriharakun.kidosanswitch.setlist.MysetPathRead;

public class MainWindow {

    // とりあえずここでフラグ管理
    

    public static void main(String[] args) {
        SwitchFrame sf = new SwitchFrame();
        SwitchPanel p1 = new SwitchPanel();
        RuntimeButton rb = new RuntimeButton();
        SwitchMenuBar smb = new SwitchMenuBar();

        p1.add(rb);
        sf.setJMenuBar(smb);
        sf.add(p1);
        sf.setVisible(true);
    }
}
