// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.api.z;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.api.TwitterUser;
import android.preference.Preference;

public class UserCheckBoxPreference extends Preference
{
    private TwitterUser a;
    private boolean b;
    private UserImageView c;
    private TextView d;
    private TextView e;
    private CheckBox f;
    
    public UserCheckBoxPreference(final Context context) {
        super(context);
    }
    
    public TwitterUser a() {
        return this.a;
    }
    
    public void a(final TwitterUser a) {
        this.a = a;
        this.notifyChanged();
    }
    
    public void a(final boolean b) {
        if (b != this.b) {
            this.b = b;
            this.notifyDependencyChange(this.shouldDisableDependents());
            this.notifyChanged();
        }
    }
    
    protected void onBindView(final View view) {
        super.onBindView(view);
        final TwitterUser a = this.a;
        this.c.a(a);
        this.d.setText((CharSequence)a.name);
        this.e.setText((CharSequence)('@' + a.username));
        this.f.setChecked(this.b);
    }
    
    protected void onClick() {
        super.onClick();
        final boolean b = !this.b;
        int n = 0;
        if (b) {
            n = 16;
        }
        if (!this.callChangeListener((Object)n)) {
            return;
        }
        this.a(b);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        super.onCreateView(viewGroup);
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130969175, viewGroup, false);
        this.c = (UserImageView)inflate.findViewById(2131886644);
        this.d = (TextView)inflate.findViewById(2131886307);
        this.e = (TextView)inflate.findViewById(2131886858);
        this.f = (CheckBox)inflate.findViewById(2131887157);
        return inflate;
    }
    
    protected void onSetInitialValue(final boolean b, final Object o) {
        int intValue;
        if (o == null) {
            intValue = 0;
        }
        else {
            intValue = (int)o;
        }
        this.a(z.i(intValue));
    }
}
