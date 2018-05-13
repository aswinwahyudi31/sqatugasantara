package sqa.joss.tugasantara;

import javax.swing.*;
import java.util.Random;

public final class Dadu extends JFrame {
    public static final int DEFAULT_SISI = 6;

    private static Random randGenerator = new Random();

    private final int jumSisi;
    private int hasil;

    public Dadu() {
        this(DEFAULT_SISI);
        setSize(400,500);
        setVisible(true);
    }

    public Dadu(int numSides) {
        this.jumSisi = numSides;
        setSize(400,500);
        setVisible(true);
    }

    public void lempar() {
        hasil = randGenerator.nextInt(jumSisi) + 1;
    }

    public int getJumSisi() {
        return jumSisi;
    }

    public int getHasil() {
        return hasil;
    }

    @Override
    public String toString() {
        return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil();
    }
}
