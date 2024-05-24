package com.oriharakun.kidosanswitch.window.main;

import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import com.oriharakun.kidosanswitch.window.Dimensions;
import com.oriharakun.kidosanswitch.window.basic.BasicFrame;

/**
 * スイッチウィンドウのフレーム
 */
public class Frame extends BasicFrame{

    // 画面サイズ
    private final Dimension SCREEN_SIZE =
        new Dimension(Dimensions.SWITCH_SCREEEN.getWidth(), Dimensions.SWITCH_SCREEEN.getHeight());

    /**
     * コンストラクタ
     */
    public Frame(){
        
        // 画面サイズ
        this.setSize(SCREEN_SIZE);
        
        // 位置の指定
        this.setLocation(windowX(), windowY());
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
        return (int) (getScreenSize().getWidth() - SCREEN_SIZE.getWidth());
    }

    /**
     * フレームのY座標の取得
     * @return フレームのY座標
     */
    private int windowY(){
        return (int) (getScreenSize().getHeight() - SCREEN_SIZE.getHeight());
    }
}