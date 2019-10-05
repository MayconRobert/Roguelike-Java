/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisal.aula;

import javax.swing.JFrame;

/**
 *
 * @author pdjkl
 */
public class Main {
    private static JFrame window;
    private static Gameboard gameboard;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createWindow();
//        Jogo jogo = new Jogo(100, 30);
//        jogo.executar();
    }
    
    private static void createWindow() {
        window = new JFrame("Roguelike");
        window.setVisible(true);
        window.setBounds(200,100, 900, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private static void createGameboard() {
        gameboard = new Gameboard();
        window.add(gameboard);
    }
}
