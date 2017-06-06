package org.npe4j.harmonica.core.beans;

public enum TypePitch {
        Diesis('#'),
        Bemolle('b'),
        ;

    private char symbol;

    private TypePitch(
        final char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
