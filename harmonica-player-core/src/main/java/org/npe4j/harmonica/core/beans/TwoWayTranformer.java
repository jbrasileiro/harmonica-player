package org.npe4j.harmonica.core.beans;

public interface TwoWayTranformer<I, O> {

    O transformerTo(
        I in);

    I transformerFrom(
        O in);
}
