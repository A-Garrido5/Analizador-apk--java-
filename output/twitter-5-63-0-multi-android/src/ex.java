import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.featureswitch.d;
import android.view.View$OnTouchListener;
import com.twitter.android.revenue.card.j;
import com.twitter.android.card.CardActionHelper$CommerceCardType;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import com.twitter.android.revenue.card.l;
import com.twitter.library.util.ao;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.content.Context;
import com.twitter.android.revenue.card.aj;

// 
// Decompiled by Procyon v0.5.30
// 

public class ex extends aj implements uz
{
    protected Context a;
    protected DisplayMode b;
    protected MediaImageView c;
    protected TextView d;
    protected TextView e;
    protected View f;
    private final ao g;
    private vc h;
    private boolean i;
    
    ex(final l l) {
        super(l, null);
        this.g = new ey(this);
    }
    
    private void a(final View view, final MotionEvent motionEvent) {
        final NativeCardUserAction a = NativeCardUserAction.a(this.h(), view, motionEvent, 0);
        String s = null;
        switch (view.getId()) {
            default: {
                s = null;
                break;
            }
            case 2131886465: {
                s = "cloffer_card_cta_click";
                break;
            }
            case 2131886464: {
                s = "cloffer_card_primary_image_click";
                break;
            }
            case 2131886466: {
                s = "cloffer_card_item_title_click";
                break;
            }
            case 2131886467: {
                s = "cloffer_card_item_title_click";
                break;
            }
            case 2131886463: {
                s = "cloffer_card_container_click";
                break;
            }
        }
        this.o.a(a, this.h, this.p.k(), s, CardActionHelper$CommerceCardType.b, this.p.c());
    }
    
    private void a(final vc vc) {
        if (this.d != null) {
            this.d.setTypeface(j.a);
            this.d.setText((CharSequence)vc.a("offer_title", String.class));
            this.d.setOnTouchListener((View$OnTouchListener)this.g);
        }
    }
    
    private void b(final vc vc) {
        if (this.e != null) {
            this.e.setTypeface(j.a);
            final String s = (String)vc.a("offer_redeem_type", String.class);
            final String s2 = (String)vc.a("offer_merchant_name", String.class);
            final StringBuilder text = new StringBuilder();
            text.append(s).append(" ").append(this.a.getString(2131296483)).append(" ").append(s2);
            this.e.setText((CharSequence)text);
            this.e.setOnTouchListener((View$OnTouchListener)this.g);
        }
    }
    
    private boolean b() {
        return "full_bleed_enabled".equals(com.twitter.library.featureswitch.d.d("offers_android_fullbleed_card_2954"));
    }
    
    private void c(final vc vc) {
        if (this.c != null) {
            final vj a = vj.a("offer_image", vc);
            if (this.i) {
                this.c.setAspectRatio(Math.max(2.0f, a.a(2.5f)));
            }
            else if (this.b == DisplayMode.a) {
                this.c.setAspectRatio(3.3f);
            }
            else {
                this.c.setAspectRatio(2.5f);
            }
            if (a != null) {
                this.c.a(com.twitter.library.media.manager.j.a(a.a));
                this.c.setOnTouchListener((View$OnTouchListener)this.g);
            }
        }
    }
    
    private void d(final vc vc) {
        this.f.setTag((Object)"button");
        this.f.setOnTouchListener((View$OnTouchListener)this.g);
    }
    
    private void e(final vc vc) {
        this.m.setOnTouchListener((View$OnTouchListener)this.g);
        if (this.i) {
            this.m.setBackgroundResource(0);
            final Boolean a = up.a("offer_show_border", vc);
            if (a != null && a) {
                this.m.setBackgroundResource(2130837566);
            }
        }
    }
    
    @Override
    public void a(final long n, final vc h) {
        this.h = h;
        this.p.f().a((String)h.a("_card_data", String.class));
        this.a(h);
        this.b(h);
        this.c(h);
        this.d(h);
        this.e(h);
    }
    
    @Override
    protected void a(final Context a, final DisplayMode b) {
        int n = 2130968667;
        this.a = a;
        this.b = b;
        this.i = this.b();
        if (this.i) {
            if (DisplayMode.a == b) {
                n = 2130968666;
            }
        }
        else if (DisplayMode.a == b) {
            n = 2130968665;
        }
        this.m = LayoutInflater.from(a).inflate(n, (ViewGroup)null);
        this.d = (TextView)this.m.findViewById(2131886466);
        this.e = (TextView)this.m.findViewById(2131886467);
        this.c = (MediaImageView)this.m.findViewById(2131886464);
        this.f = this.m.findViewById(2131886465);
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        uy.a().b(this.n, this);
        if (this.c != null) {
            this.c.b();
        }
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
    }
}
