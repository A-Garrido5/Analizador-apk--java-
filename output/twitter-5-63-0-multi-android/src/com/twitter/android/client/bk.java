// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.trends.TrendsPlusActivity;
import java.util.Iterator;
import com.twitter.library.metrics.f;
import android.view.KeyEvent;
import android.content.res.Configuration;
import com.twitter.android.composer.au;
import com.twitter.android.DraftsActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.kz;
import com.twitter.util.concurrent.h;
import com.twitter.util.concurrent.e;
import com.twitter.android.az;
import com.twitter.android.kg;
import com.twitter.android.SettingsActivity;
import com.twitter.library.network.g;
import com.twitter.library.client.App;
import com.twitter.library.client.r;
import com.twitter.library.client.aa;
import com.twitter.library.client.d;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.MainActivity;
import android.net.Uri;
import com.twitter.android.widget.cs;
import com.twitter.android.widget.bf;
import com.twitter.internal.android.widget.DockLayout;
import com.twitter.android.widget.bg;
import android.view.View;
import android.app.Activity;
import com.twitter.android.DispatchActivity;
import android.content.Context;
import com.twitter.library.media.manager.q;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import android.os.Bundle;
import com.twitter.android.client.notifications.StatusBarNotif;
import com.twitter.library.util.bq;
import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.android.widget.bc;
import com.twitter.android.av.audio.i;
import java.util.ArrayList;
import com.twitter.android.composer.FloatingActionButtonLayout;
import com.twitter.android.composer.ComposerDockLayout;
import com.twitter.library.client.s;
import com.twitter.android.ju;
import com.twitter.library.client.AbsFragmentActivity;
import com.twitter.android.composer.at;

class bk implements at
{
    final /* synthetic */ TwitterFragmentActivity a;
    
    bk(final TwitterFragmentActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        String s = null;
        switch (n) {
            default: {
                s = "";
                break;
            }
            case 1: {
                s = "composebox";
                break;
            }
            case 3: {
                s = "camera";
                break;
            }
            case 2: {
                s = "photo_picker";
                break;
            }
            case 4: {
                s = "drafts";
                break;
            }
        }
        this.a.G().a(this.a.U().g(), "", "", "compose_bar", s, "click");
        this.a.h(n);
    }
}
