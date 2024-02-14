package com.oriharakun.kidosanswitch.switchwindow.menubar;

import javax.swing.JMenuBar;

import com.oriharakun.kidosanswitch.constants.*;
import com.oriharakun.kidosanswitch.setlist.*;
import com.oriharakun.kidosanswitch.switchwindow.menubar.menuaction.AppEndAction;

public class SwitchMenuBar extends JMenuBar{

    FileMenu fileMenu = new FileMenu(ConstantName.FILE_MENU_LABEL.getElement());
    FileMenu mySetMenu = new FileMenu(ConstantName.MYSET_MENU_LABEL.getElement());

    public SwitchMenuBar(){
        makeFileMenu();
        makeMySetMenu();
    }

    /**
     * ファイルメニューの中身を作成する
     */
    private void makeFileMenu(){
        MenuItem settingItem = new MenuItem(ConstantName.FILE_SETTING_MENU_LABEL.getElement());
        MenuItem endingItem = new MenuItem(ConstantName.FILE_ENDING_MENU_LABEL.getElement());

        fileMenu.add(settingItem);
        fileMenu.add(endingItem);

        AppEndAction appEndAction = new AppEndAction(endingItem);

        endingItem.addActionListener(appEndAction);

        this.add(fileMenu);
    }

    /**
     * マイセットメニューの中身を作成する
     */
    private void makeMySetMenu(){

        // とりあえず定数指定
        /* 
        MysetManagement mm = new MysetManagement();

        MenuItem javaItem = new MenuItem(mm.getjavaMyset().getMysetName());
        MenuItem splaItem = new MenuItem(mm.getSplaMyset().getMysetName());

        mySetMenu.add(javaItem);
        mySetMenu.add(splaItem);
*/
        

        // 何もないときに表示
        if(mySetMenu.getMenuComponentCount() == 0){
            mySetMenu.add(ConstantName.MYSET_MENU_NOSET_TEXT.getElement());
        }

        this.add(mySetMenu);
    }
}
