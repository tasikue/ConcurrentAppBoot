package com.oriharakun.kidosanswitch.window.main;

import java.awt.Dimension;

import com.oriharakun.kidosanswitch.window.Dimensions;
import com.oriharakun.kidosanswitch.window.basic.BasicPanel;

/**
 * スイッチウィンドウのパネル
 * 
 *  - サイズ
 */
public class Panel extends BasicPanel{

    // サイズ
    private Dimension switchPaDimension = 
        new Dimension(Dimensions.SWITCH_PANEL.getWidth(), Dimensions.SWITCH_PANEL.getHeight());
    
    /**
     * コンストラクタ
     */
    public Panel(){

        // サイズ
        this.setPreferredSize(switchPaDimension);
    }
}
