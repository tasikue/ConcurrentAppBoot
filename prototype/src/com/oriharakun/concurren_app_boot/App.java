package com.oriharakun.concurren_app_boot;

import com.oriharakun.concurren_app_boot.swing.Window;;
/**
 * 実行用メインクラス
 * @author oriharakun
 * @version 1.0
 */
public class App {

    /**
     * 
     * @param args 使用しない
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Window win = new Window();
        win.createWindow();
    }
}
