package org.npe4j.harmonica.core.beans;

public interface Tranformer<I, O> {

    O transformer(
        I in);
}
