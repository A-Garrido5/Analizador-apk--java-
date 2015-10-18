import android.view.View$OnTouchListener;
import com.twitter.library.media.manager.j;
import android.app.Activity;
import com.twitter.android.commerce.view.AuthenticatedWebViewActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.twitter.android.revenue.card.l;
import android.view.View;
import android.widget.TextView;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.library.util.ao;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.revenue.card.aj;

// 
// Decompiled by Procyon v0.5.30
// 

public class en extends aj implements uz
{
    protected final int a;
    protected MediaImageView b;
    protected DisplayMode c;
    private final ao d;
    private vc e;
    private TwitterButton f;
    private TextView g;
    private TextView h;
    private View i;
    private String j;
    
    protected en(final l l) {
        super(l, null);
        this.d = new eo(this);
        this.a = 2130968908;
    }
    
    public void a() {
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final vc e) {
        this.e = e;
        this.j = wb.a(this.c(), this.e);
        this.p.f().a((String)e.a("_card_data", String.class));
        this.a(this.e);
        this.b(this.e);
        this.c(this.e);
        this.d(this.e);
        this.d();
    }
    
    @Override
    protected void a(final Context context, final DisplayMode c) {
        this.m = LayoutInflater.from(context).inflate(this.a, (ViewGroup)null);
        this.b = (MediaImageView)this.m.findViewById(2131886977);
        if (this.b != null) {
            this.b.setAspectRatio(2.5f);
        }
        this.f = (TwitterButton)this.m.findViewById(2131886978);
        this.g = (TextView)this.m.findViewById(2131886461);
        this.h = (TextView)this.m.findViewById(2131886462);
        this.i = this.m.findViewById(2131886460);
        this.c = c;
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.b != null) {
            this.b.b();
        }
        uy.a().b(this.n, this);
    }
    
    protected void a(final View view, final MotionEvent motionEvent) {
        final String a = wb.a("webview_url", this.e);
        final Activity k = this.p.k();
        if (!TextUtils.isEmpty((CharSequence)a) && k != null) {
            k.startActivity(AuthenticatedWebViewActivity.a((Context)k, a));
        }
    }
    
    void a(final vc vc) {
        if (this.b != null) {
            final vj a = vj.a(this.b(), vc);
            if (a != null) {
                this.b.setAspectRatio(2.5f);
                this.b.a(com.twitter.library.media.manager.j.a(a.a));
                this.b.setFromMemoryOnly(true);
                this.b.setTag((Object)"image");
                this.b.setOnTouchListener((View$OnTouchListener)this.d);
            }
        }
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
    }
    
    protected String b() {
        return "image";
    }
    
    void b(final vc vc) {
        if (this.g != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.g.setText((CharSequence)a);
                this.g.setTag((Object)"title");
                this.g.setOnTouchListener((View$OnTouchListener)this.d);
            }
        }
    }
    
    protected String c() {
        return "webview_url";
    }
    
    void c(final vc vc) {
        if (this.h != null) {
            final String a = wb.a("description", vc);
            if (a != null) {
                this.h.setText((CharSequence)a);
                this.h.setTag((Object)"description");
                this.h.setOnTouchListener((View$OnTouchListener)this.d);
            }
        }
    }
    
    void d() {
        if (this.i != null) {
            this.i.setOnTouchListener((View$OnTouchListener)this.d);
        }
    }
    
    void d(final vc vc) {
        final String a = wb.a("cta", vc);
        if (this.f != null && !TextUtils.isEmpty((CharSequence)a)) {
            this.f.setText((CharSequence)a);
            this.f.setTag((Object)"button");
            this.f.setOnTouchListener((View$OnTouchListener)new ep(this, this.f));
        }
    }
}
