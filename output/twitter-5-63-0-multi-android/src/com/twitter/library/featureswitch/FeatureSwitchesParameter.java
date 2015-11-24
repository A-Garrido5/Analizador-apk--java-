// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.util.ArrayList;

public class FeatureSwitchesParameter extends FeatureSwitchesValue
{
    private ArrayList mEnumerationValues;
    
    public FeatureSwitchesParameter(final String s, final Object o, final ArrayList mEnumerationValues) {
        super(s, o);
        this.mEnumerationValues = mEnumerationValues;
    }
    
    public String a() {
        return this.mKey;
    }
    
    public ArrayList b() {
        if (this.mEnumerationValues == null) {
            this.mEnumerationValues = new ArrayList();
        }
        return this.mEnumerationValues;
    }
}
