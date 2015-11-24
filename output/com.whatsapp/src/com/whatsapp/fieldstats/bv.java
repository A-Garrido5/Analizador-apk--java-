// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bv extends b9
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
        a5.a(context, o.EVENT, Integer.valueOf(a3.RESTORE.getCode()));
        a5.a(context, o.BACKUP_RESTORE_IS_FULL, this.f);
        a5.a(context, o.BACKUP_RESTORE_IS_WIFI, this.e);
        a5.a(context, o.BACKUP_RESTORE_RESULT, this.d);
        a5.a(context, o.BACKUP_RESTORE_RETRY_COUNT, this.c);
        if (this.i != null) {
            a5.a(context, a1.BACKUP_RESTORE_CHATDB_SIZE, this.i);
        }
        if (this.g != null) {
            a5.a(context, a1.BACKUP_RESTORE_MEDIA_FILE_COUNT, this.g);
        }
        if (this.j != null) {
            a5.a(context, a1.BACKUP_RESTORE_MEDIA_SIZE, this.j);
        }
        if (this.a != null) {
            a5.a(context, a1.BACKUP_RESTORE_T, this.a);
        }
        if (this.b != null) {
            a5.a(context, a1.BACKUP_RESTORE_TOTAL_SIZE, this.b);
        }
        if (this.h != null) {
            a5.a(context, a1.BACKUP_RESTORE_TRANSFER_SIZE, this.h);
        }
        a5.a(context, o.EVENT);
    }
}
