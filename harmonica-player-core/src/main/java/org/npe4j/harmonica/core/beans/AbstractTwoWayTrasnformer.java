package org.npe4j.harmonica.core.beans;

public abstract class AbstractTwoWayTrasnformer<I, O>
    implements
    TwoWayTranformer<I, O> {

    private final Tranformer<I, O> transformerTo;
    private final Tranformer<O, I> transformerFrom;

    public AbstractTwoWayTrasnformer(
        final Tranformer<I, O> transformerTo,
        final Tranformer<O, I> transformerFrom) {
        super();
        this.transformerTo = transformerTo;
        this.transformerFrom = transformerFrom;
    }

    public final O transformerTo(
        final I in) {
        return transformerTo.transformer(in);
    }

    public final I transformerFrom(
        final O in) {
        return transformerFrom.transformer(in);
    }
}
