package jjangi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jjangi implements MouseListener {
    JFrame j = new JFrame();
    JPanel p = new JPanel();
    Graphics g = null;
    
    Point canonGreen;
    Point canonGreen2;
    Point rookGreen;
    Point rookGreen2;
    Point longKnightGreen;
    Point longKnightGreen2;
    Point knightGreen;
    Point knightGreen2;
    Point guardGreen;
    Point guardGreen2;
    Point kingGreen;
    Point pawnGreen;
    Point pawnGreen2;
    Point pawnGreen3;
    Point pawnGreen4;
    Point pawnGreen5;

    Point canonRed;
    Point canonRed2;
    Point rookRed;
    Point rookRed2;
    Point longKnightRed;
    Point longKnightRed2;
    Point knightRed;
    Point knightRed2;
    Point guardRed;
    Point guardRed2;
    Point kingRed;
    Point pawnRed;
    Point pawnRed2;
    Point pawnRed3;
    Point pawnRed4;
    Point pawnRed5;
    
    int xx = -10, yy = -10;
    int X = -10, Y = -10;
    int press = 0;
    
    int selectedX = -10, selectedY = -10;
    
    class Point {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public Jjangi() {
        setGUI();

        initBoard();
        
        Thread t = new Thread() {
            public void run() {
                Graphics2D g2 = (Graphics2D) g;
                while(true) {
                    try {
                        
                        refresh();
                        
                
                        Thread.sleep(1000);
                    } catch(Exception e) {}
                }
            }
        };
        t.start();
        
        j.addMouseListener(this);
    }

    void initBoard() {
        rookGreen = new Point(0, 9);
        longKnightGreen = new Point(1, 9);
        knightGreen = new Point(2, 9);
        guardGreen = new Point(3, 9);
        guardGreen2 = new Point(5, 9);
        kingGreen = new Point(4, 8);
        longKnightGreen2 = new Point(6, 9);
        knightGreen2 = new Point(7, 9);
        rookGreen2 = new Point(8, 9);
        canonGreen = new Point(1, 7);
        canonGreen2 = new Point(7, 7);
        pawnGreen = new Point(0, 6);
        pawnGreen2 = new Point(2, 6);
        pawnGreen3 = new Point(4, 6);
        pawnGreen4 = new Point(6, 6);
        pawnGreen5 = new Point(8, 6);


        rookRed = new Point(0, 0);
        longKnightRed = new Point(1, 0);
        knightRed = new Point(2, 0);
        guardRed = new Point(3, 0);
        guardRed2 = new Point(5, 0);
        kingRed = new Point(4, 1);
        longKnightRed2 = new Point(6, 0);
        knightRed2 = new Point(7, 0);
        rookRed2 = new Point(8, 0);
        canonRed = new Point(1, 2);
        canonRed2 = new Point(7, 2);
        pawnRed = new Point(0, 3);
        pawnRed2 = new Point(2, 3);
        pawnRed3 = new Point(4, 3);
        pawnRed4 = new Point(6, 3);
        pawnRed5 = new Point(8, 3);

    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if(press == 0) {

            X = (int)((double)e.getX()/(double)90);
            Y = (int)((double)e.getY()/(double)90);
            
            selectedX = X;
            selectedY = Y;
            
            press = 1;
            refresh();
        } else if(press == 1) {
            
            selectedX = -10;
            selectedY = -10;

            xx = (int)((double)e.getX()/(double)90);
            yy = (int)((double)e.getY()/(double)90);

            if(rookGreen.x == xx && rookGreen.y == yy) {
                rookGreen.x = -1000;
                rookGreen.y = yy;
            }
            if(rookGreen2.x == xx && rookGreen2.y == yy) {
                rookGreen2.x = -1000;;
                rookGreen2.y = yy;
            }
            if(longKnightGreen.x == xx && longKnightGreen.y == yy) {
                longKnightGreen.x = -1000;;
                longKnightGreen.y = yy;
            }
            if(longKnightGreen2.x == xx && longKnightGreen2.y == yy) {
                longKnightGreen2.x = -1000;;
                longKnightGreen2.y = yy;
            }
            if(knightGreen.x == xx && knightGreen.y == yy) {
                knightGreen.x = -1000;;
                knightGreen.y = yy;
            }
            if(knightGreen2.x == xx && knightGreen2.y == yy) {
                knightGreen2.x = -1000;;
                knightGreen2.y = yy;
            }
            if(guardGreen.x == xx && guardGreen.y == yy) {
                guardGreen.x = -1000;;
                guardGreen.y = yy;
            }
            if(guardGreen2.x == xx && guardGreen2.y == yy) {
                guardGreen2.x = -1000;;
                guardGreen2.y = yy;
            }
            if(canonGreen.x == xx && canonGreen.y == yy) {
                canonGreen.x = -1000;;
                canonGreen.y = yy;
            }
            if(canonGreen2.x == xx && canonGreen2.y == yy) {
                canonGreen2.x = -1000;;
                canonGreen2.y = yy;
            }
            if(pawnGreen.x == xx && pawnGreen.y == yy) {
                pawnGreen.x = -1000;;
                pawnGreen.y = yy;
            }
            if(pawnGreen2.x == xx && pawnGreen2.y == yy) {
                pawnGreen2.x = -1000;;
                pawnGreen2.y = yy;
            }
            if(pawnGreen3.x == xx && pawnGreen3.y == yy) {
                pawnGreen3.x = -1000;;
                pawnGreen3.y = yy;
            }
            if(pawnGreen4.x == xx && pawnGreen4.y == yy) {
                pawnGreen4.x = -1000;;
                pawnGreen4.y = yy;
            }
            if(pawnGreen5.x == xx && pawnGreen5.y == yy) {
                pawnGreen5.x = -1000;;
                pawnGreen5.y = yy;
            }
            if(rookRed.x == xx && rookRed.y == yy) {
                rookRed.x = -1000;;
                rookRed.y = yy;
            }
            if(rookRed2.x == xx && rookRed2.y == yy) {
                rookRed2.x = -1000;;
                rookRed2.y = yy;
            }
            if(longKnightRed.x == xx && longKnightRed.y == yy) {
                longKnightRed.x = -1000;;
                longKnightRed.y = yy;
            }
            if(longKnightRed2.x == xx && longKnightRed2.y == yy) {
                longKnightRed2.x = -1000;;
                longKnightRed2.y = yy;
            }
            if(knightRed.x == xx && knightRed.y == yy) {
                knightRed.x = -1000;;
                knightRed.y = yy;
            }
            if(knightRed2.x == xx && knightRed2.y == yy) {
                knightRed2.x = -1000;;
                knightRed2.y = yy;
            }
            if(guardRed.x == xx && guardRed.y == yy) {
                guardRed.x = -1000;;
                guardRed.y = yy;
            }
            if(guardRed2.x == xx && guardRed2.y == yy) {
                guardRed2.x = -1000;;
                guardRed2.y = yy;
            }
            if(canonRed.x == xx && canonRed.y == yy) {
                canonRed.x = -1000;;
                canonRed.y = yy;
            }
            if(canonRed2.x == xx && canonRed2.y == yy) {
                canonRed2.x = -1000;;
                canonRed2.y = yy;
            }
            if(pawnRed.x == xx && pawnRed.y == yy) {
                pawnRed.x = -1000;;
                pawnRed.y = yy;
            }
            if(pawnRed2.x == xx && pawnRed2.y == yy) {
                pawnRed2.x = -1000;;
                pawnRed2.y = yy;
            }
            if(pawnRed3.x == xx && pawnRed3.y == yy) {
                pawnRed3.x = -1000;;
                pawnRed3.y = yy;
            }
            if(pawnRed4.x == xx && pawnRed4.y == yy) {
                pawnRed4.x = -1000;;
                pawnRed4.y = yy;
            }
            if(pawnRed5.x == xx && pawnRed5.y == yy) {
                pawnRed5.x = -1000;;
                pawnRed5.y = yy;
            }
            if(kingRed.x == xx && kingRed.y == yy) {
                kingRed.x = -1000;;
                kingRed.y = yy;
            }
            if(kingGreen.x == xx && kingGreen.y == yy) {
                kingGreen.x = -1000;;
                kingGreen.y = yy;
            }

            if(rookGreen.x == X && rookGreen.y == Y) {
                rookGreen.x = xx;
                rookGreen.y = yy;
            }
            if(rookGreen2.x == X && rookGreen2.y == Y) {
                rookGreen2.x = xx;
                rookGreen2.y = yy;
            }
            if(longKnightGreen.x == X && longKnightGreen.y == Y) {
                longKnightGreen.x = xx;
                longKnightGreen.y = yy;
            }
            if(longKnightGreen2.x == X && longKnightGreen2.y == Y) {
                longKnightGreen2.x = xx;
                longKnightGreen2.y = yy;
            }
            if(knightGreen.x == X && knightGreen.y == Y) {
                knightGreen.x = xx;
                knightGreen.y = yy;
            }
            if(knightGreen2.x == X && knightGreen2.y == Y) {
                knightGreen2.x = xx;
                knightGreen2.y = yy;
            }
            if(guardGreen.x == X && guardGreen.y == Y) {
                guardGreen.x = xx;
                guardGreen.y = yy;
            }
            if(guardGreen2.x == X && guardGreen2.y == Y) {
                guardGreen2.x = xx;
                guardGreen2.y = yy;
            }
            if(canonGreen.x == X && canonGreen.y == Y) {
                canonGreen.x = xx;
                canonGreen.y = yy;
            }
            if(canonGreen2.x == X && canonGreen2.y == Y) {
                canonGreen2.x = xx;
                canonGreen2.y = yy;
            }
            if(pawnGreen.x == X && pawnGreen.y == Y) {
                pawnGreen.x = xx;
                pawnGreen.y = yy;
            }
            if(pawnGreen2.x == X && pawnGreen2.y == Y) {
                pawnGreen2.x = xx;
                pawnGreen2.y = yy;
            }
            if(pawnGreen3.x == X && pawnGreen3.y == Y) {
                pawnGreen3.x = xx;
                pawnGreen3.y = yy;
            }
            if(pawnGreen4.x == X && pawnGreen4.y == Y) {
                pawnGreen4.x = xx;
                pawnGreen4.y = yy;
            }
            if(pawnGreen5.x == X && pawnGreen5.y == Y) {
                pawnGreen5.x = xx;
                pawnGreen5.y = yy;
            }
            if(rookRed.x == X && rookRed.y == Y) {
                rookRed.x = xx;
                rookRed.y = yy;
            }
            if(rookRed2.x == X && rookRed2.y == Y) {
                rookRed2.x = xx;
                rookRed2.y = yy;
            }
            if(longKnightRed.x == X && longKnightRed.y == Y) {
                longKnightRed.x = xx;
                longKnightRed.y = yy;
            }
            if(longKnightRed2.x == X && longKnightRed2.y == Y) {
                longKnightRed2.x = xx;
                longKnightRed2.y = yy;
            }
            if(knightRed.x == X && knightRed.y == Y) {
                knightRed.x = xx;
                knightRed.y = yy;
            }
            if(knightRed2.x == X && knightRed2.y == Y) {
                knightRed2.x = xx;
                knightRed2.y = yy;
            }
            if(guardRed.x == X && guardRed.y == Y) {
                guardRed.x = xx;
                guardRed.y = yy;
            }
            if(guardRed2.x == X && guardRed2.y == Y) {
                guardRed2.x = xx;
                guardRed2.y = yy;
            }
            if(canonRed.x == X && canonRed.y == Y) {
                canonRed.x = xx;
                canonRed.y = yy;
            }
            if(canonRed2.x == X && canonRed2.y == Y) {
                canonRed2.x = xx;
                canonRed2.y = yy;
            }
            if(pawnRed.x == X && pawnRed.y == Y) {
                pawnRed.x = xx;
                pawnRed.y = yy;
            }
            if(pawnRed2.x == X && pawnRed2.y == Y) {
                pawnRed2.x = xx;
                pawnRed2.y = yy;
            }
            if(pawnRed3.x == X && pawnRed3.y == Y) {
                pawnRed3.x = xx;
                pawnRed3.y = yy;
            }
            if(pawnRed4.x == X && pawnRed4.y == Y) {
                pawnRed4.x = xx;
                pawnRed4.y = yy;
            }
            if(pawnRed5.x == X && pawnRed5.y == Y) {
                pawnRed5.x = xx;
                pawnRed5.y = yy;
            }
            if(kingRed.x == X && kingRed.y == Y) {
                kingRed.x = xx;
                kingRed.y = yy;
            }
            if(kingGreen.x == X && kingGreen.y == Y) {
                kingGreen.x = xx;
                kingGreen.y = yy;
            }
            press = 0;
            refresh();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    void refresh() {
        
        paintBoard();

        try {
            java.awt.Image imgFb = null;

            String imageFb = "rookGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, rookGreen.x*90+50-20, rookGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "longKnightGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, longKnightGreen.x*90+50-20, longKnightGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "knightGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, knightGreen.x*90+50-20, knightGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "guardGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, guardGreen.x*90+50-20, guardGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "guardGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, guardGreen2.x*90+50-20, guardGreen2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "kingGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, kingGreen.x*90+50-20, kingGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "longKnightGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, longKnightGreen2.x*90+50-20, longKnightGreen2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "knightGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, knightGreen2.x*90+50-20, knightGreen2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "rookGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, rookGreen2.x*90+50-20, rookGreen2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "canonGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, canonGreen.x*90+50-20, canonGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "canonGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, canonGreen2.x*90+50-20, canonGreen2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnGreen.x*90+50-20, pawnGreen.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnGreen2.x*90+50-20, pawnGreen2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnGreen3.x*90+50-20, pawnGreen3.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnGreen4.x*90+50-20, pawnGreen4.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnGreen.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnGreen5.x*90+50-20, pawnGreen5.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}


        try {
            java.awt.Image imgFb = null;

            String imageFb = "rookRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, rookRed.x*90+50-20, rookRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "longKnightRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, longKnightRed.x*90+50-20, longKnightRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "knightRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, knightRed.x*90+50-20, knightRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "guardRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, guardRed.x*90+50-20, guardRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "guardRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, guardRed2.x*90+50-20, guardRed2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "kingRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, kingRed.x*90+50-20, kingRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "longKnightRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, longKnightRed2.x*90+50-20, longKnightRed2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "knightRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, knightRed2.x*90+50-20, knightRed2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "rookRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, rookRed2.x*90+50-20, rookRed2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "canonRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, canonRed.x*90+50-20, canonRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "canonRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, canonRed2.x*90+50-20, canonRed2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnRed.x*90+50-20, pawnRed.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnRed2.x*90+50-20, pawnRed2.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnRed3.x*90+50-20, pawnRed3.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnRed4.x*90+50-20, pawnRed4.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        try {
            java.awt.Image imgFb = null;

            String imageFb = "pawnRed.png";

            javax.swing.ImageIcon iFb = new javax.swing.ImageIcon(this.getClass().getResource(imageFb));
            imgFb = iFb.getImage();

            g.drawImage(imgFb, pawnRed5.x*90+50-20, pawnRed5.y*90+40-20, 40, 40, null);
        } catch(Exception e) {e.printStackTrace();}

        g.setColor(Color.GREEN);
        g.drawOval(selectedX*90+10, selectedY*90, 80, 80);

    }
    
    public void paintBoard() {
        Graphics g2 = (Graphics) g;
        g2.setColor(new Color(200, 150, 55));
        g2.fillRect(0, 0, 950, 950);
        g2.setColor(Color.BLACK);
        for(int i=0; i<9; i++) {
            g2.drawLine(i*90+50, 40, i*90+50, 810+40);
        }
        for(int i=0; i<10; i++) {
            g2.drawLine(0+50, i*90+40, 720+50, i*90+40);
        }
        g2.drawLine(270+50, 0+40, 450+50, 180+40);
        g2.drawLine(270+50, 180+40, 450+50, 0+40);
        g2.drawLine(270+50, 630+40, 450+50, 810+40);
        g2.drawLine(270+50, 810+40, 450+50, 630+40);
    }
    
    void setGUI() {
        
        j.setExtendedState(j.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        j.setLayout(null);
        j.setBounds(0, 0, 950, 1050);
        p.setBounds(0,0,880,900);
        JPanel pp = new JPanel();
        pp.setBounds(880,0,70,900);
        JButton c = new JButton("DESELECT");
        c.setBounds(900,10,160,35);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                xx = X = selectedX = -10;
                yy = Y = selectedY = -10;
                
                
                press = 0;
                
            }
        });
        JButton b = new JButton("New");
        b.setBounds(900,10,40,35);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xx = X = selectedX = -10;
                yy = Y = selectedY = -10;
                press = 0;
                
                initBoard();

                refresh();
                
            }
        });
        pp.add(b);
        pp.add(c);
        j.add(p);
        j.add(pp);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        setGraphics();
    
    }
    
    void setGraphics() {
        g = p.getGraphics();
    }
    
    public static void main(String[] args) {
        new Jjangi();
    }
}