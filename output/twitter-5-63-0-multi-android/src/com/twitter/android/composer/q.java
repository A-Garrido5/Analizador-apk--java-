// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.provider.ad;
import android.database.Cursor;
import com.twitter.util.concurrent.d;

class q implements d
{
    final /* synthetic */ ComposerActivity a;
    
    q(final ComposerActivity a) {
        this.a = a;
    }
    
    public void a(final Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            if (cursor.moveToFirst()) {
                this.a.a(new ad(cursor).a());
            }
        }
        finally {
            cursor.close();
        }
    }
}
