package com.oriharakun.concurren_app_boot.swing;

import javax.swing.*;

/**
 * ウィンドウフレームのクラス
 * ここにまとめる
 * @author oriharakun
 */
public class Window {
    
    // 仮名称など
    final String FRAME_TITLE = "同時アプリケーション起動ツール（仮）";
    final int WINDOW_WIDTH = 320;
    final int WINDOW_HEIGHT = 180;

    // インスタンスを生成、
    JFrame mainFrame = new JFrame(FRAME_TITLE);


    /**
     * ウィンドウを生成する
     */
    public void createWindow(){

        // フレームの初期設定
        // FrameDesign fd  = new FrameDesign(mainFrame, WINDOW_WIDTH, WINDOW_HEIGHT);

        // ウインドウを表示
        mainFrame.setVisible(true);
    }
}
