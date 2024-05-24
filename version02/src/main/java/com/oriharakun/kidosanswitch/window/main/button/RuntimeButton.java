package com.oriharakun.kidosanswitch.window.main.button;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;

import com.oriharakun.kidosanswitch.Names;
import com.oriharakun.kidosanswitch.window.Dimensions;

/**
 * 起動用ボタンのクラス
 * @author oriharakun
 * @version 1.0
 */
public class RuntimeButton extends JButton{

    final Dimension RUN_BUT_Width = new Dimension(Dimensions.RUNTIME_BUTTON.getWidth(), Dimensions.RUNTIME_BUTTON.getHeight());
    OpenAppAction openAppAction = new OpenAppAction(this);

    public RuntimeButton(){

        this.setLayout(new FlowLayout());
        this.setPreferredSize(RUN_BUT_Width);
        this.setText(Names.RUNTIME_BUUTON_LABEL.getName());
        this.addActionListener(openAppAction);
    }
}
