// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.support.v4.app.FragmentActivity;
import com.twitter.android.UsersFragment;
import com.twitter.android.TimelineFragment;
import com.twitter.android.hz;
import com.twitter.library.provider.aq;
import android.text.TextUtils;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Intent;
import com.twitter.android.ListCreateEditActivity;
import android.content.DialogInterface;
import com.twitter.library.api.be;
import com.twitter.library.util.bq;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import android.widget.ProgressBar;
import com.twitter.internal.android.widget.DockLayout;
import com.twitter.android.client.c;
import android.widget.RadioGroup;
import com.twitter.android.ia;
import com.twitter.ui.dialog.e;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.Session;
import com.twitter.library.service.y;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$TwitterList;
import android.database.Cursor;
import android.content.Context;
import android.content.AsyncQueryHandler;

final class a extends AsyncQueryHandler
{
    final /* synthetic */ ListTabActivity a;
    
    public a(final ListTabActivity a, final Context context) {
        this.a = a;
        super(context.getContentResolver());
    }
    
    private void a(final Cursor cursor) {
        Label_0076: {
            if (cursor.moveToFirst()) {
                while (true) {
                    do {
                        this.a.h = ((TwitterTopic$TwitterList)f.a(cursor.getBlob(0))).followStatus;
                        if (this.a.h != 0) {
                            this.a.Q();
                            switch (this.a.h) {
                                default: {
                                    break Label_0076;
                                }
                                case 0: {
                                    final Session a = this.a.U();
                                    final long g = a.g();
                                    if (a.d() && this.a.c != g) {
                                        this.a.a(new nf(this.a.getApplicationContext(), this.a.U(), g, this.a.b, 5), 4);
                                    }
                                    break Label_0076;
                                }
                            }
                        }
                    } while (cursor.moveToNext());
                    continue;
                }
            }
        }
        cursor.close();
    }
    
    private void b(final Cursor cursor) {
        if (cursor.moveToFirst()) {
            do {
                this.a.h = ((TwitterTopic$TwitterList)f.a(cursor.getBlob(0))).followStatus;
                if (this.a.h != 0) {
                    this.a.Q();
                    break;
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
    }
    
    protected void onQueryComplete(final int n, final Object o, final Cursor cursor) {
        if (cursor == null) {
            return;
        }
        if (this.a.isFinishing()) {
            cursor.close();
            return;
        }
        switch (n) {
            default: {}
            case 1: {
                this.a(cursor);
            }
            case 2: {
                this.b(cursor);
            }
        }
    }
}
