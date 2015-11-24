// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264;

public class BTree
{
    private BTree one;
    private Object value;
    private BTree zero;
    
    public void addString(final String s, final Object value) {
        if (s.length() == 0) {
            this.value = value;
            return;
        }
        BTree bTree;
        if (s.charAt(0) == '0') {
            if (this.zero == null) {
                this.zero = new BTree();
            }
            bTree = this.zero;
        }
        else {
            if (this.one == null) {
                this.one = new BTree();
            }
            bTree = this.one;
        }
        bTree.addString(s.substring(1), value);
    }
    
    public BTree down(final int n) {
        if (n == 0) {
            return this.zero;
        }
        return this.one;
    }
    
    public Object getValue() {
        return this.value;
    }
}
