package com.oriharakun.kidosanswitch.window.main;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.io.File;
import java.nio.file.Paths;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

import com.oriharakun.kidosanswitch.Names;
import com.oriharakun.kidosanswitch.window.Dimensions;

import javax.swing.ImageIcon;

/**
 * スイッチウィンドウのフレーム
 * フレームのアイコンを指定
 * @author oriharakun
 * @version 1.0
 */
public class SwitchFrame extends JFrame{

    // 変数
    private Dimension WIN_DIMENSION =
        new Dimension(Dimensions.WINDOW_DIMENSION.getWidth(), Dimensions.WINDOW_DIMENSION.getHeight());
    // アイコンのパス
    private String iconPath = Paths.get("").toAbsolutePath() + File.separator + "data" + File.separator + "icon.png";
    final ImageIcon icon = new ImageIcon(iconPath);

    public SwitchFrame(){

        this.setTitle(Names.FRAME_MAIN_TITLE.getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(WIN_DIMENSION);
        this.setLocation(windowX(), windowY());
        this.setIconImage(icon.getImage());
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