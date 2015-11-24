// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Vector;

public class e
{
    Vector a;
    
    public e() {
        this.a = new Vector();
    }
    
    public int a() {
        return this.a.size();
    }
    
    public d a(final int n) {
        return this.a.elementAt(n);
    }
    
    public void a(final d d) {
        this.a.addElement(d);
    }
}
