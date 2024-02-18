package com.oriharakun.kidosanswitch.switchwindow.button;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;

import com.oriharakun.kidosanswitch.enumeration.*;
import com.oriharakun.kidosanswitch.switchwindow.button.buttonaction.OpenAppAction;

/**
 * 起動用ボタンのクラス
 * @author oriharakun
 * @version 1.0
 */
public class RuntimeButton extends JButton{

    final Dimension RUN_BUT_Width = EnumDimension.RUNTIME_BUTTON_DIMENSION.getElement();
    OpenAppAction openAppAction = new OpenAppAction(this);

    public RuntimeButton(){

        this.setLayout(new FlowLayout());
        this.setPreferredSize(RUN_BUT_Width);
        this.setText(EnumName.RUNTIME_BUUTON_LABEL.getElement());
        this.addActionListener(openAppAction);
    }
}
