package com.oriharakun.concurren_app_boot.prototype02;

import javax.swing.*;

import java.awt.*;

public class AppPrototype01 {


    public static void main(String[] args) {

        // final
        final String FRAME_TITLE = "きどうさんスイッチ";
        final int WINDOW_WIDTH = 280;
        final int WINDOW_HEIGHT = WINDOW_WIDTH * 3/4; // 3:4比率
        final int MARGIN = 15;

        // インスタンス
        JFrame mainFrame = new JFrame(FRAME_TITLE);
        JPanel panel = new JPanel();
        JButton button = new JButton("SwingButton");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("ファイル");
        JMenu menu2 = new JMenu("設定");
        JMenuItem menuitem1 = new JMenuItem("New");
        JMenuItem menuitem2 = new JMenuItem("Open");
        JMenuItem menuitem3 = new JMenuItem("Close");
        ImageIcon icon = new ImageIcon("C:\\Users\\swing\\scoop\\apps\\vscode\\current\\data\\ConcurrentAppBoot\\icon\\momo3.png");
        ActionPrototype01 ap01 = new ActionPrototype01(button);

        // 画面サイズ取得
        GraphicsEnvironment env = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle desktopBounds = env.getMaximumWindowBounds();
        int screenWidth = (int) desktopBounds.getWidth();
        int screenHeight = (int) desktopBounds.getHeight();
        int windowX = screenWidth - WINDOW_WIDTH;
        int windowY = screenHeight - WINDOW_HEIGHT;

        // パネルのサイズ
        int panelWidth = WINDOW_WIDTH - MARGIN*2;
        int panelHeight = WINDOW_HEIGHT - MARGIN*4;

        //ボタンサイズ
        int buttonWidth = 100;
        int buttonHeight = 50;

        // フレームの設定 
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(windowX, windowY, WINDOW_WIDTH, WINDOW_HEIGHT);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setIconImage(icon.getImage());

        // メニューバー
        //mainFrame.add(menuBar);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menu1.add(menuitem1);
        menu1.add(menuitem2);
        menu1.add(menuitem3);
        mainFrame.setJMenuBar(menuBar);

        // パネルの設定
        panel.setPreferredSize(new Dimension(panelWidth, panelHeight));
        panel.setBackground(Color.GRAY);
        panel.add(button);
    
        // ボタンの設定
        button.setBounds(10,100,buttonWidth,buttonHeight);
        button.addActionListener(ap01);

        // contenPaneに追加
        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.add(panel);

        // ウインドウを表示
        mainFrame.setVisible(true);
    }
}
