// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.os.Bundle;
import java.util.ArrayList;
import android.database.Cursor;
import android.util.SparseIntArray;
import java.util.BitSet;

public class d extends r
{
    private final BitSet i;
    private final BitSet j;
    private final BitSet k;
    private final SparseIntArray l;
    private final SparseIntArray m;
    
    public d(final Cursor cursor) {
        super(cursor);
        this.i = new BitSet();
        this.j = new BitSet();
        this.k = new BitSet();
        this.l = new SparseIntArray();
        this.m = new SparseIntArray();
    }
    
    private void a(final int n, final int n2, final int n3) {
        this.k.set(n);
        this.l.put(n, n2);
        this.m.put(n, n3);
    }
    
    @Override
    public void a() {
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        final Cursor e = this.e;
        if (e == null) {
            this.c = null;
            return;
        }
        final BitSet i = this.i;
        final BitSet j = this.j;
        final ArrayList<Integer> c = new ArrayList<Integer>();
        if (e.moveToFirst()) {
            final int int1 = e.getInt(bq.f);
            i.set(0);
            int n = -1;
            int n2 = -1;
            int n3 = 0;
            int n4 = int1;
            int n5 = 0;
            int n6 = -1;
            do {
                final int int2 = e.getInt(bq.f);
                if (n4 != int2) {
                    if (n4 == 2 && n6 != -1) {
                        this.a(n6, n2, n);
                        n6 = -1;
                        n = -1;
                        n2 = -1;
                        n3 = 0;
                    }
                    j.set(n5 - 1);
                    i.set(n5);
                    n4 = int2;
                }
                final int position = e.getPosition();
                if (int2 == 2) {
                    if (++n3 <= 4) {
                        if (n3 == 1) {
                            n2 = position;
                        }
                        else if (n3 > 3) {
                            n6 = n5;
                        }
                        c.add(position);
                        ++n5;
                    }
                    n = position;
                }
                else {
                    c.add(position);
                    ++n5;
                }
            } while (e.moveToNext());
            if (n4 == 2 && n6 != -1) {
                this.a(n6, n2, n);
            }
            j.set(n5 - 1);
        }
        this.c = c;
    }
    
    public Bundle getExtras() {
        if (this.e != null) {
            final int position = this.getPosition();
            final Bundle bundle = new Bundle();
            bundle.putBoolean("start", this.i.get(position));
            bundle.putBoolean("end", this.j.get(position));
            return bundle;
        }
        return Bundle.EMPTY;
    }
    
    public int getInt(final int n) {
        if (n == bq.f && this.k.get(this.getPosition())) {
            return -1;
        }
        return super.getInt(n);
    }
    
    @Override
    public boolean moveToPosition(final int n) {
        final Cursor e = this.e;
        return e != null && super.moveToPosition(n) && e.moveToPosition((int)this.c());
    }
}
