package com.kodilla.checkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CheckersApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckersApplication.class, args);

        Figure pawnB = new Figure("pawn", "blue");
        Figure queenB = new Figure("queen", "blue");
        Figure other = new Figure("other", "blue");
        Figure pawnR = new Figure("pawn", "red");
        Figure queenR = new Figure("queen", "red");

        List<Figure> figureB1 = new LinkedList<Figure>();
        List<Figure> figureB2 = new LinkedList<Figure>();
        List<Figure> figureB3 = new LinkedList<Figure>();
        List<Figure> figureR1 = new LinkedList<Figure>();
        List<Figure> figureR2 = new LinkedList<Figure>();
        List<Figure> figureR3 = new LinkedList<Figure>();
        List<Figure> figureN1 = new LinkedList<Figure>();
        List<Figure> figureN2 = new LinkedList<Figure>();

        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                figureB1.add(pawnB);
            } else {
                figureB1.add(other);
            }
        }
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                figureB2.add(other);
            } else {
                figureB2.add(pawnB);
            }
        }
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                figureB3.add(pawnB);
            } else {
                figureB3.add(other);
            }
        }

        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                figureR1.add(pawnR);
            } else {
                figureR1.add(other);
            }
        }
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                figureR2.add(other);
            } else {
                figureR2.add(pawnR);
            }
        }
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                figureR3.add(pawnR);
            } else {
                figureR3.add(other);
            }
        }

        for(int i = 0; i < 8; i++) {
            figureN1.add(other);
        }
        for(int i = 0; i < 8; i++) {
            figureN2.add(other);
        }

        BoardRow boardRow1 = new BoardRow(1, figureB1);
        BoardRow boardRow2 = new BoardRow(2, figureB2);
        BoardRow boardRow3 = new BoardRow(3, figureB3);
        BoardRow boardRow4 = new BoardRow(4, figureN1);
        BoardRow boardRow5 = new BoardRow(5, figureN2);
        BoardRow boardRow6 = new BoardRow(6, figureR1);
        BoardRow boardRow7 = new BoardRow(7, figureR2);
        BoardRow boardRow8 = new BoardRow(8, figureR3);

        List<BoardRow> bR = new ArrayList<BoardRow>();

        bR.add(boardRow1);
        bR.add(boardRow2);
        bR.add(boardRow3);
        bR.add(boardRow4);
        bR.add(boardRow5);
        bR.add(boardRow6);
        bR.add(boardRow7);
        bR.add(boardRow8);

        Board board = new Board(bR);

        board.setFigure(5, 4, queenB);

        System.out.print(board);
        System.out.println(board.getFigure(0, 0));
    }

}

