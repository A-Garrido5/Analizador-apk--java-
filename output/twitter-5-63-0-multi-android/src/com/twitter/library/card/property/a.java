// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.util.SparseArray;

public class a extends SparseArray
{
    public a() {
    }
    
    public a(final int n) {
        super(n);
    }
    
    public static a a(final Class clazz, final ObjectInput objectInput) {
        final int int1 = objectInput.readInt();
        a a;
        if (int1 < 0) {
            a = null;
        }
        else {
            a = new a(int1);
            for (int i = 0; i < int1; ++i) {
                a.put(objectInput.readInt(), clazz.cast(objectInput.readObject()));
            }
        }
        return a;
    }
    
    public static void a(final a a, final ObjectOutput objectOutput) {
        if (a == null) {
            objectOutput.writeInt(-1);
        }
        else {
            final int size = a.size();
            objectOutput.writeInt(size);
            for (int i = 0; i < size; ++i) {
                objectOutput.writeInt(a.keyAt(i));
                objectOutput.writeObject(a.valueAt(i));
            }
        }
    }
    
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof a)) {
                return false;
            }
            final int size = this.size();
            final a a = (a)o;
            if (size != a.size()) {
                return false;
            }
            for (int i = 0; i < size; ++i) {
                if (this.keyAt(i) != a.keyAt(i)) {
                    return false;
                }
                final Object value = this.valueAt(i);
                final Object value2 = a.valueAt(i);
                if (value == null) {
                    if (value2 != null) {
                        return false;
                    }
                }
                else {
                    if (value2 == null) {
                        return false;
                    }
                    if (!value.equals(value2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public int hashCode() {
        int n = 1;
        int n3;
        for (int size = this.size(), i = 0; i < size; ++i, n = n3) {
            final Object value = this.valueAt(i);
            final int n2 = n * 31;
            int hashCode;
            if (value != null) {
                hashCode = value.hashCode();
            }
            else {
                hashCode = 0;
            }
            n3 = n2 + hashCode;
        }
        return n;
    }
}
