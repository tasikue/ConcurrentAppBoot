package com.oriharakun.concurren_app_boot.swing;

import javax.swing.*;

/**
 * フレーム自体のデザイン
 * @author oriharakun
 */
public class FrameDesign {
    
    /**
     * フレームの初期設定
     * @param frame 指定のフレーム
     * @param width フレームの幅
     * @param height フレームの高さ
     */
    public FrameDesign(JFrame frame, int width, int height){
        // 閉じるボタンのふるまいを設定
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ウインドウの初期サイズ（ピクセル）
        frame.setSize(width, height);
        // ウインドウの表示場所
        frame.setLocationRelativeTo(null);
    }

}
