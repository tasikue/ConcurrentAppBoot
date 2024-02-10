package com.oriharakun.concurren_app_boot.prototype01;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class AppPrototype01 {

    public static void main(String[] args) {

    // final
    final String FRAME_TITLE = "同時アプリケーション起動ツール（仮）";
    final int WINDOW_WIDTH = 320;
    final int WINDOW_HEIGHT = 180;

    // 変数

    // インスタンス
    JFrame mainFrame = new JFrame(FRAME_TITLE);
    JLabel label = new JLabel("SwingLabel");
    JButton button = new JButton("SwingButton");
    ActionPrototype01 ap01 = new ActionPrototype01(button);

    // フレームの設定 
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    mainFrame.setLocationRelativeTo(null);

    // ラベルの設定
    Container contentPane = mainFrame.getContentPane();
    contentPane.add(label, BorderLayout.CENTER);
    
    // ボタンの設定
    contentPane.add(button, BorderLayout.SOUTH);
    button.addActionListener(ap01);

    // ウインドウを表示
    mainFrame.setVisible(true);
    }
}
