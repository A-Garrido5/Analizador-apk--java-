import com.twitter.android.commerce.util.e;
import com.twitter.android.revenue.card.m;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View$OnTouchListener;
import com.twitter.android.revenue.card.l;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.util.ao;
import android.view.View;
import android.widget.TextView;
import com.twitter.android.revenue.widget.media.MultiImageContainer;
import com.twitter.android.revenue.card.aj;

// 
// Decompiled by Procyon v0.5.30
// 

public class fa extends aj implements uz
{
    protected int a;
    protected MultiImageContainer b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected View f;
    protected View g;
    protected final ao h;
    protected DisplayMode i;
    protected View j;
    private vc k;
    
    fa(final l l) {
        super(l, null);
        this.h = new fb(this);
        this.a = 2130968668;
    }
    
    private void e(final vc vc) {
        this.f.setTag((Object)"button");
        this.f.setOnTouchListener((View$OnTouchListener)this.h);
    }
    
    public void a() {
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final vc k) {
        this.k = k;
        this.p.f().a((String)k.a("_card_data", String.class));
        this.a(k);
        this.b(k);
        this.d(k);
        this.c(k);
        this.e(k);
        this.b();
    }
    
    @Override
    protected void a(final Context context, final DisplayMode i) {
        this.m = LayoutInflater.from(context).inflate(2130968925, (ViewGroup)new FrameLayout(context), false);
        final ViewStub viewStub = (ViewStub)this.m.findViewById(2131886986);
        viewStub.setLayoutResource(this.a);
        viewStub.inflate();
        this.j = this.m.findViewById(2131886987);
        this.h.a(this.j);
        this.b = (MultiImageContainer)this.m.findViewById(2131886458);
        this.c = (TextView)this.m.findViewById(2131886461);
        this.e = (TextView)this.m.findViewById(2131886469);
        this.d = (TextView)this.m.findViewById(2131886470);
        this.f = this.m.findViewById(2131886468);
        this.g = this.m.findViewById(2131886460);
        this.i = i;
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.b != null) {
            this.b.b();
        }
        uy.a().b(this.n, this);
    }
    
    protected void a(final View view, final MotionEvent motionEvent) {
        this.o.a(NativeCardUserAction.a(this.h(), view, motionEvent, 0), this.k);
    }
    
    void a(final vc vc) {
        this.b.a(com.twitter.android.commerce.util.e.a(vc, com.twitter.android.revenue.card.m.a));
        this.b.setTag((Object)com.twitter.android.revenue.card.m.a);
        this.b.setOnTouchListener((View$OnTouchListener)this.h);
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
    }
    
    void b() {
        if (this.g != null) {
            this.g.setOnTouchListener((View$OnTouchListener)this.h);
        }
    }
    
    void b(final vc vc) {
        if (this.c != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.c.setText((CharSequence)a);
                this.c.setTag((Object)"title");
                this.c.setOnTouchListener((View$OnTouchListener)this.h);
            }
        }
    }
    
    void c(final vc vc) {
        if (this.d != null) {
            final String a = com.twitter.android.commerce.util.e.a(vc.a("price", String.class));
            if (a != null) {
                this.d.setText((CharSequence)a);
                this.d.setTag((Object)"price");
                this.d.setOnTouchListener((View$OnTouchListener)this.h);
            }
        }
    }
    
    void d(final vc vc) {
        if (this.e != null) {
            final String a = wb.a("product_domain", vc);
            if (a == null) {
                this.e.setVisibility(8);
                return;
            }
            this.e.setVisibility(0);
            this.e.setText((CharSequence)a);
            this.e.setTag((Object)"product_domain");
            this.e.setOnTouchListener((View$OnTouchListener)this.h);
        }
    }
}
