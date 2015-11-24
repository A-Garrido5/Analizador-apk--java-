// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ContentProviderResult;
import java.util.ArrayList;
import android.database.Cursor;
import android.os.RemoteException;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProviderClient;

final class by implements ke
{
    private final ContentProviderClient a;
    
    private by(final ContentProviderClient a) {
        this.a = a;
    }
    
    by(final ContentProviderClient contentProviderClient, final v5 v5) {
        this(contentProviderClient);
    }
    
    @Override
    public int a(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        try {
            return this.a.update(uri, contentValues, s, array);
        }
        catch (RemoteException ex) {
            return -1;
        }
    }
    
    @Override
    public int a(final Uri uri, final String s, final String[] array) {
        try {
            return this.a.delete(uri, s, array);
        }
        catch (RemoteException ex) {
            return -1;
        }
    }
    
    @Override
    public Cursor a(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        try {
            return this.a.query(uri, array, s, array2, s2);
        }
        catch (RemoteException ex) {
            return null;
        }
    }
    
    @Override
    public Uri a(final Uri uri, final ContentValues contentValues) {
        try {
            return this.a.insert(uri, contentValues);
        }
        catch (RemoteException ex) {
            return null;
        }
    }
    
    @Override
    public ContentProviderResult[] a(final ArrayList list) {
        return this.a.applyBatch(list);
    }
}
