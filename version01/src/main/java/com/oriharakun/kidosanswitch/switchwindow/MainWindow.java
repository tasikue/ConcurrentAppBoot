package com.oriharakun.kidosanswitch.switchwindow;

import java.awt.*;

import com.oriharakun.kidosanswitch.switchwindow.frame.*;
import com.oriharakun.kidosanswitch.switchwindow.panel.*;
import com.oriharakun.kidosanswitch.switchwindow.button.*;

public class MainWindow {

    public static void main(String[] args) {
        SwitchFrame sf = new SwitchFrame();
        SwitchPanel p1 = new SwitchPanel();
        RuntimeButton rb = new RuntimeButton();

        Container contentPane = sf.getContentPane();
        p1.add(rb);
        contentPane.add(p1);
    }
}
