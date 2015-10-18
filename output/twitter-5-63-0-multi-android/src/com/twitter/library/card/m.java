// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import java.util.HashMap;
import android.util.SparseArray;

public class m
{
    public SparseArray a;
    public HashMap b;
    public int c;
    public int d;
    public int e;
    
    public m() {
        this.b = new HashMap();
        this.a = new SparseArray();
    }
    
    public boolean a() {
        return this.a.size() != 0 || this.c != 0 || this.b.size() != 0;
    }
}
