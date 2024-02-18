package com.oriharakun.kidosanswitch.switchwindow;

import com.oriharakun.kidosanswitch.switchwindow.frame.*;
import com.oriharakun.kidosanswitch.switchwindow.button.*;
import com.oriharakun.kidosanswitch.switchwindow.menubar.*;

/**
 * メイン画面の組み立て
 * @author orihara
 * @version 1.0
 */
public class MainWindow {

    static SwitchFrame switchFrame = new SwitchFrame();
    static SwitchPanel switchPanelOne = new SwitchPanel();
    static RuntimeButton runtimeButton = new RuntimeButton();
    static SwitchMenuBar switchMenuBar = new SwitchMenuBar();

    public MainWindow(){
        // フレームセット
        switchPanelOne.add(runtimeButton);
        switchFrame.setJMenuBar(switchMenuBar);
        switchFrame.add(switchPanelOne);
        switchFrame.setVisible(true);
    }

    /**
     * メニューバー更新
     */
    public static void updateMenuber(){
        switchMenuBar = new SwitchMenuBar();
        switchFrame.setJMenuBar(switchMenuBar);
        switchFrame.setVisible(true);
    }
}
