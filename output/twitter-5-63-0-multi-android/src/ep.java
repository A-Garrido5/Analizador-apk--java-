import android.view.MotionEvent;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.library.util.ap;

// 
// Decompiled by Procyon v0.5.30
// 

class ep extends ap
{
    final /* synthetic */ en a;
    
    ep(final en a, final TwitterButton twitterButton) {
        this.a = a;
        super(twitterButton);
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        this.a.a(view, motionEvent);
    }
}
