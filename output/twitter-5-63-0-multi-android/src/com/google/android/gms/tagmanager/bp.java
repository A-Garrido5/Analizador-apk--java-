// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executors;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.bf;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.List;

class bp implements Runnable
{
    final /* synthetic */ List a;
    final /* synthetic */ long b;
    final /* synthetic */ bo c;
    
    bp(final bo c, final List a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.b(this.a, this.b);
    }
}
