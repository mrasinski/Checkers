package com.kodilla.checkers;

public class Figure {

    private String color;
    private String figure;

    public Figure(String figure, String color) {
        if(figure.toUpperCase().equals("PAWN") || figure.toUpperCase().equals("QUEEN")) {
            this.figure = figure.substring(0,1).toUpperCase();
            this.color = color.substring(0,1).toLowerCase();
        } else {
            this.figure = "NONE";
            this.color = "";
        }
    }

    @Override
    public String toString() {
        if(figure.toUpperCase().equals("NONE")) {
            return "  ";
        }
        return color + figure;
    }
}
