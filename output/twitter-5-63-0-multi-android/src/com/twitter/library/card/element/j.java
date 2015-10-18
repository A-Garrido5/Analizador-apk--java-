// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import com.twitter.library.card.Card;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.media.manager.ap;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.View;
import android.content.Context;

public class j
{
    protected Context a;
    protected BasePlayer b;
    
    public j(final Context a, final BasePlayer b) {
        this.a = a;
        this.b = b;
    }
    
    public View a() {
        return new ElementView(this.a, this.b);
    }
    
    public void a(final Canvas canvas, final Paint paint, final RectF rectF) {
    }
    
    public void a(final ap ap, final String s, final boolean b) {
    }
    
    public void a(final boolean b) {
    }
    
    public boolean a(final h h, final ao ao) {
        return true;
    }
    
    public void b(final boolean b) {
    }
    
    public boolean b() {
        String streamUrl;
        String htmlUrl;
        if (!TextUtils.isEmpty((CharSequence)this.b.streamUrl) && !TextUtils.isEmpty((CharSequence)this.b.streamContentType) && bq.c(this.b.streamContentType)) {
            streamUrl = this.b.streamUrl;
            htmlUrl = null;
        }
        else {
            htmlUrl = this.b.htmlUrl;
            streamUrl = null;
        }
        final Card y = this.b.y();
        if (y != null) {
            y.a(htmlUrl, streamUrl, this.b.spec.url, false, false);
        }
        return true;
    }
    
    public void c() {
    }
    
    public void d() {
    }
    
    public boolean e() {
        return true;
    }
    
    public void f() {
    }
    
    public void g() {
    }
}
