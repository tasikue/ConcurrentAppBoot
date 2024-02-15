package com.oriharakun.kidosanswitch.switchwindow.frame;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import com.oriharakun.kidosanswitch.constants.*;

/**
 * スイッチウィンドウのフレーム
 * @author oriharakun
 * @version 1.0
 */
public class SwitchFrame extends JFrame{

    // 変数
    final Dimension WIN_DIMENSION = ConstantDimension.WINDOW_DIMENSION.getElement();
    final ImageIcon iconPath = new ImageIcon(ConstantFilePath.ICON_PATH.getElement());

    public SwitchFrame(){

        this.setTitle(ConstantName.FRAME_MAIN_TITLE.getElement());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(WIN_DIMENSION);
        this.setLocation(windowX(), windowY());
        this.setIconImage(iconPath.getImage());
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
        return (int) (getScreenSize().getWidth() - WIN_DIMENSION.getWidth());
    }

    /**
     * フレームのY座標の取得
     * @return フレームのY座標
     */
    private int windowY(){
        return (int) (getScreenSize().getHeight() - WIN_DIMENSION.getHeight());
    }
}