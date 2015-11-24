import com.twitter.util.g;
import com.twitter.android.av.t;
import com.twitter.library.media.widget.v;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.widget.AspectRatioFrameLayout;
import com.twitter.library.experiments.b;
import android.os.Bundle;
import android.content.res.Configuration;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import android.app.Activity;
import android.view.View;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.tweet.content.d;

// 
// Decompiled by Procyon v0.5.30
// 

public class hw implements d
{
    private Tweet a;
    private View b;
    private final Activity c;
    private AdaptiveTweetMediaView d;
    private boolean e;
    
    public hw(final Activity c) {
        this.c = c;
    }
    
    private View a(final Activity activity, final int n) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)activity).inflate(n, (ViewGroup)null, false);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
        layoutParams.addRule(3, 2131886826);
        viewGroup.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        viewGroup.setId(2131886156);
        ((TextView)viewGroup.findViewById(2131886364)).setVisibility(8);
        viewGroup.findViewById(2131886366).setVisibility(8);
        ((TextView)viewGroup.findViewById(2131886291)).setVisibility(8);
        ((TextView)viewGroup.findViewById(2131886365)).setVisibility(8);
        return (View)viewGroup;
    }
    
    @Override
    public void a() {
        if (this.d != null) {
            this.d.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final Configuration configuration) {
    }
    
    @Override
    public void a(final Bundle bundle) {
        if (this.d != null) {
            this.d.setFromMemoryOnly(true);
        }
    }
    
    public void a(final hz hz, final Bundle bundle) {
        this.e = com.twitter.library.experiments.b.a();
        this.a = hz.a;
        if (this.c != null) {
            if (this.b == null) {
                this.b = this.a(this.c, 2130968971);
            }
            final View b = this.b;
            final AdaptiveTweetMediaView adaptiveTweetMediaView = (AdaptiveTweetMediaView)b.findViewById(2131887130);
            this.d = adaptiveTweetMediaView;
            final boolean b2 = com.twitter.library.experiments.b.b(this.a);
            final AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout)b.findViewById(2131887129);
            b.setTag((Object)adaptiveTweetMediaView);
            adaptiveTweetMediaView.a(new hx(this, hz), PlaybackMode.a);
            adaptiveTweetMediaView.setOnMediaClickListener(hz.c);
            if (this.a.S() != null) {
                adaptiveTweetMediaView.setCard(this.a.W());
            }
            else {
                adaptiveTweetMediaView.setMediaEntities(this.a.G.media);
            }
            if (!adaptiveTweetMediaView.c()) {
                aspectRatioFrameLayout.setVisibility(8);
                return;
            }
            adaptiveTweetMediaView.a(this.e || t.a(this.a));
            adaptiveTweetMediaView.setSingleImageMinAspectRatio(com.twitter.library.experiments.b.e());
            if (!this.e || !b2) {
                float e;
                if (adaptiveTweetMediaView.getMediaCount() == 1) {
                    e = adaptiveTweetMediaView.getMediaItems().get(0).c.e();
                }
                else {
                    e = 1.7777778f;
                }
                aspectRatioFrameLayout.setAspectRatio(g.a(e, 0.2f, 5.0f));
            }
        }
    }
    
    @Override
    public void a(final boolean b) {
        if (this.d != null) {
            this.d.f();
            this.d.d(b);
        }
    }
    
    @Override
    public void ar_() {
    }
    
    @Override
    public void b() {
        if (this.d != null) {
            this.d.g();
        }
    }
    
    @Override
    public void b(final boolean b) {
        if (this.d != null) {
            this.d.e(b);
        }
    }
    
    @Override
    public View d() {
        return this.b;
    }
}
