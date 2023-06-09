/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikulkas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Aziizah Oki Shofrina
 */


public class Main {

    public static String username;
    public static Koneksi db = new Koneksi();
    
    public static void main(String args[]) {
        db.openConn();
        new Login().setVisible(true);
    }
    
    public static byte[] imgToByte(Image img) {
        //Image img = ((ImageIcon)lblGambar.getIcon()).getImage();
        byte[] imgByte;
        
        try {
            BufferedImage image = new BufferedImage(
                img.getWidth(null), 
                img.getHeight(null),                                    
                BufferedImage.TYPE_INT_RGB
            );

            Graphics g = image.getGraphics();
            g.drawImage(img, 0, 0, null);
            g.dispose();

            // write it to byte array in-memory (jpg format)
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", b);

            // do whatever with the array...
            imgByte = b.toByteArray();
            
            return imgByte;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                e,
                "Perhatian!",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        return null;
    }
    
    public static Image byteToImg(byte[] imgByte) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(imgByte);
            Image img = ImageIO.read(bais);
            img = img.getScaledInstance(
                img.getWidth(null),
                img.getHeight(null),
                Image.SCALE_SMOOTH
            );
            return img;
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(
                null,
                e,
                "Perhatian!",
                JOptionPane.ERROR_MESSAGE
            );
        }
        return null;

    }
    
    public static void pressAngkaOnly(java.awt.event.KeyEvent evt, JTextField txt) {
        if (
            evt.getKeyChar() >= (char)'0' &&
            evt.getKeyChar() <= (char)'9' ||
            evt.getKeyChar() == KeyEvent.VK_BACK_SPACE ||
            evt.getKeyChar() == KeyEvent.VK_DELETE
        ) {
            txt.setEditable(true);
        } else {
            txt.setEditable(false);
        }
    }
}
