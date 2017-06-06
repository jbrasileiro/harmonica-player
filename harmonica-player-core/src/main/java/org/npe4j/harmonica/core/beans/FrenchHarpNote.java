package org.npe4j.harmonica.core.beans;

public final class FrenchHarpNote {

    private final int number;
    private final Solfege solfege;

    public FrenchHarpNote(
        final int number,
        final Solfege solfege) {
        super();
        this.number = number;
        this.solfege = solfege;
    }

    public int getNumber() {
        return number;
    }

    public Solfege getSolfege() {
        return solfege;
    }
}
