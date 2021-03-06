package sqa.joss.tugasantara;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public final class Dadu extends JFrame {
    public static final int DEFAULT_SISI = 6;

    private static Random randGenerator = new Random();

    private final int jumSisi;

    private int hasil;

    public Dadu() {
        this(DEFAULT_SISI);
        setSize(260,165);
        setVisible(true);
    }

    public Dadu(int numSides) {
        this.jumSisi = numSides;
        setSize(260, 165);
        setVisible(true);
    }

    public void lempar() {
        this.hasil = randGenerator.nextInt(jumSisi) + 1;
    }

    public int getJumSisi() {
        return this.jumSisi;
    }

    public int getHasil() {
        return this.hasil;
    }

    @Override
    public String toString() {
        return "Jumlah sisi dadu: " + this.getJumSisi() + " hasil: " + this.getHasil();
    }
    
    public int randomWarna() {
      int randomNumber = randGenerator.nextInt(255);
      return randomNumber;
    }
    
    public Color warna(){
        Color cobaWarna = new Color(randomWarna(),randomWarna(),randomWarna());
        return cobaWarna;
    }

    public Color getWarnaSisi() {
        Color[] warna = new Color[this.getJumSisi()];
        for (int i = 0; i < this.getJumSisi(); i++) {
            warna[i] = this.warna();
        }
        return warna[getHasil()-1];
    }

    public void paint(Graphics g) {
        // Memanggil metoda paint dari superclass
        super.paint(g);
        // Mengatur warna
        g.drawString(String.valueOf(warna()),57,100);

        g.setColor(Color.YELLOW);
        g.drawRect(20, 40, 220, 50);

        g.setColor(getWarnaSisi());
        g.fillRect(20, 100, 220, 50);

        g.setColor(Color.RED);
        g.drawString(toString(),57,60);

        g.setColor(Color.WHITE);
        g.drawString("Warna Sisi Dadu",80,125);
    }
}


    

   	
    	
