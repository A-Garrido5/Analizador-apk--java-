// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Iterator;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.io.Externalizable;

public class TwitterSearchSuggestion implements Externalizable
{
    private static final long serialVersionUID = 2530261073534061754L;
    public ArrayList correctionIndices;
    public String query;
    
    public TwitterSearchSuggestion() {
    }
    
    public TwitterSearchSuggestion(final String query, final ArrayList correctionIndices) {
        this.query = query;
        this.correctionIndices = correctionIndices;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b;
        if (this == o) {
            b = true;
        }
        else {
            b = false;
            if (o != null) {
                final Class<? extends TwitterSearchSuggestion> class1 = this.getClass();
                final Class<?> class2 = o.getClass();
                b = false;
                if (class1 == class2) {
                    final TwitterSearchSuggestion twitterSearchSuggestion = (TwitterSearchSuggestion)o;
                    int equals;
                    if (this.query == null) {
                        if (twitterSearchSuggestion.query == null) {
                            equals = 1;
                        }
                        else {
                            equals = 0;
                        }
                    }
                    else {
                        equals = (this.query.equals(twitterSearchSuggestion.query) ? 1 : 0);
                    }
                    b = false;
                    if (equals != 0) {
                        final int size = this.correctionIndices.size();
                        final int size2 = twitterSearchSuggestion.correctionIndices.size();
                        b = false;
                        if (size == size2) {
                            for (int i = 0; i < size; ++i) {
                                final int[] array = this.correctionIndices.get(i);
                                final int[] array2 = twitterSearchSuggestion.correctionIndices.get(i);
                                final int length = array.length;
                                final int length2 = array2.length;
                                b = false;
                                if (length != length2) {
                                    return b;
                                }
                                for (int j = 0; j < array.length; ++j) {
                                    final int n = array[j];
                                    final int n2 = array2[j];
                                    b = false;
                                    if (n != n2) {
                                        return b;
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.query != null) {
            hashCode = this.query.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.correctionIndices.hashCode();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.query = (String)objectInput.readObject();
        final int int1 = objectInput.readInt();
        final ArrayList correctionIndices = new ArrayList<int[]>(int1);
        for (int i = 0; i < int1; ++i) {
            correctionIndices.add(new int[] { objectInput.readInt(), objectInput.readInt() });
        }
        this.correctionIndices = correctionIndices;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.query);
        objectOutput.writeInt(this.correctionIndices.size());
        for (final int[] array : this.correctionIndices) {
            objectOutput.writeInt(array[0]);
            objectOutput.writeInt(array[1]);
        }
    }
}
