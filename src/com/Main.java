package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws AWTException {
        if(SystemTray.isSupported()){
            SystemTray tray=SystemTray.getSystemTray();
            Image image=new ImageIcon("2.png").getImage();
            PopupMenu popupMenu=new PopupMenu();
            popupMenu.add(new MenuItem("one")).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("one");
                }
            });
            popupMenu.add(new MenuItem("two"));
            popupMenu.add(new MenuItem("Exit")).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            tray.add(new TrayIcon(image,"tray description",popupMenu));
        }


    }
}
