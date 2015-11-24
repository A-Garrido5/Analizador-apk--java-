// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.widget.Toast;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;

class op extends AsyncTask
{
    final /* synthetic */ ProfileActivity a;
    
    private op(final ProfileActivity a) {
        this.a = a;
    }
    
    protected Long a(final Uri... array) {
        final ContentResolver contentResolver = this.a.getContentResolver();
        final Uri uri = array[0];
        final boolean equals = "com.android.contacts".equals(uri.getAuthority());
        final boolean equals2 = "vnd.android.cursor.item/vnd.twitter.profile".equals(this.a.getIntent().resolveType(contentResolver));
        Label_0115: {
            if (!equals || !equals2) {
                break Label_0115;
            }
            final Cursor query = contentResolver.query(uri, new String[] { "data1" }, (String)null, (String[])null, (String)null);
            if (query == null) {
                break Label_0115;
            }
            try {
                if (query.moveToFirst()) {
                    return query.getLong(0);
                }
                query.close();
                return 0L;
            }
            finally {
                query.close();
            }
        }
    }
    
    protected void a(final Long n) {
        if (this.a.isFinishing()) {
            return;
        }
        if (n == 0L) {
            Toast.makeText((Context)this.a, 2131298068, 1).show();
            this.a.finish();
            return;
        }
        this.a.y = n;
        this.a.z();
    }
}
