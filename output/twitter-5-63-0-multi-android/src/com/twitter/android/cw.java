// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.twitter.library.api.conversations.x;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.conversations.DMMessageEntry;
import com.twitter.library.api.conversations.UpdateConversationNameEntry;
import android.text.TextUtils;
import com.twitter.library.api.conversations.ParticipantsJoinEntry;
import com.twitter.library.provider.c;
import android.content.Context;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.DMPhoto;
import java.util.List;

public class cw
{
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final long g;
    public final boolean h;
    public final int i;
    public final String j;
    public final boolean k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public DMPhoto p;
    public DMTweet q;
    public StringBuilder r;
    public boolean s;
    
    public cw(final Context context, final c c, final long n) {
        long long1 = 0L;
        this.s = false;
        final x c2 = c.c();
        this.a = c.getString(1);
        long e;
        if (c2 == null) {
            e = long1;
        }
        else {
            e = c2.e;
        }
        this.c = e;
        this.h = (this.c == n);
        String f;
        if (c2 == null) {
            f = "";
        }
        else {
            f = c2.f;
        }
        this.j = f;
        this.k = c.h();
        this.l = c.a();
        this.d = c.f();
        this.e = c.g();
        this.b = c.i();
        this.o = c.l();
        if (!c.isNull(6)) {
            long1 = c.getLong(6);
        }
        this.g = long1;
        this.f = (c.getInt(4) > 0);
        this.m = c.k();
        this.n = c.j();
        this.r = new StringBuilder("");
        int d;
        if (c2 == null) {
            d = -1;
        }
        else {
            d = c2.d;
        }
        switch (this.i = d) {
            case 10: {
                this.r.append(TextUtils.join((CharSequence)", ", (Iterable)((ParticipantsJoinEntry)c2.h).addedUserNames));
                this.s = true;
            }
            case 17: {
                this.s = true;
            }
            case 8: {
                this.r.append(((UpdateConversationNameEntry)c2.h).newConversationName);
                this.s = true;
            }
            case 0:
            case 1:
            case 19: {
                final DMMessageEntry dmMessageEntry = (DMMessageEntry)c2.h;
                if (dmMessageEntry == null) {
                    break;
                }
                if (dmMessageEntry.isSpam) {
                    this.r.append(context.getString(2131296879));
                    this.s = true;
                    return;
                }
                final TweetEntities entities = dmMessageEntry.entities;
                if (dmMessageEntry.text != null) {
                    this.r.append(dmMessageEntry.text);
                }
                if (dmMessageEntry.a("photo")) {
                    this.p = (DMPhoto)dmMessageEntry.attachment;
                }
                else if (dmMessageEntry.a("tweet")) {
                    this.q = (DMTweet)dmMessageEntry.attachment;
                }
                if (this.q != null) {
                    if (TextUtils.getTrimmedLength((CharSequence)this.r) == 0 && !TextUtils.isEmpty((CharSequence)this.r)) {
                        this.r.delete(0, -1 + this.r.length());
                    }
                    this.s = true;
                }
                if (this.p != null && TextUtils.getTrimmedLength((CharSequence)this.r) == 0) {
                    if (!TextUtils.isEmpty((CharSequence)this.r)) {
                        this.r.delete(0, -1 + this.r.length());
                    }
                    this.s = true;
                }
                this.r = TweetEntities.a(this.r, entities);
            }
        }
    }
}
