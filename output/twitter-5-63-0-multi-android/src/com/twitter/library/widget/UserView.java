// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeItem;
import android.widget.CheckBox;
import android.view.View$OnClickListener;

public class UserView extends BaseUserView implements View$OnClickListener
{
    public ActionButton l;
    public CheckBox m;
    private c n;
    private c o;
    private TwitterScribeItem p;
    private boolean q;
    
    public UserView(final Context context, final AttributeSet set) {
        super(context, set);
        this.q = true;
    }
    
    public void a(final int n, final c actionButtonClickListener) {
        this.l.a(n);
        this.l.setOnClickListener((View$OnClickListener)this);
        this.l.setUsername(this.h.getText().toString());
        this.setActionButtonClickListener(actionButtonClickListener);
    }
    
    @Override
    public void a(final String username, final String s) {
        super.a(username, s);
        if (this.l != null) {
            this.l.setUsername(username);
        }
    }
    
    public void a(final boolean q) {
        this.q = q;
    }
    
    public TwitterScribeItem getScribeItem() {
        return this.p;
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == la.action_button) {
            if (this.n != null) {
                this.n.a(this, this.f, id);
            }
            if (this.q) {
                this.l.toggle();
            }
        }
        else if (id == la.user_checkbox && this.o != null) {
            this.o.a(this, this.f, id);
        }
    }
    
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.l = (ActionButton)this.findViewById(la.action_button);
        this.m = (CheckBox)this.findViewById(la.user_checkbox);
        if (this.m != null) {
            this.m.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public void setActionButtonClickListener(final c n) {
        this.n = n;
    }
    
    public void setCheckBoxClickListener(final c o) {
        this.o = o;
    }
    
    public void setScribeItem(final TwitterScribeItem p) {
        this.p = p;
    }
}
