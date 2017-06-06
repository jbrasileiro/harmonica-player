package org.npe4j.harmonica.core.beans;

import java.util.Iterator;

public final class FrenchHarp {

    private final Iterator<FrenchHarpNote> role;

    public FrenchHarp(
        final Iterator<FrenchHarpNote> role) {
        super();
        this.role = role;
    }

    public Iterator<FrenchHarpNote> getRole() {
        return role;
    }
}
