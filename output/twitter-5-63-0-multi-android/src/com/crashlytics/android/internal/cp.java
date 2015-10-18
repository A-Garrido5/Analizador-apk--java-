// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.annotation.TargetApi;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.io.File;
import android.content.Context;
import android.content.ContextWrapper;

final class cp extends ContextWrapper
{
    private final String a;
    
    public cp(final Context context, final String s) {
        super(context);
        this.a = ".TwitterSdk/" + s;
    }
    
    public final File getCacheDir() {
        return new File(super.getCacheDir(), this.a);
    }
    
    public final File getDatabasePath(final String s) {
        final File file = new File(super.getDatabasePath(s).getParentFile(), this.a);
        file.mkdirs();
        return new File(file, s);
    }
    
    public final File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.a);
    }
    
    public final File getExternalFilesDir(final String s) {
        return new File(super.getExternalFilesDir(s), this.a);
    }
    
    public final File getFilesDir() {
        return new File(super.getFilesDir(), this.a);
    }
    
    public final SQLiteDatabase openOrCreateDatabase(final String s, final int n, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(this.getDatabasePath(s), sqLiteDatabase$CursorFactory);
    }
    
    @TargetApi(11)
    public final SQLiteDatabase openOrCreateDatabase(final String s, final int n, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory, final DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(this.getDatabasePath(s).getPath(), sqLiteDatabase$CursorFactory, databaseErrorHandler);
    }
}
