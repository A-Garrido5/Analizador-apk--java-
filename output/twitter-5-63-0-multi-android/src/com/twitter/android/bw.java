// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.client.r;
import com.twitter.library.network.ae;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.ad;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.twitter.library.client.Session;
import com.twitter.library.card.element.d;
import com.twitter.library.client.k;
import com.twitter.library.client.az;
import com.twitter.library.card.Card;
import com.twitter.android.card.y;
import com.twitter.android.card.w;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.provider.Tweet;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.os.Handler;
import com.twitter.android.card.z;
import android.support.v4.app.Fragment;
import com.twitter.internal.network.l;
import java.util.Iterator;
import android.support.v4.app.FragmentActivity;
import java.io.IOException;
import com.twitter.errorreporter.b;
import com.twitter.library.card.CardDebugLog;
import android.text.TextUtils;
import java.io.Closeable;
import com.twitter.library.card.instance.c;
import com.twitter.library.api.bh;
import com.twitter.errorreporter.a;
import java.io.InputStream;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.ref.WeakReference;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.internal.network.j;

class bw implements j
{
    public CardInstanceData a;
    private final WeakReference b;
    private String c;
    
    public bw(final CardPreviewerFragment cardPreviewerFragment, final String c) {
        this.b = new WeakReference((T)cardPreviewerFragment);
        this.c = c;
    }
    
    private by a(final JsonParser jsonParser) {
        String g = null;
        final by by = new by(null);
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bv.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("code".equalsIgnoreCase(g)) {
                        by.a = this.b(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("tag_name".equalsIgnoreCase(g)) {
                        by.b = g2;
                        break;
                    }
                    if ("tag_value".equalsIgnoreCase(g)) {
                        by.c = g2;
                        break;
                    }
                    break;
                }
                case 4: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        return by;
    }
    
    private void a(final InputStream inputStream, final a a) {
        by by = null;
        final JsonParser a2 = bh.a(inputStream);
        JsonToken a3 = a2.a();
        String s = null;
        String s2 = null;
        while (a3 != null && a3 != JsonToken.c) {
            by a4 = null;
            String s3 = null;
            String s4 = null;
            Label_0083: {
                switch (bv.a[a3.ordinal()]) {
                    case 1: {
                        if ("card".equalsIgnoreCase(s2)) {
                            final c c = new c();
                            if (c.a(a2, a)) {
                                this.a = c.a();
                            }
                            a4 = by;
                            s3 = s;
                            s4 = s2;
                            break Label_0083;
                        }
                        if ("info".equalsIgnoreCase(s2)) {
                            a4 = this.a(a2);
                            s3 = s;
                            s4 = s2;
                            break Label_0083;
                        }
                        a2.c();
                        a4 = by;
                        s3 = s;
                        s4 = s2;
                        break Label_0083;
                    }
                    case 2: {
                        a2.c();
                        a4 = by;
                        s3 = s;
                        s4 = s2;
                        break Label_0083;
                    }
                    case 3: {
                        if ("error".equalsIgnoreCase(s2)) {
                            final String g = a2.g();
                            s4 = s2;
                            a4 = by;
                            s3 = g;
                            break Label_0083;
                        }
                        break;
                    }
                    case 4: {
                        final String g2 = a2.g();
                        final by by2 = by;
                        s3 = s;
                        s4 = g2;
                        a4 = by2;
                        break Label_0083;
                    }
                }
                a4 = by;
                s3 = s;
                s4 = s2;
            }
            final JsonToken a5 = a2.a();
            final by by3 = a4;
            a3 = a5;
            s2 = s4;
            s = s3;
            by = by3;
        }
        yh.a(a2);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final CardPreviewerFragment cardPreviewerFragment = (CardPreviewerFragment)this.b.get();
            if (cardPreviewerFragment != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                if (by != null) {
                    sb.append("\n");
                    if (by.a != null) {
                        sb.append("Code: ");
                        if (TextUtils.isEmpty((CharSequence)by.a.b)) {
                            sb.append("?");
                        }
                        else {
                            sb.append(by.a.b);
                        }
                        sb.append(" (");
                        sb.append(by.a.a);
                        sb.append(")\n");
                    }
                    sb.append("Tag: ");
                    if (TextUtils.isEmpty((CharSequence)by.b)) {
                        sb.append("?");
                    }
                    else {
                        sb.append(by.b);
                    }
                    sb.append(" \u2192 ");
                    if (TextUtils.isEmpty((CharSequence)by.c)) {
                        sb.append("?");
                    }
                    else {
                        sb.append(by.c);
                    }
                }
                cardPreviewerFragment.a(this.c, sb.toString());
            }
        }
    }
    
    private bx b(final JsonParser jsonParser) {
        String g = null;
        final bx bx = new bx(null);
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bv.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("name".equalsIgnoreCase(g)) {
                        bx.b = g2;
                        break;
                    }
                    break;
                }
                case 5:
                case 6: {
                    final int h = jsonParser.h();
                    if ("value".equalsIgnoreCase(g)) {
                        bx.a = h;
                        break;
                    }
                    break;
                }
                case 4: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        return bx;
    }
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        final CardPreviewerFragment cardPreviewerFragment = (CardPreviewerFragment)this.b.get();
        FragmentActivity activity;
        if (cardPreviewerFragment != null) {
            activity = cardPreviewerFragment.getActivity();
        }
        else {
            activity = null;
        }
        if (n == 200) {
            if (!s.startsWith("application/json")) {
                CardDebugLog.c("Expecting JSON content in response", null);
            }
            try {
                final a a = new a();
                this.a(inputStream, a);
                if (cardPreviewerFragment != null) {
                    for (final b b : a.a()) {
                        if (b.c()) {
                            cardPreviewerFragment.b(b.b().getMessage());
                        }
                    }
                }
            }
            catch (IOException ex) {
                if (cardPreviewerFragment != null) {
                    cardPreviewerFragment.a(this.c, ex.toString());
                }
            }
        }
        else if (n == 403 && activity != null) {
            cardPreviewerFragment.b(activity.getString(2131296794));
        }
    }
    
    @Override
    public void a(final l l) {
        final CardPreviewerFragment cardPreviewerFragment = (CardPreviewerFragment)this.b.get();
        if (cardPreviewerFragment != null) {
            cardPreviewerFragment.a(this.c, l);
        }
    }
}
