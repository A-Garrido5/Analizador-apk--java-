// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264;

public class CharCache
{
    private char[] cache;
    private int pos;
    
    public CharCache(final int n) {
        this.cache = new char[n];
    }
    
    public void append(final char c) {
        if (this.pos < -1 + this.cache.length) {
            this.cache[this.pos] = c;
            ++this.pos;
        }
    }
    
    public void append(final String s) {
        final char[] charArray = s.toCharArray();
        final int n = this.cache.length - this.pos;
        int length;
        if (charArray.length < n) {
            length = charArray.length;
        }
        else {
            length = n;
        }
        System.arraycopy(charArray, 0, this.cache, this.pos, length);
        this.pos += length;
    }
    
    public void clear() {
        this.pos = 0;
    }
    
    public int length() {
        return this.pos;
    }
    
    @Override
    public String toString() {
        return new String(this.cache, 0, this.pos);
    }
}
