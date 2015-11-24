import android.content.res.Resources;
import android.view.View$OnTouchListener;
import com.twitter.android.commerce.util.e;
import com.twitter.android.revenue.card.m;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import com.twitter.android.revenue.card.l;
import android.content.Context;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.util.ao;
import android.view.View;
import android.widget.TextView;
import com.twitter.android.revenue.widget.media.MultiImageContainer;
import com.twitter.android.revenue.card.aj;

// 
// Decompiled by Procyon v0.5.30
// 

public class eu extends aj implements uz
{
    protected int a;
    protected MultiImageContainer b;
    protected TextView c;
    protected TextView d;
    protected View e;
    protected final ao f;
    protected DisplayMode g;
    protected Context h;
    protected TextView i;
    protected View j;
    private vc k;
    
    eu(final l l) {
        super(l, null);
        this.f = new ev(this);
        this.a = 2130968664;
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
        this.c(k);
        this.c();
        this.b();
    }
    
    @Override
    protected void a(final Context h, final DisplayMode g) {
        this.h = h;
        this.m = LayoutInflater.from(h).inflate(2130968912, (ViewGroup)new FrameLayout(h), false);
        final ViewStub viewStub = (ViewStub)this.m.findViewById(2131886986);
        viewStub.setLayoutResource(this.a);
        viewStub.inflate();
        this.j = this.m.findViewById(2131886987);
        this.f.a(this.j);
        this.b = (MultiImageContainer)this.m.findViewById(2131886458);
        this.i = (TextView)this.m.findViewById(2131886459);
        this.c = (TextView)this.m.findViewById(2131886461);
        this.d = (TextView)this.m.findViewById(2131886462);
        this.e = this.m.findViewById(2131886460);
        this.g = g;
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.b != null) {
            this.b.b();
        }
        uy.a().b(this.n, this);
    }
    
    protected void a(final View view, final MotionEvent motionEvent) {
        this.o.a(NativeCardUserAction.a(this.h(), view, motionEvent, 0), this.k, this.p.k());
    }
    
    void a(final vc vc) {
        this.b.a(com.twitter.android.commerce.util.e.a(vc, com.twitter.android.revenue.card.m.c));
        this.b.setOnTouchListener((View$OnTouchListener)this.f);
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
    }
    
    void b() {
        if (this.i != null) {
            this.i.setText(2131296525);
            this.i.setOnTouchListener((View$OnTouchListener)this.f);
        }
    }
    
    void b(final vc vc) {
        if (this.c != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.c.setText((CharSequence)a);
                this.c.setTag((Object)"title");
                this.c.setOnTouchListener((View$OnTouchListener)this.f);
            }
        }
    }
    
    void c() {
        if (this.e != null) {
            this.e.setOnTouchListener((View$OnTouchListener)this.f);
        }
    }
    
    void c(final vc vc) {
        if (this.d != null) {
            final Long a = vn.a("product_count", vc);
            if (a != null) {
                final Resources resources = this.h.getResources();
                String text;
                if (a == 1L) {
                    text = resources.getString(2131296527);
                }
                else {
                    text = resources.getString(2131296526, new Object[] { a });
                }
                this.d.setText((CharSequence)text);
                this.d.setTag((Object)"product_count");
                this.d.setOnTouchListener((View$OnTouchListener)this.f);
            }
        }
    }
}
