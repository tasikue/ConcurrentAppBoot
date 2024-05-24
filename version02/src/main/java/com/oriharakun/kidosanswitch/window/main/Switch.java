package com.oriharakun.kidosanswitch.window.main;

import com.oriharakun.kidosanswitch.window.main.button.RuntimeButton;
import com.oriharakun.kidosanswitch.window.menubar.*;

/**
 * メイン画面の組み立て
 */
public class Switch {

    // インスタンス
    private static ExeLabel exeLabel = new ExeLabel();
    private static Panel exePanel = new Panel();
    private static Panel buttonPanel = new Panel();
    private static Frame frame = new Frame();
    private static RuntimeButton runtimeButton = new RuntimeButton();
    private static SwitchMenuBar menuBar = new SwitchMenuBar();

    /**
     * コンストラクタ
     */
    public Switch(){
        
        // ラベル
        exeLabel.setText(exeLabel.getAllAppTitle(targetflag.getIndexTargetFlagTrue()));

        // パネルのセット
        exePanel.add(exeLabel);
        buttonPanel.add(runtimeButton);

        // フレームのセット
        frame.setJMenuBar(menuBar);
        frame.add(exePanel);
        frame.add(buttonPanel);

        // 実体化
        frame.setVisible(true);
    }

    /**
     * 切り替えしたら更新
     */
    public static void updateMenuber(){
        // メニューバー更新
        menuBar = new SwitchMenuBar();
        frame.setJMenuBar(menuBar);

        // ラベル更新
        exeLabel.setText(exeLabel.getAllAppTitle(targetflag.getIndexTargetFlagTrue()));

        frame.setVisible(true);
    }
}
