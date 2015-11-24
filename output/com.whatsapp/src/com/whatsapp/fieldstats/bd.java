// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bd extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public Double j;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.BACKUP.getCode()));
        a5.a(context, o.BACKUP_RESTORE_IS_FULL, this.a);
        a5.a(context, o.BACKUP_RESTORE_IS_WIFI, this.j);
        a5.a(context, o.BACKUP_RESTORE_RESULT, this.c);
        a5.a(context, o.BACKUP_RESTORE_RETRY_COUNT, this.h);
        if (this.i != null) {
            a5.a(context, a1.BACKUP_RESTORE_CHATDB_SIZE, this.i);
        }
        if (this.d != null) {
            a5.a(context, a1.BACKUP_RESTORE_MEDIA_FILE_COUNT, this.d);
        }
        if (this.g != null) {
            a5.a(context, a1.BACKUP_RESTORE_MEDIA_SIZE, this.g);
        }
        if (this.e != null) {
            a5.a(context, a1.BACKUP_RESTORE_T, this.e);
        }
        if (this.f != null) {
            a5.a(context, a1.BACKUP_RESTORE_TOTAL_SIZE, this.f);
        }
        if (this.b != null) {
            a5.a(context, a1.BACKUP_RESTORE_TRANSFER_SIZE, this.b);
        }
        a5.a(context, o.EVENT);
    }
}
