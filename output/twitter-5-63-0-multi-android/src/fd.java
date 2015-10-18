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
import android.content.Context;
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

public class fd extends aj implements uz
{
    protected int a;
    protected MultiImageContainer b;
    protected TextView c;
    protected TextView d;
    protected View e;
    protected final ao f;
    protected DisplayMode g;
    protected TextView h;
    protected View i;
    private vc j;
    
    fd(final l l) {
        super(l, null);
        this.f = new fe(this);
        this.a = 2130968669;
    }
    
    public void a() {
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final vc j) {
        this.j = j;
        this.p.f().a((String)j.a("_card_data", String.class));
        this.a(j);
        this.b(j);
        this.c(j);
        this.c();
        this.b();
    }
    
    @Override
    protected void a(final Context context, final DisplayMode g) {
        this.m = LayoutInflater.from(context).inflate(2130968927, (ViewGroup)new FrameLayout(context), false);
        final ViewStub viewStub = (ViewStub)this.m.findViewById(2131886986);
        viewStub.setLayoutResource(this.a);
        viewStub.inflate();
        this.i = this.m.findViewById(2131886987);
        this.f.a(this.i);
        this.b = (MultiImageContainer)this.m.findViewById(2131886458);
        this.h = (TextView)this.m.findViewById(2131886459);
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
        this.o.a(NativeCardUserAction.a(this.h(), view, motionEvent, 0), this.p.c(), this.j, this.p.k());
    }
    
    void a(final vc vc) {
        this.b.a(com.twitter.android.commerce.util.e.a(vc, com.twitter.android.revenue.card.m.a));
        this.b.setOnTouchListener((View$OnTouchListener)this.f);
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
    }
    
    void b() {
        if (this.h != null) {
            this.h.setText(2131297471);
            this.h.setOnTouchListener((View$OnTouchListener)this.f);
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
            final String a = wb.a("description", vc);
            if (a != null) {
                this.d.setText((CharSequence)a);
                this.d.setTag((Object)"description");
                this.d.setOnTouchListener((View$OnTouchListener)this.f);
            }
        }
    }
}
