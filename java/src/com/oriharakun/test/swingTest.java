package com.oriharakun.test;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

/**
 * swingTest
 * swingのテスト 
 * @author orihara
 * @version 1.0
 */
public class swingTest {

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // インスタンスを生成、
        JFrame mainFrame = new JFrame("サンプル");

        // 閉じるボタンのふるまいを設定
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ウインドウの初期サイズ（ピクセル）
        mainFrame.setSize(320, 160);
        // ウインドウの表示場所
        mainFrame.setLocationRelativeTo(null);

        // JFrameよりContentPaneを取得
        Container contentPane = mainFrame.getContentPane();

        // ラベルのインスタンスを生成
        JLabel label = new JLabel("SwingLabel");
        // ラベルを配置
        contentPane.add(label, BorderLayout.CENTER);

        // ボタンのインスタンスを生成
        JButton button = new JButton("SwingButton");
        // ボタンをContentPaneに配置
        contentPane.add(button, BorderLayout.SOUTH);

        // ウインドウを表示
        mainFrame.setVisible(true);
        }
}