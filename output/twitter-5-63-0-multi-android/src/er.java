import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.featureswitch.d;
import com.twitter.android.commerce.util.e;
import android.text.TextUtils;
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

public class er extends aj implements uz
{
    protected Context a;
    protected DisplayMode b;
    protected MediaImageView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected View g;
    private final ao h;
    private vc i;
    private boolean j;
    
    er(final l l) {
        super(l, null);
        this.h = new es(this);
    }
    
    private void a(final View view, final MotionEvent motionEvent) {
        final NativeCardUserAction a = NativeCardUserAction.a(this.h(), view, motionEvent, 0);
        final int id = view.getId();
        String s = null;
        switch (id) {
            case 2131886453: {
                s = "buynow_card_cta_click";
                break;
            }
            case 2131886451: {
                s = "buynow_card_primary_image_click";
                break;
            }
            case 2131886454: {
                s = "buynow_card_item_title_click";
                break;
            }
            case 2131886455: {
                s = "buynow_card_item_title_click";
                break;
            }
            case 2131886450: {
                s = "buynow_card_container_click";
                break;
            }
        }
        this.o.a(a, this.i, this.p.k(), s, CardActionHelper$CommerceCardType.a, this.p.c());
    }
    
    private void a(final vc vc) {
        if (this.d != null) {
            this.d.setTypeface(com.twitter.android.revenue.card.j.a);
            this.d.setText((CharSequence)vc.a("item_title", String.class));
            this.d.setOnTouchListener((View$OnTouchListener)this.h);
        }
    }
    
    private void b() {
        this.m.setOnTouchListener((View$OnTouchListener)this.h);
    }
    
    private void b(final vc vc) {
        if (this.f != null) {
            final String text = (String)vc.a("item_marketing_message", String.class);
            if (!TextUtils.isEmpty((CharSequence)text) && this.d()) {
                this.f.setTypeface(com.twitter.android.revenue.card.j.a);
                this.f.setText((CharSequence)text);
                this.f.setOnTouchListener((View$OnTouchListener)this.h);
                return;
            }
            this.f.setVisibility(8);
        }
    }
    
    private void c(final vc vc) {
        if (this.e != null) {
            this.e.setTypeface(com.twitter.android.revenue.card.j.a);
            final String a = com.twitter.android.commerce.util.e.a(vc.a("variant1_price", String.class));
            final String s = (String)vc.a("merchant_name", String.class);
            final StringBuilder text = new StringBuilder();
            text.append(a).append(" ").append(this.a.getString(2131296483)).append(" ").append(s);
            this.e.setText((CharSequence)text);
            this.e.setOnTouchListener((View$OnTouchListener)this.h);
        }
    }
    
    private boolean c() {
        return "full_bleed_enabled".equals(com.twitter.library.featureswitch.d.d("buy_now_android_fullbleed_card_2982"));
    }
    
    private void d(final vc vc) {
        if (this.c != null) {
            final vj a = vj.a("item_image", vc);
            if (this.j) {
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
                this.c.setOnTouchListener((View$OnTouchListener)this.h);
            }
        }
    }
    
    private boolean d() {
        return com.twitter.library.featureswitch.d.a("buy_now_android_marketing_message_3022", new String[] { "marketing_message_enabled" });
    }
    
    private void e(final vc vc) {
        this.g.setTag((Object)"button");
        this.g.setOnTouchListener((View$OnTouchListener)this.h);
    }
    
    @Override
    public void a(final long n, final vc i) {
        this.i = i;
        this.p.f().a((String)i.a("_card_data", String.class));
        this.a(i);
        this.c(i);
        this.b(i);
        this.d(i);
        this.e(i);
        this.b();
    }
    
    @Override
    protected void a(final Context a, final DisplayMode b) {
        int n = 2130968663;
        this.a = a;
        this.b = b;
        this.j = this.c();
        if (this.j) {
            if (DisplayMode.a == b) {
                n = 2130968662;
            }
        }
        else if (DisplayMode.a == b) {
            n = 2130968661;
        }
        this.m = LayoutInflater.from(a).inflate(n, (ViewGroup)null);
        this.d = (TextView)this.m.findViewById(2131886454);
        this.e = (TextView)this.m.findViewById(2131886455);
        this.c = (MediaImageView)this.m.findViewById(2131886451);
        this.f = (TextView)this.m.findViewById(2131886456);
        this.g = this.m.findViewById(2131886453);
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
