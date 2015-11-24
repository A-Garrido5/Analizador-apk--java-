// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import java.util.ListIterator;
import com.twitter.library.card.Card;
import java.util.LinkedList;

public class o
{
    private LinkedList a;
    private int b;
    private int c;
    private int d;
    
    public o(final int b) {
        this.a = new LinkedList();
        this.b = b;
    }
    
    public Card a(final String s) {
        // monitorenter(this)
        Label_0087: {
            if (s == null) {
                break Label_0087;
            }
            try {
                if (this.a.size() > 0) {
                    final ListIterator<p> listIterator = (ListIterator<p>)this.a.listIterator(0);
                    while (listIterator.hasNext()) {
                        final p p = listIterator.next();
                        if (p.a.equals(s)) {
                            listIterator.remove();
                            ++this.c;
                            return p.b;
                        }
                    }
                }
                break Label_0087;
                ++this.d;
                return null;
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    public void a(final String s, final Card card) {
        // monitorenter(this)
        if (s == null || card == null) {
            return;
        }
        try {
            if (this.b > 0) {
                if (this.a.size() == this.b) {
                    this.a.removeFirst();
                }
                this.a.add(new p(s, card));
            }
        }
        finally {
        }
        // monitorexit(this)
    }
}
