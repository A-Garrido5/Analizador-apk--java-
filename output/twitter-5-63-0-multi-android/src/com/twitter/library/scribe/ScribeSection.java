// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import java.util.Iterator;
import com.twitter.util.e;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.util.SparseArray;
import android.os.Parcelable;

public abstract class ScribeSection implements Parcelable
{
    private final String a;
    private final SparseArray b;
    
    protected ScribeSection(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readSparseArray(ScribeSection.class.getClassLoader());
    }
    
    protected ScribeSection(final String a, final int n) {
        this.a = a;
        this.b = new SparseArray(n);
    }
    
    private void a(final JsonGenerator jsonGenerator, final Object o) {
        if (o instanceof Number) {
            final Number n = (Number)o;
            if (n instanceof Integer || n instanceof Short || n instanceof Byte) {
                jsonGenerator.b(n.intValue());
                return;
            }
            if (n instanceof Long) {
                jsonGenerator.a(n.longValue());
                return;
            }
            jsonGenerator.a(n.doubleValue());
        }
        else {
            if (o instanceof String) {
                jsonGenerator.b((String)o);
                return;
            }
            if (o instanceof Boolean) {
                jsonGenerator.a((boolean)o);
                return;
            }
            if (o instanceof ScribeSection) {
                jsonGenerator.c();
                ((ScribeSection)o).b(jsonGenerator);
                jsonGenerator.d();
                return;
            }
            if (o instanceof ArrayList) {
                jsonGenerator.a();
                final Iterator<Object> iterator = ((ArrayList)o).iterator();
                while (iterator.hasNext()) {
                    this.a(jsonGenerator, iterator.next());
                }
                jsonGenerator.b();
                return;
            }
            e.a(false, "unsupported scribe value type " + o.getClass());
        }
    }
    
    private void b(final JsonGenerator jsonGenerator) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final int key = this.b.keyAt(i);
            final Object value = this.b.valueAt(i);
            if (value != null) {
                jsonGenerator.a(this.a(key));
                this.a(jsonGenerator, value);
            }
        }
    }
    
    protected String a() {
        return this.a;
    }
    
    protected abstract String a(final int p0);
    
    protected void a(final int n, final Object o) {
        this.b.put(n, o);
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        final String a = this.a();
        if (a == null) {
            this.b(jsonGenerator);
            return;
        }
        jsonGenerator.a(a);
        jsonGenerator.c();
        this.b(jsonGenerator);
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeSparseArray(this.b);
    }
}
