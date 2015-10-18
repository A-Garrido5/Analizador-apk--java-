// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.manager.al;
import com.twitter.library.media.util.l;
import com.twitter.library.media.manager.k;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import com.twitter.library.api.TwitterStatusCard;
import java.util.List;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.MediaEntity;
import com.twitter.internal.android.util.Size;

public class t
{
    public final Object a;
    public final boolean b;
    public final Size c;
    
    public t(final MediaEntity a, final boolean b) {
        this.a = a;
        this.b = (b && a.type == MediaEntity$Type.d);
        this.c = a.size;
    }
    
    public t(final CardInstanceData a) {
        this.a = a;
        this.b = false;
        final ImageSpec j = a.j();
        Size c;
        if (j != null) {
            c = Size.a(j.size.x, j.size.y);
        }
        else {
            c = Size.a;
        }
        this.c = c;
    }
    
    public t(final EditableMedia a) {
        this.a = a;
        this.b = false;
        this.c = a.d();
    }
    
    public static List a(final CardInstanceData cardInstanceData) {
        if (cardInstanceData == null || cardInstanceData.j() == null || new TwitterStatusCard(cardInstanceData).classicCard == null) {
            return null;
        }
        return Collections.singletonList(new t(cardInstanceData));
    }
    
    public static List a(final List list) {
        if (list == null) {
            return null;
        }
        final ArrayList<t> list2 = new ArrayList<t>(list.size());
        final Iterator<EditableMedia> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new t(iterator.next()));
        }
        return list2;
    }
    
    public static List a(final List list, final boolean b) {
        if (list == null) {
            return null;
        }
        final ArrayList<t> list2 = new ArrayList<t>(list.size());
        final Iterator<MediaEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new t(iterator.next(), b));
        }
        return list2;
    }
    
    public k a(final Context context) {
        k k;
        if (this.a instanceof MediaEntity) {
            k = l.a((MediaEntity)this.a);
        }
        else if (this.a instanceof EditableMedia) {
            k = ((EditableMedia)this.a).b(context);
        }
        else if (this.a instanceof CardInstanceData) {
            k = l.a((CardInstanceData)this.a);
        }
        else {
            k = null;
        }
        final float e = this.c.e();
        if (k != null && e != 0.0f) {
            k.a(new u(this, e, k));
        }
        return k;
    }
    
    public boolean a() {
        return !this.b && this.a instanceof MediaEntity && ((MediaEntity)this.a).type == MediaEntity$Type.d;
    }
    
    public boolean b() {
        return this.a() || (this.a instanceof CardInstanceData && ((CardInstanceData)this.a).k());
    }
    
    public String c() {
        if (this.a()) {
            final MediaEntity mediaEntity = (MediaEntity)this.a;
            if (mediaEntity.videoInfo != null) {
                final int n = (500 + Math.round(1000.0f * mediaEntity.videoInfo.durationSeconds)) / 1000;
                return String.format("%d:%02d", n / 60, n % 60);
            }
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof t && com.twitter.util.l.a(this.a, ((t)o).a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
