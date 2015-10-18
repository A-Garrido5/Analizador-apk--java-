// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import android.content.ActivityNotFoundException;
import android.os.Parcelable;
import com.twitter.library.client.az;
import android.content.pm.LabeledIntent;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.library.api.QuotedTweetData;
import android.content.Context;
import android.util.Pair;
import android.text.TextUtils;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import android.util.SparseArray;
import java.util.Set;

public class bf
{
    public static final Set a;
    public static final Set b;
    protected static final SparseArray c;
    protected static final SparseArray d;
    private bg e;
    private bg f;
    private List g;
    
    static {
        a = new HashSet();
        (b = new HashSet()).add(1);
        bf.b.add(2);
        bf.b.add(5);
        bf.a.add(1);
        bf.a.add(3);
        bf.a.add(12);
        bf.a.add(4);
        bf.a.add(6);
        bf.a.add(7);
        bf.a.add(8);
        bf.a.add(9);
        bf.a.add(10);
        bf.a.add(11);
        (c = new SparseArray()).put(2, (Object)"com.android.email");
        bf.c.put(3, (Object)"com.android.mms");
        bf.c.put(12, (Object)"com.google.android.apps.babel");
        bf.c.put(4, (Object)"com.google.android.apps.hangout");
        bf.c.put(5, (Object)"com.google.android.gm");
        bf.c.put(6, (Object)"com.facebook.composer");
        bf.c.put(7, (Object)"com.tencent.mm");
        bf.c.put(8, (Object)"jp.naver.line");
        bf.c.put(9, (Object)"com.facebook.messenger");
        bf.c.put(10, (Object)"com.whatsapp");
        bf.c.put(11, (Object)"com.twitter.android.MessagesActivity");
        (d = new SparseArray()).put(1, (Object)"09");
        bf.d.put(2, (Object)"02");
        bf.d.put(3, (Object)"01");
        bf.d.put(12, (Object)"15");
        bf.d.put(4, (Object)"15");
        bf.d.put(5, (Object)"03");
        bf.d.put(6, (Object)"04");
        bf.d.put(7, (Object)"05");
        bf.d.put(8, (Object)"06");
        bf.d.put(9, (Object)"07");
        bf.d.put(10, (Object)"08");
        bf.d.put(11, (Object)"16");
        bf.d.put(13, (Object)"13");
    }
    
    public bf() {
        this.g = new ArrayList();
    }
    
    public static String a(final String s, final int n) {
        final String s2 = (String)bf.d.get(n, bf.d.get(1));
        try {
            final Uri$Builder buildUpon = Uri.parse(s).buildUpon();
            buildUpon.appendQueryParameter("s", s2);
            return buildUpon.build().toString();
        }
        catch (NullPointerException ex) {
            return s;
        }
    }
    
    public void a(final int n, final String s) {
        this.a(n, "", s);
    }
    
    public void a(final int n, final String s, final String s2) {
        if (n == 1) {
            this.a(s, s2);
        }
        else {
            final String s3 = (String)bf.c.get(n, (Object)"");
            if (!TextUtils.isEmpty((CharSequence)s3)) {
                this.g.add(new Pair((Object)s3, (Object)new bg(s, s2)));
            }
        }
    }
    
    public void a(final Context context, final QuotedTweetData quotedTweetData, final boolean b) {
        final Intent putExtra = new Intent("android.intent.action.VIEW").setPackage(context.getPackageName()).setDataAndType(new Uri$Builder().scheme("twitter").authority("dm_conversation").build(), "text/plain").putExtra("android.intent.extra.TEXT", this.f.a);
        final Intent setData = new Intent("android.intent.action.VIEW").setData(bn.a);
        this.e.a(setData);
        final Intent setType = new Intent("android.intent.action.SEND").setType("text/plain");
        this.f.a(setType);
        if (quotedTweetData != null) {
            setData.putExtra("tweet_id", quotedTweetData.statusId);
            setType.putExtra("tweet_id", quotedTweetData.statusId);
            putExtra.putExtra("quoted_tweet", (Serializable)quotedTweetData);
        }
        final ArrayList<Intent> list = new ArrayList<Intent>();
        final HashSet set = new HashSet();
        bn.a(context, list, setData, set);
        bn.a(context, list, setType, set);
        if (!list.isEmpty()) {
            final Intent intent = list.get(-1 + list.size());
            final String action = intent.getAction();
            final String package1 = intent.getPackage();
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                final Intent intent2 = iterator.next();
                if (action.equals(intent2.getAction()) && package1.equals(intent2.getPackage())) {
                    iterator.remove();
                }
            }
            list.add(intent);
        }
        Label_0473: {
            if (list.isEmpty()) {
                break Label_0473;
            }
            Object o = new LabeledIntent(new Intent().setComponent(putExtra.resolveActivity(context.getPackageManager())).setData(putExtra.getData()).putExtras(putExtra.getExtras()), context.getPackageName(), lg.label_direct_message, 0);
            while (true) {
                if ((quotedTweetData == null || b) && az.a(context).b().d()) {
                    list.add(0, (Intent)o);
                }
                this.a(list);
                final Intent chooser = Intent.createChooser((Intent)list.remove(-1 + list.size()), (CharSequence)context.getString(lg.tweets_share_status));
                chooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray(new Parcelable[list.size()]));
                try {
                    context.startActivity(chooser);
                    return;
                    o = putExtra;
                    continue;
                }
                catch (ActivityNotFoundException ex) {}
                break;
            }
        }
    }
    
    public void a(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            this.f = new bg(s2);
            return;
        }
        this.e = new bg(s, s2);
    }
    
    protected void a(final List list) {
        list.removeAll(Collections.singleton((Object)null));
        for (final Intent intent : list) {
            if (intent.getComponent() != null && intent.getComponent().getClassName() != null) {
                final String className = intent.getComponent().getClassName();
                for (final Pair pair : this.g) {
                    if (className.contains((CharSequence)pair.first)) {
                        ((bg)pair.second).a(intent);
                        break;
                    }
                }
            }
        }
    }
}
