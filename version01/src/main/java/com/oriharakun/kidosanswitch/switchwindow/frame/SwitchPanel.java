package com.oriharakun.kidosanswitch.switchwindow.frame;

import javax.swing.JPanel;

import com.oriharakun.kidosanswitch.enumeration.*;

import java.awt.Color;
import java.awt.GridBagLayout;

/**
 * スイッチウィンドウのパネル
 * 配置などの設定を行う
 * @author oriharakun
 * @vertion 1.0
 */
public class SwitchPanel extends JPanel{
    
    public SwitchPanel(){
        this.setBackground(Color.GRAY);
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(EnumDimension.SWITCH_PANEL_DIMENSION.getElement());
    }
}
