package org.npe4j.harmonica.core.beans;

public enum TypeSolfege {
        LA('A'),
        SI('B'),
        DO('C'),
        RE('D'),
        MI('E'),
        FA('F'),
        SOL('G'),
        ;

    private char pitch;

    private TypeSolfege(
        final char pitch) {
        this.pitch = pitch;
    }

    public char getPitch() {
        return pitch;
    }
}
