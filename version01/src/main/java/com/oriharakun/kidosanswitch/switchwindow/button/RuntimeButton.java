package com.oriharakun.kidosanswitch.switchwindow.button;

import javax.swing.JButton;

import com.oriharakun.kidosanswitch.constants.*;

/**
 * 起動用ボタンのクラス
 * @author oriharakun
 * @version 1.0
 */
public class RuntimeButton extends JButton{

    final int luntimeButtonWidth = ConstantNumber.LUNTIME_BUTTON_WIDTH.getElement();
    final int luntimeButtonHeight = ConstantNumber.LUNTIME_BUTTON_HEIGHT.getElement();
    
    public RuntimeButton(){
        this.setBounds(50,50, luntimeButtonWidth, luntimeButtonHeight);
        //button.addActionListener(ap01);
    }
}
