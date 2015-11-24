// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.service.aa;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.content.Context;
import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.featureswitch.d;
import android.app.Activity;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.List;
import java.lang.ref.WeakReference;
import com.twitter.library.client.au;

class f implements Runnable
{
    public boolean a;
    final /* synthetic */ e b;
    private final String c;
    
    public f(final e b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        final CardPreviewView cardPreviewView = (CardPreviewView)this.b.c.get();
        if (!this.a && cardPreviewView != null) {
            this.b.c(this.c);
        }
    }
}
