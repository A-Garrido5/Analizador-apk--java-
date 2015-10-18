// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ContentProviderResult;
import java.util.ArrayList;
import android.database.Cursor;
import android.content.ContentValues;
import android.net.Uri;

interface ke
{
    int a(final Uri p0, final ContentValues p1, final String p2, final String[] p3);
    
    int a(final Uri p0, final String p1, final String[] p2);
    
    Cursor a(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4);
    
    Uri a(final Uri p0, final ContentValues p1);
    
    ContentProviderResult[] a(final ArrayList p0);
}
