package com.kodilla.checkers;

import java.util.*;

public class BoardRow {

    private int row;
    private List<Figure> figure;

    public BoardRow(int row, List<Figure> figure) {
        this.row = row;
        this.figure = figure;
    }

    public List<Figure> getFigure() {
        return figure;
    }
    /*
    public int indexOf(Figure f) {
        return figure.indexOf(f);
    }*/

    public void setFigure(int col, Figure f) {
        figure.add(col, f);
        figure.remove(col + 1);
        //int temp = this.indexOf(this.getFigure().get(col));
        //figure.set(temp, f);
    }

    @Override
    public String toString() {
        String temp = "";
        Iterator<Figure> iT = figure.iterator();
        while(iT.hasNext()) {
            temp += iT.next().toString() + "|";
        }
        return "|" + temp + "\n";
    }
}
