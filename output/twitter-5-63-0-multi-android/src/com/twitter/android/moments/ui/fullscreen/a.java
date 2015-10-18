// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.android.moments.viewmodels.MomentTweetTextPage;
import com.twitter.android.moments.viewmodels.MomentTweetPhotoPage;
import com.twitter.util.collection.g;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.twitter.android.moments.viewmodels.Capsule;
import com.twitter.util.r;
import com.twitter.android.moments.viewmodels.HydratableMomentPage;
import com.twitter.android.moments.ui.sectionpager.b;
import com.twitter.android.moments.viewmodels.MomentTweetPage;
import com.twitter.android.moments.viewmodels.MomentPage$Type;
import com.twitter.android.moments.viewmodels.MomentPage;
import com.twitter.util.m;
import android.view.LayoutInflater;
import android.content.Context;

public class a
{
    private final Context a;
    private final LayoutInflater b;
    private final m c;
    
    public a(final Context a, final LayoutInflater b, final m c) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    private boolean a(final MomentPage momentPage, final MomentPage momentPage2) {
        return momentPage.b() == MomentPage$Type.b && momentPage2.b() == MomentPage$Type.b && !momentPage.c() && ((MomentTweetPage)momentPage).d() == ((MomentTweetPage)momentPage2).d();
    }
    
    b a(final MomentPage momentPage) {
        switch (com.twitter.android.moments.ui.fullscreen.b.a[momentPage.b().ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unrecognized moment page type: " + momentPage.b());
            }
            case 1:
            case 2: {
                return new b(new c(this.a, this, (HydratableMomentPage)momentPage));
            }
        }
    }
    
    public com.twitter.android.moments.ui.sectionpager.c a(final Capsule capsule, final List list) {
        final ArrayList<b> list2 = new ArrayList<b>(list.size());
        final Iterator<MomentPage> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(this.a(iterator.next()));
        }
        return new com.twitter.android.moments.ui.sectionpager.c(list2, j.a(this.a, this.b, capsule, list.get(0)));
    }
    
    public List a(final Capsule capsule) {
        final ArrayList<com.twitter.android.moments.ui.sectionpager.c> list = new ArrayList<com.twitter.android.moments.ui.sectionpager.c>();
        final List b = capsule.b();
        final g a = g.a();
        int i = 0;
        g a2 = a;
        while (i < b.size()) {
            final MomentPage momentPage = b.get(i);
            a2.a(momentPage);
            final int n = i + 1;
            g g;
            if (n < b.size()) {
                if (!this.a(momentPage, b.get(n))) {
                    list.add(this.a(capsule, a2.d()));
                    a2 = com.twitter.util.collection.g.a();
                }
                g = a2;
            }
            else {
                list.add(this.a(capsule, a2.d()));
                g = a2;
            }
            ++i;
            a2 = g;
        }
        return list;
    }
    
    com.twitter.android.moments.ui.sectionpager.a b(final MomentPage momentPage) {
        switch (com.twitter.android.moments.ui.fullscreen.b.a[momentPage.b().ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unrecognized moment page type: " + momentPage.b());
            }
            case 2: {
                return o.a(this.a, (MomentTweetPhotoPage)momentPage, this.c);
            }
            case 1: {
                return com.twitter.android.moments.ui.fullscreen.r.a(this.a, (MomentTweetTextPage)momentPage, this.c);
            }
        }
    }
}
