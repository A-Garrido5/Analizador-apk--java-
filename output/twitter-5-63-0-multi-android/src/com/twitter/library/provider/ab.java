// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.os.Bundle;
import java.util.ArrayList;
import com.twitter.library.api.at;
import android.database.Cursor;
import android.util.SparseIntArray;
import java.util.BitSet;

public class ab extends r
{
    private final BitSet i;
    private final BitSet j;
    private final BitSet k;
    private final BitSet l;
    private final SparseIntArray m;
    private final SparseIntArray n;
    
    public ab(final Cursor cursor) {
        super(cursor);
        this.i = new BitSet();
        this.j = new BitSet();
        this.k = new BitSet();
        this.l = new BitSet();
        this.m = new SparseIntArray();
        this.n = new SparseIntArray();
    }
    
    private static boolean a(final int n, final int n2) {
        return n != 0 && (bb.f(n2) || bb.g(n2));
    }
    
    private static boolean a(final String s, final int n) {
        return s != null;
    }
    
    private static boolean a(final String s, final int n, final int n2, final String s2, final int n3, final int n4) {
        return (at.a(n, n2) && at.a(n3, n4)) || (n == n3 && s.equals(s2));
    }
    
    @Override
    public void a() {
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        final Cursor e = this.e;
        if (e == null) {
            this.c = null;
            return;
        }
        final ArrayList<Integer> c = new ArrayList<Integer>();
        if (e.moveToFirst()) {
            final BitSet i = this.i;
            final BitSet j = this.j;
            final BitSet k = this.k;
            final BitSet l = this.l;
            final SparseIntArray m = this.m;
            final SparseIntArray n = this.n;
            int n2 = 0;
            final int size = c.size();
            final int n3 = size - 1;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = n3;
            String s = null;
            int n8 = 0;
            int n9 = size;
            int n10 = -1;
            String string = null;
            int int2 = 0;
            int int3 = 0;
            int n11 = 0;
            int n14 = 0;
            int n15 = 0;
        Label_0346_Outer:
            while (true) {
                string = e.getString(cn.d);
                final int int1 = e.getInt(cn.e);
                int2 = e.getInt(cn.f);
                int3 = e.getInt(cn.h);
                if (!a(string, int1, int3, s, n8, n2)) {
                    if (n7 >= 0 && n8 != 0) {
                        j.set(n7);
                    }
                    i.set(n9);
                }
                boolean b;
                if (!string.equals(s)) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b) {
                    if (n7 >= 0 && a(s, n2)) {
                        l.set(n7);
                    }
                    if (a(string, int3)) {
                        k.set(n9);
                    }
                }
                while (true) {
                    Label_0493: {
                        if (!b && n6 == int2) {
                            break Label_0493;
                        }
                        if (a(n6, n2)) {
                            n.put(n5, n10);
                        }
                        if (!a(int2, int3)) {
                            break Label_0493;
                        }
                        m.put(n9, n4);
                        n11 = n9;
                        int n12;
                        if (a(int2, int3) && !e.isFirst()) {
                            if (m.get(n9) != 0) {
                                n12 = 1;
                            }
                            else {
                                n12 = 0;
                            }
                        }
                        else {
                            n12 = 1;
                        }
                        if (n12 != 0) {
                            c.add(n4);
                        }
                        final int n13 = n4 + 1;
                        n14 = n13 - 1;
                        final int size2 = c.size();
                        n15 = size2 - 1;
                        if (!e.moveToNext()) {
                            break;
                        }
                        n9 = size2;
                        n4 = n13;
                        n5 = n11;
                        n6 = int2;
                        n10 = n14;
                        n7 = n15;
                        n8 = int1;
                        s = string;
                        n2 = int3;
                        continue Label_0346_Outer;
                    }
                    n11 = n5;
                    continue;
                }
            }
            j.set(n15);
            if (a(string, int3)) {
                l.set(n15);
            }
            if (a(int2, int3)) {
                n.put(n11, n14);
            }
        }
        this.c = c;
    }
    
    public Bundle getExtras() {
        if (this.e != null) {
            final int position = this.getPosition();
            final Bundle bundle = new Bundle();
            bundle.putBoolean("entity_group_start", this.i.get(position));
            bundle.putBoolean("entity_group_end", this.j.get(position));
            bundle.putBoolean("entity_start", this.k.get(position));
            bundle.putBoolean("entity_end", this.l.get(position));
            final Integer value = this.m.get(position);
            final Integer value2 = this.n.get(position);
            if (value != null && value2 != null) {
                bundle.putInt("data_type_source_start", (int)value);
                bundle.putInt("data_type_source_end", (int)value2);
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }
    
    public int getInt(final int n) {
        int int1 = super.getInt(n);
        if (n == cn.m && int1 == 24 && !this.getExtras().getBoolean("entity_start")) {
            int1 = -1;
        }
        return int1;
    }
    
    public boolean isFirst() {
        if (this.c == null || this.c.isEmpty()) {
            return super.isFirst();
        }
        return ((Integer)this.c()).equals(this.c.get(0));
    }
    
    public boolean isLast() {
        if (this.c == null || this.c.isEmpty()) {
            return super.isLast();
        }
        return ((Integer)this.c()).equals(this.c.get(-1 + this.c.size()));
    }
    
    @Override
    public boolean moveToPosition(final int n) {
        final Cursor e = this.e;
        return e != null && super.moveToPosition(n) && e.moveToPosition((int)this.c());
    }
}
