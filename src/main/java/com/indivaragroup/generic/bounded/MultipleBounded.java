package com.indivaragroup.generic.bounded;

public abstract class MultipleBounded implements Comparable<MultipleBounded> {
    protected abstract double hitungLuas();

    @Override
    public int compareTo(MultipleBounded lain) {
        return Double.compare(this.hitungLuas(), lain.hitungLuas());
    }
}
