package com.oriharakun.kidosanswitch.switchwindow.menubar;

import javax.swing.JMenuBar;
import java.util.List;
import java.util.ArrayList;

import com.oriharakun.kidosanswitch.constants.*;
import com.oriharakun.kidosanswitch.setlist.MysetPathRead;
import com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction.AppEndAction;
import com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction.MysetAction;

public class SwitchMenuBar extends JMenuBar{

    FileMenu fileMenu = new FileMenu(ConstantName.FILE_MENU_LABEL.getElement());
    FileMenu mysetMenu = new FileMenu(ConstantName.MYSET_MENU_LABEL.getElement());

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
        MenuItem settingItem = new MenuItem(ConstantName.FILE_SETTING_MENU_LABEL.getElement());
        
        fileMenu.add(settingItem);
    }

    /**
     * ファイルメニュー「終了」の作成
     */
    private void createFileMenuEnd(){
        MenuItem endingItem = new MenuItem(ConstantName.FILE_ENDING_MENU_LABEL.getElement());

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

            mysetMenuItem.add(new MenuItem(mpr.getMysetList().get(i).getMysetName()));

            // 実行処理
            MysetAction mysetAction = new MysetAction(mysetMenuItem.get(i));
            mysetMenuItem.get(i).addActionListener(mysetAction);

            mysetMenu.add(mysetMenuItem.get(i));
        }
    }

    /**
     * マイセットに何もないときに表示
     */
    private void showNotHasMysetMenu(){
        if(mysetMenu.getMenuComponentCount() == 0){
            mysetMenu.add(ConstantName.MYSET_MENU_NOSET_TEXT.getElement());
        }
    }
}
