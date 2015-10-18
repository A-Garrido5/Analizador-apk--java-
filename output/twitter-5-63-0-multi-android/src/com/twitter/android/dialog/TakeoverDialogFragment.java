// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import android.content.DialogInterface;
import android.app.Activity;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import com.twitter.library.media.manager.j;
import android.text.TextUtils;
import android.widget.ImageView;
import com.twitter.library.media.widget.MediaImageView;
import android.os.Bundle;
import android.app.Dialog;
import android.widget.ImageView$ScaleType;
import android.view.animation.Animation;
import java.util.Iterator;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.twitter.util.t;
import android.graphics.Rect;
import android.view.View;
import com.twitter.ui.dialog.BaseDialogFragment;
import java.lang.ref.WeakReference;
import com.twitter.ui.dialog.SimpleDialogFragment;

public class TakeoverDialogFragment extends SimpleDialogFragment
{
    WeakReference a;
    private boolean b;
    
    public TakeoverDialogFragment() {
        this.a = new WeakReference(null);
        this.setStyle(0, 2131493010);
    }
    
    public static TakeoverDialogFragment a(final Class clazz) {
        return (TakeoverDialogFragment)BaseDialogFragment.a(clazz, 0, 0);
    }
    
    private static void a(final View view, final int n) {
        final View view2 = (View)view.getParent();
        final Rect rect = new Rect();
        view.getHitRect(rect);
        rect.left -= n;
        rect.top -= n;
        rect.bottom += n;
        rect.right += n;
        view2.post((Runnable)new a(view2, rect, view));
    }
    
    private void i() {
        final Iterator<View> iterator = (Iterator<View>)t.b(this.l(2131886106)).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final View view = iterator.next();
            int n2;
            if (view.getVisibility() == 0) {
                final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this.getActivity(), 2131034145);
                loadAnimation.setInterpolator((Interpolator)new DecelerateInterpolator());
                loadAnimation.setStartOffset((long)(n * 100));
                view.startAnimation(loadAnimation);
                n2 = n + 1;
            }
            else {
                n2 = n;
            }
            n = n2;
        }
    }
    
    private void j() {
        if (!this.b) {
            this.b();
        }
    }
    
    public TakeoverDialogFragment a(final ImageView$ScaleType imageView$ScaleType) {
        this.getArguments().putInt("icon_scale_type", imageView$ScaleType.ordinal());
        return this;
    }
    
    public TakeoverDialogFragment a(final String s) {
        this.getArguments().putString("icon_url", s);
        return this;
    }
    
    protected void a() {
        this.b = false;
    }
    
    @Override
    protected void a(final Dialog dialog, final Bundle bundle) {
        super.a(dialog, bundle);
        final Bundle arguments = this.getArguments();
        final MediaImageView mediaImageView = (MediaImageView)this.l(2131887301);
        final ImageView imageView = (ImageView)this.l(2131886104);
        this.l(2131886106).getBackground().setAlpha(249);
        if (!TextUtils.isEmpty((CharSequence)arguments.getString("icon_url"))) {
            mediaImageView.a(j.a(arguments.getString("icon_url")));
        }
        else {
            mediaImageView.setVisibility(8);
        }
        if (imageView != null && arguments.containsKey("icon_scale_type")) {
            imageView.setScaleType(ImageView$ScaleType.values()[arguments.getInt("icon_scale_type")]);
        }
        int n;
        if (imageView.getVisibility() == 0 || mediaImageView.getVisibility() == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final View l = this.l(2131887300);
        int visibility = 0;
        if (n != 0) {
            visibility = 8;
        }
        l.setVisibility(visibility);
        if (bundle == null) {
            this.i();
            this.a();
        }
        a(this.l(2131886092), (int)(20.0f * this.getResources().getDisplayMetrics().density));
    }
    
    public void a(final Fragment fragment) {
        this.a(fragment.getFragmentManager());
    }
    
    public void a(final FragmentActivity fragmentActivity) {
        this.a(fragmentActivity.getSupportFragmentManager());
    }
    
    @Override
    public void a(final FragmentManager fragmentManager) {
        if (fragmentManager.findFragmentByTag("TakeoverDialogFragment") == null) {
            super.show(fragmentManager, "TakeoverDialogFragment");
        }
    }
    
    protected void a(final String... array) {
        final Context context = (Context)this.a.get();
        if (context != null) {
            ScribeService.a(context, new TwitterScribeLog(this.h().g()).b(array));
        }
    }
    
    protected void b() {
        this.b = true;
    }
    
    protected void c() {
        super.d();
    }
    
    @Override
    protected final void d() {
        this.c();
    }
    
    @Override
    protected final void e() {
        this.f();
    }
    
    protected void f() {
        super.e();
    }
    
    @Override
    protected void g() {
        super.g();
        this.j();
    }
    
    protected Session h() {
        return com.twitter.android.client.c.a((Context)this.getActivity()).a().b();
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.a = new WeakReference((T)activity);
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.j();
    }
    
    public void show(final FragmentManager fragmentManager, final String s) {
        throw new RuntimeException("Use show(FragmentManager) instead of supplying your own tag. This ensures only 1 takeover dialog exists at once.");
    }
}
