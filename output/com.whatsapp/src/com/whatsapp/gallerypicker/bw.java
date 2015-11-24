// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.HashMap;
import android.database.ContentObserver;
import android.content.ContentResolver;
import android.net.Uri;

public class bw implements aa
{
    private bj a;
    private Uri b;
    
    public bw(final ContentResolver contentResolver, final Uri b) {
        this.b = b;
        this.a = new d(this, contentResolver, b);
    }
    
    @Override
    public bj a(final int n) {
        if (n == 0) {
            try {
                return this.a;
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    @Override
    public void a() {
        this.a = null;
        this.b = null;
    }
    
    @Override
    public void a(final ContentObserver contentObserver) {
    }
    
    @Override
    public HashMap b() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void b(final ContentObserver contentObserver) {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public int e() {
        return 1;
    }
}
