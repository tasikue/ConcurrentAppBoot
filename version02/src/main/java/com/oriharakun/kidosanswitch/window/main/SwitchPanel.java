package com.oriharakun.kidosanswitch.window.main;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import com.oriharakun.kidosanswitch.window.Dimensions;

/**
 * スイッチウィンドウのパネル
 * 配置などの設定を行う
 * @author oriharakun
 * @vertion 1.0
 */
public class SwitchPanel extends JPanel{

    private Dimension switchPaDimension = 
        new Dimension(Dimensions.SWITCH_PANEL_DIMENSION.getWidth(), Dimensions.SWITCH_PANEL_DIMENSION.getHeight());
    
    public SwitchPanel(){
        this.setBackground(Color.GRAY);
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(switchPaDimension);
    }
}
