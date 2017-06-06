package org.npe4j.harmonica.core.beans;

public final class Solfege {

    private final TypeSolfege type;
    private final TypePitch typePitch;

    public Solfege(
        final TypeSolfege type,
        final TypePitch typePitch) {
        super();
        this.type = type;
        this.typePitch = typePitch;
    }

    public TypeSolfege getType() {
        return type;
    }

    public TypePitch getTypePitch() {
        return typePitch;
    }
}
