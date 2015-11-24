// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.n;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.k;
import com.twitter.library.network.ae;
import android.os.Bundle;
import com.twitter.internal.network.l;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.util.List;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;
import android.content.Intent;
import com.twitter.library.scribe.TwitterScribeLog;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.library.client.Session;
import com.twitter.library.util.m;
import com.twitter.android.client.c;
import android.app.IntentService;

public class ContactsUploadService extends IntentService
{
    private static final boolean a;
    private c b;
    private m c;
    private Session d;
    private String e;
    private int f;
    private int g;
    private int h;
    private long i;
    private int j;
    
    static {
        a = (App.l() && Log.isLoggable("ab_upload", 3));
    }
    
    public ContactsUploadService() {
        super("ab_upload_service");
        this.g = 0;
        this.h = 0;
        this.j = 0;
    }
    
    private ix a(final String s, final long n) {
        return ix.a(s, ir.b(), n, ih.m);
    }
    
    private void a() {
        final long g = this.d.g();
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.e, "follow_friends::forward_lookup:request" })).a((long)this.f));
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.e, "follow_friends::forward_lookup:failure" })).a((long)this.j));
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.e, "follow_friends::forward_lookup:count" })).a((long)this.g));
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.e, "import_addressbook::import:done" })).a(System.currentTimeMillis() - this.i));
        this.a("contacts:timing:total:upload_contacts", g).j();
        this.b.b(System.currentTimeMillis());
        this.b.j();
    }
    
    private void a(final Intent intent, final boolean b, final boolean b2) {
        LocalBroadcastManager.getInstance((Context)this).sendBroadcast(intent);
        this.b.b(b);
        this.b.a(b2);
    }
    
    private void a(final Cursor cursor) {
        final List a = this.c.a(cursor);
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.d.g()).b(new String[] { this.e + ":follow_friends:::resolvable" })).a((long)a.size()));
        if (!this.c.b()) {
            this.c.c();
        }
        this.a(a);
    }
    
    private void a(final y y, final aa aa) {
        final l f = aa.f();
        if (!aa.a()) {
            ++this.j;
        }
        if (f != null) {
            final Bundle o = y.o;
            final int int1 = o.getInt("page", -1);
            final int int2 = o.getInt("pages", -1);
            this.g += o.getInt("num_users");
            ++this.h;
            if (this.h != int2) {
                this.a(new Intent("upload_success_broadcast").putExtra("page", int1).putExtra("pages", int2), true, false);
            }
        }
    }
    
    private void a(final List list) {
        final int size = list.size();
        this.f = ae.a(size, 50);
        if (this.f > 0) {
            this.a("contacts:timing:total:upload_contacts", this.d.g()).i();
        }
        for (int i = 0; i < this.f; ++i) {
            final int n = i * 50;
            final mj a = new mj(this.getApplicationContext(), this.d).a(list.subList(n, Math.min(size, n + 50))).a(i, this.f);
            this.a(a, a.S());
        }
        new k((Context)this, this.d.e()).a().a("addressbook_import_done", true).apply();
        final Intent putExtra = new Intent("upload_success_broadcast").putExtra("lookup_complete", true).putExtra("pages", this.f);
        if (this.f > 0) {
            int n2;
            if (this.f > 0) {
                n2 = -1 + this.f;
            }
            else {
                n2 = 0;
            }
            putExtra.putExtra("page", n2);
        }
        this.a(putExtra, false, this.j == 0);
        this.a();
    }
    
    protected void onHandleIntent(final Intent intent) {
        if (intent == null) {
            ErrorReporter.a(new NullPointerException("ContactsUploadService intent is null"));
        }
        else {
            this.e = intent.getStringExtra("scribe_page_term");
            (this.b = com.twitter.android.client.c.a((Context)this)).a(false);
            this.d = this.b.a().b();
            this.i = System.currentTimeMillis();
            if (ContactsUploadService.a) {
                Log.d("ab_upload", "Starting AB Upload..");
            }
            this.c = n.a(this.getApplicationContext());
            final Cursor a = this.c.a();
            if (a == null || a.getCount() == 0) {
                this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.d.g()).b(new String[] { this.e + ":follow_friends:::resolvable" })).a(0L));
                this.a(new Intent("upload_success_broadcast").putExtra("lookup_complete", true), false, true);
                this.a();
            }
            else {
                this.a(a);
            }
            if (a != null) {
                a.close();
            }
        }
    }
}
