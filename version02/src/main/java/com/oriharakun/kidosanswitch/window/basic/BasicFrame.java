package com.oriharakun.kidosanswitch.window.basic;

import java.awt.FlowLayout;
import java.io.File;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.oriharakun.kidosanswitch.Names;

/**
 * ウィンドウフレームの共通基本クラス
 * 
 *  - ×ボタンが押されたときの終了処理
 *  - フローレイアウト
 *  - アイコン
 */
public class BasicFrame extends JFrame{

    // アイコンのパス
    private String iconPath = Paths.get("").toAbsolutePath() + File.separator + "data" + File.separator + "icon.png";
    final ImageIcon icon = new ImageIcon(iconPath);
    
    /**
     * コンストラクタ
     */
    protected BasicFrame (){

        // ウィンドウに使われるアイコン
        this.setIconImage(icon.getImage());

        // 名称を指定
        this.setTitle(Names.FRAME_MAIN_TITLE.getName());

        // 閉じるボタンが押されたときフレームを閉じる設定
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 画面レイアウトの設定、フローレイアウトは左上から右下にかけてのレイアウト
        this.setLayout(new FlowLayout());
    }
}
