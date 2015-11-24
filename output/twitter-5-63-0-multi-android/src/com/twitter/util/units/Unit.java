// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units;

public abstract class Unit extends Number implements Comparable
{
    private final double mValue;
    
    protected Unit(final double mValue) {
        this.mValue = mValue;
    }
    
    protected Unit(final Unit unit) {
        this.mValue = unit.a().doubleValue() / this.a().doubleValue() * unit.doubleValue();
    }
    
    public int a(final Unit unit) {
        return Double.valueOf(this.doubleValue() * this.a().doubleValue()).compareTo(Double.valueOf(unit.doubleValue() * unit.a().doubleValue()));
    }
    
    public abstract Unit a();
    
    @Override
    public double doubleValue() {
        return this.mValue;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        if (o == null) {
            return b;
        }
        try {
            final int a = this.a((Unit)o);
            b = false;
            if (a == 0) {
                b = true;
            }
            return b;
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public float floatValue() {
        return (float)this.mValue;
    }
    
    @Override
    public int hashCode() {
        return Double.valueOf(this.mValue).hashCode();
    }
    
    @Override
    public int intValue() {
        return (int)this.mValue;
    }
    
    @Override
    public long longValue() {
        return (long)this.mValue;
    }
}
