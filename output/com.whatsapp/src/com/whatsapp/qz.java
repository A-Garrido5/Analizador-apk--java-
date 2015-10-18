// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ContentProviderResult;
import java.util.ArrayList;
import android.database.Cursor;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

class qz implements ke
{
    private final ContentProvider a;
    
    qz(final ContentProvider a) {
        this.a = a;
    }
    
    @Override
    public int a(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return this.a.update(uri, contentValues, s, array);
    }
    
    @Override
    public int a(final Uri uri, final String s, final String[] array) {
        return this.a.delete(uri, s, array);
    }
    
    @Override
    public Cursor a(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return this.a.query(uri, array, s, array2, s2);
    }
    
    @Override
    public Uri a(final Uri uri, final ContentValues contentValues) {
        return this.a.insert(uri, contentValues);
    }
    
    @Override
    public ContentProviderResult[] a(final ArrayList list) {
        return this.a.applyBatch(list);
    }
}
