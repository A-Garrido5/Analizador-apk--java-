// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.graphics.drawable.Drawable;
import com.twitter.android.client.t;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.api.TwitterUser;
import android.app.AlertDialog$Builder;
import com.twitter.library.api.z;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.view.View;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.client.az;
import com.twitter.library.card.j;
import com.twitter.library.card.Card;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.content.DialogInterface$OnClickListener;
import com.twitter.library.card.element.FollowButtonElement$Kind;
import com.twitter.library.card.element.FollowButtonElement;
import android.content.Context;
import com.twitter.android.client.s;
import android.view.View$OnClickListener;
import com.twitter.library.card.element.e;

public class b extends e implements View$OnClickListener, s
{
    protected AppFollowButtonDelegateView a;
    
    public b(final Context context, final FollowButtonElement followButtonElement) {
        super(context, followButtonElement);
    }
    
    private void i() {
        if (this.c.kind == FollowButtonElement$Kind.b) {
            this.a(2131298057, 2131298059, (DialogInterface$OnClickListener)new c(this));
            return;
        }
        this.l();
    }
    
    private void j() {
        final long h = this.h();
        final Card y = this.c.y();
        as.a(this.b).a(new pb(this.b, com.twitter.android.client.c.a(this.b).a().b(), h, y.aD_().j));
        final j ac_ = y.aC_();
        if (ac_ != null) {
            ac_.a(h);
        }
    }
    
    private void k() {
        final long h = this.h();
        final Card y = this.c.y();
        as.a(this.b).a(new od(this.b, az.a(this.b).b(), h, y.aD_().j, 3));
        final j ac_ = y.aC_();
        if (ac_ != null) {
            ac_.d(h);
        }
    }
    
    private void l() {
        final long h = this.h();
        final Card y = this.c.y();
        as.a(this.b).a(new pe(this.b, az.a(this.b).b(), h, y.aD_().j));
        final j ac_ = y.aC_();
        if (ac_ != null) {
            ac_.b(h);
        }
    }
    
    @Override
    public float a(final int n, final Vector2F vector2F) {
        final View z = this.c.z();
        final int n2 = (int)vector2F.x;
        final int n3 = (int)vector2F.y;
        int n4;
        if (n2 != 0) {
            n4 = (n2 | Integer.MIN_VALUE);
        }
        else {
            n4 = 0;
        }
        int n5 = 0;
        if (n3 != 0) {
            n5 = (Integer.MIN_VALUE | n3);
        }
        z.measure(n4, n5);
        if (n == 0) {
            return z.getMeasuredWidth();
        }
        return z.getMeasuredHeight();
    }
    
    @Override
    public View a() {
        final Resources resources = this.b.getResources();
        (this.a = new AppFollowButtonDelegateView(this.b, this.c)).setTextColor(new ColorStateList(new int[][] { { -16842912 }, { 16842919 }, { 16842912 } }, new int[] { resources.getColor(2131689634), resources.getColor(2131689634), resources.getColor(2131689637) }));
        this.a.setOnClickListener((View$OnClickListener)this);
        this.a.setBackgroundDrawable(resources.getDrawable(2130837601));
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558484);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558485);
        this.a.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        this.a.setIncludeFontPadding(false);
        this.b();
        this.c();
        return (View)this.a;
    }
    
    protected void a(final int n) {
        boolean b = false;
        if (!az.a(this.b).b().d()) {
            this.b();
            return;
        }
        if (z.a(n)) {
            this.a.setEnabled(false);
            return;
        }
        int n2;
        int n3;
        if (z.e(n)) {
            n2 = 2131298023;
            n3 = 2130838752;
        }
        else if (z.b(n)) {
            n2 = 2131298026;
            n3 = 2130838947;
            b = true;
        }
        else {
            n2 = 2131297007;
            n3 = 2130838948;
            b = false;
        }
        this.a(true, b, n2, n3);
    }
    
    protected void a(final int title, final int n, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b);
        alertDialog$Builder.setTitle(title);
        final Resources resources = this.b.getResources();
        final TwitterUser g = this.g();
        if (g != null) {
            alertDialog$Builder.setMessage((CharSequence)resources.getString(n, new Object[] { g.c() }));
        }
        alertDialog$Builder.setPositiveButton(2131298158, dialogInterface$OnClickListener);
        alertDialog$Builder.setNegativeButton(2131297303, dialogInterface$OnClickListener);
        alertDialog$Builder.create().show();
    }
    
    public void a(final long n, final int n2) {
        this.a(n2);
        this.c.K();
    }
    
    @Override
    public void a(final h h, final ao ao) {
        super.a(h, ao);
        t.a().a(this.h(), this);
    }
    
    protected void a(final boolean enabled, final boolean checked, final int text, final int n) {
        if (this.a == null) {
            return;
        }
        final Drawable drawable = this.b.getResources().getDrawable(n);
        this.a.setEnabled(enabled);
        this.a.setChecked(checked);
        this.a.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
        if (this.c.kind == FollowButtonElement$Kind.b) {
            this.a.setText(text);
            return;
        }
        this.a.setText((CharSequence)null);
    }
    
    protected void b() {
        this.a(false, false, 2131297007, 2130838948);
    }
    
    protected void c() {
        this.a(t.a().b(this.h()));
    }
    
    @Override
    public void d() {
        this.c();
    }
    
    protected void e() {
        if (this.c.kind == FollowButtonElement$Kind.b) {
            this.a(2131298089, 2131298091, (DialogInterface$OnClickListener)new d(this));
            return;
        }
        this.k();
    }
    
    @Override
    public void f() {
        super.f();
        t.a().b(this.h(), this);
    }
    
    public void onClick(final View view) {
        if (az.a(this.b).b().d()) {
            final int b = t.a().b(this.h());
            if (z.b(b)) {
                this.i();
            }
            else {
                if (z.e(b)) {
                    this.e();
                    return;
                }
                this.j();
            }
        }
    }
}
