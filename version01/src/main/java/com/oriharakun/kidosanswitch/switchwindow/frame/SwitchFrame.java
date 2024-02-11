package com.oriharakun.kidosanswitch.switchwindow.frame;

import java.awt.*;
import javax.swing.*;

import com.oriharakun.kidosanswitch.constants.*;

/**
 * スイッチウィンドウのフレーム
 * @author oriharakun
 * @version 1.0
 */
public class SwitchFrame extends JFrame{

    // 変数
    final int windowWidth = ConstantNumber.WINDOW_WIDTH.getElement();
    final int windowHeight = ConstantNumber.WINDOW_HEIGHT.getElement();
    final ImageIcon iconPath = new ImageIcon(ConstantPath.ICON_PATH.getElement());

    public SwitchFrame(){

        this.setTitle(ConstantName.FRAME_MAIN_TITLE.getElement());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(windowX(), windowY(), windowWidth, windowHeight);
        this.setLayout(new FlowLayout());
        this.setIconImage(iconPath.getImage());

        this.setVisible(true);
    }

    /**
     * タスクバーを除いたウィンドウサイズの取得
     * @return ウィンドウサイズ
     */
    private Rectangle getScreenSize(){
        GraphicsEnvironment env = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();

        return env.getMaximumWindowBounds();
    }

    /**
     * フレームのx座標の取得
     * @return フレームのX座標
     */
    private int windowX(){
        int screenWidth = (int) getScreenSize().getWidth();

        return screenWidth - windowWidth;
    }

    /**
     * フレームのY座標の取得
     * @return フレームのY座標
     */
    private int windowY(){
        int screenHeight = (int) getScreenSize().getHeight();

        return screenHeight - windowHeight;
    }
}