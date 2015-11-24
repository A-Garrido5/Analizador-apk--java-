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
import java.util.List;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executors;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.bf;
import android.content.Context;
import java.util.concurrent.Executor;

class bq implements Runnable
{
    final /* synthetic */ j a;
    final /* synthetic */ bo b;
    
    bq(final bo b, final j a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(this.b.b());
    }
}
