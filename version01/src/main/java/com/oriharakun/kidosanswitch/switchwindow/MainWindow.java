package com.oriharakun.kidosanswitch.switchwindow;

import com.oriharakun.kidosanswitch.switchwindow.frame.*;
import com.oriharakun.kidosanswitch.switchwindow.label.ProgramTitle;
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
    static SwitchPanel switchPanelTwe = new SwitchPanel();
    static RuntimeButton runtimeButton = new RuntimeButton();
    static SwitchMenuBar switchMenuBar = new SwitchMenuBar();
    static ProgramTitle programTitle = new ProgramTitle();

    public MainWindow(){
        // フレームセット
        programTitle.setText(programTitle.getAllAppTitle(targetflag.getIndexTargetFlagTrue()));
        switchPanelOne.add(programTitle);
        switchPanelTwe.add(runtimeButton);
        switchFrame.setJMenuBar(switchMenuBar);
        switchFrame.add(switchPanelOne);
        switchFrame.add(switchPanelTwe);
        switchFrame.setVisible(true);
    }

    /**
     * 切り替えしたら更新
     */
    public static void updateMenuber(){
        // メニューバー更新
        switchMenuBar = new SwitchMenuBar();
        switchFrame.setJMenuBar(switchMenuBar);

        // ラベル更新
        programTitle.setText(programTitle.getAllAppTitle(targetflag.getIndexTargetFlagTrue()));

        switchFrame.setVisible(true);
    }
}
