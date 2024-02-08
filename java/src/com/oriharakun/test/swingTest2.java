package com.oriharakun.test;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingTest2 implements ActionListener{
    private JFrame mainFrame;
        private Container contentPane;
        private JTextField textField;
        private JTextArea textArea;
        private JScrollPane scrollPane;
        private JPanel buttonPane;
        private JButton addButton;
        private JButton clearButton;

        // コンストラクタ
        public swingTest2 (){
                mainFrame = new JFrame("サンプル");
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.setSize(320, 200);
                mainFrame.setLocationRelativeTo(null);
                contentPane = mainFrame.getContentPane();
                textField = new JTextField();
                textArea = new JTextArea();
                scrollPane = new JScrollPane(textArea);
                addButton = new JButton("追加");
                clearButton = new JButton("消去");
                // 「追加」ボタンとアクション・リスナーの関連付け
                addButton.addActionListener(this);
                // 「消去」ボタンとアクション・リスナーの関連付け
                clearButton.addActionListener(this);
                buttonPane = new JPanel();
                buttonPane.add(addButton);
                buttonPane.add(clearButton);
                contentPane.add(textField, BorderLayout.NORTH);
                contentPane.add(scrollPane, BorderLayout.CENTER);
                contentPane.add(buttonPane, BorderLayout.SOUTH);
                mainFrame.setVisible(true);
        }

        // 利用者の操作に応じた処理を実装
        public void actionPerformed(ActionEvent event){
                // ユーザの操作対象を判断
                if(event.getSource() == addButton) {
                        // テキストエリアへ文字列を追加
                        textArea.append(textField.getText() + "\n");
                }
                if(event.getSource() == clearButton) {
                        // テキストエリアの文字列を全消去
                        textArea.setText(null);
                }
        }

        // アプリケーションの起動
        public static void main(String[] args) {
                new swingTest2();
        }
}
