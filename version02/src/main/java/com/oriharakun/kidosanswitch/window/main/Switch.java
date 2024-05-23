package com.oriharakun.kidosanswitch.window.main;

import com.oriharakun.kidosanswitch.window.main.button.RuntimeButton;
import com.oriharakun.kidosanswitch.window.menubar.*;

/**
 * メイン画面の組み立て
 * @author orihara
 * @version 1.0
 */
public class Switch {

    static SwitchFrame switchFrame = new SwitchFrame();
    static SwitchPanel switchPanelOne = new SwitchPanel();
    static SwitchPanel switchPanelTwe = new SwitchPanel();
    static RuntimeButton runtimeButton = new RuntimeButton();
    static SwitchMenuBar switchMenuBar = new SwitchMenuBar();
    static ProgramTitle programTitle = new ProgramTitle();

    public Switch(){
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
