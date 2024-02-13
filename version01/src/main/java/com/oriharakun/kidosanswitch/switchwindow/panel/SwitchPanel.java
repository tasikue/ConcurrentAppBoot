package com.oriharakun.kidosanswitch.switchwindow.panel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridBagLayout;

import com.oriharakun.kidosanswitch.constants.*;

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
        this.setPreferredSize(ConstantDimension.SWITCH_PANEL_DIMENSION.getElement());
    }
}