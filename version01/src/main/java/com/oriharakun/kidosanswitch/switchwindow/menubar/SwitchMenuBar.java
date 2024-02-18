package com.oriharakun.kidosanswitch.switchwindow.menubar;

import javax.swing.JMenuBar;
import java.awt.Color;

import java.util.List;
import java.util.ArrayList;

import com.oriharakun.kidosanswitch.enumeration.*;
import com.oriharakun.kidosanswitch.setlist.MysetPathRead;
import com.oriharakun.kidosanswitch.switchwindow.targetflag;
import com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction.AppEndAction;
import com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction.MysetAction;

/**
 * メイン画面のメニューバーに関するクラス
 * ここでメニューバーを組み立ててる
 * @author orihara
 * @version 1.0
 */
public class SwitchMenuBar extends JMenuBar{

    FileMenu fileMenu = new FileMenu(EnumName.FILE_MENU_LABEL.getElement());
    FileMenu mysetMenu = new FileMenu(EnumName.MYSET_MENU_LABEL.getElement());

    public SwitchMenuBar(){
        makeFileMenu();
        makeMysetMenu();
    }

    /**
     * ファイルメニューの中身を作成する
     */
    private void makeFileMenu(){
        createFileMenuSetting();       
        createFileMenuEnd();

        this.add(fileMenu);
    }

    /**
     * ファイルメニュー「設定」の作成
     */
    private void createFileMenuSetting(){
        MenuItem settingItem = new MenuItem(EnumName.FILE_SETTING_MENU_LABEL.getElement());
        
        fileMenu.add(settingItem);
    }

    /**
     * ファイルメニュー「終了」の作成
     */
    private void createFileMenuEnd(){
        MenuItem endingItem = new MenuItem(EnumName.FILE_ENDING_MENU_LABEL.getElement());

        // 実行処理「終了」
        AppEndAction appEndAction = new AppEndAction(endingItem);
        endingItem.addActionListener(appEndAction);

        fileMenu.add(endingItem);
    }

    /**
     * マイセットメニューの中身を作成する
     */
    private void makeMysetMenu(){
        createAllMysetMenu();
        showNotHasMysetMenu();

        this.add(mysetMenu);
    }

    /**
     * 登録されているマイセットのメニューを作成
     */
    private void createAllMysetMenu(){
        List<MenuItem> mysetMenuItem = new ArrayList<>();

        MysetPathRead mpr = new MysetPathRead();
        for(int i=0; i<mpr.getAllMysetCount(); i++){
            String mysetItemTitle = mpr.getMysetList().get(i).getMysetName();
            boolean isTarget = targetflag.getIndexTargetFlagTrue() == i;

            // メニューボタンを作成する
            MenuItem mysetItem = new MenuItem(mysetMenuTitle(mysetItemTitle, isTarget));
            // ターゲットになっているメニューアイテムは背景色を替える
            if(isTarget){
                mysetItem.setBackground(Color.GRAY);
            }
            mysetMenuItem.add(mysetItem);

            // 実行処理
            MysetAction mysetAction = new MysetAction(mysetMenuItem.get(i), i);
            mysetMenuItem.get(i).addActionListener(mysetAction);

            //　メニューボタンの追加
            mysetMenu.add(mysetMenuItem.get(i));
        }
    }

    /**
     * ターゲットの時チェックマークを追加する
     * @param title メニューアイテムのタイトル
     * @param target ターゲットかどうか
     * @return 加工されたメニューアイテムタイトル
     */
    private String mysetMenuTitle(String title, boolean target){
        if(target){
            return String.format("✓ " + title);
        }
        return title;
    }

    /**
     * マイセットに何もないときに表示
     */
    private void showNotHasMysetMenu(){
        if(mysetMenu.getMenuComponentCount() == 0){
            MenuItem notItem = new MenuItem(EnumName.MYSET_MENU_NOSET_TEXT.getElement());

            notItem.setForeground(Color.GRAY);
            mysetMenu.add(notItem);
        }
    }
}
