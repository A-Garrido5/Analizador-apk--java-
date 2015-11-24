// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.io.Serializable;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.api.Prompt;
import android.support.v4.widget.CursorAdapter;
import com.twitter.android.oy;
import android.content.Context;
import java.util.HashMap;

public class b implements ay
{
    private HashMap a;
    private HashMap b;
    private Context c;
    private oy d;
    private CursorAdapter e;
    
    public b(final Context c, final oy d, final CursorAdapter e) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public Prompt a(final long n) {
        return this.a.get(n);
    }
    
    public void a() {
        this.a.clear();
        this.b.clear();
    }
    
    public void a(final long n, final int n2) {
        switch (n2) {
            case 2: {
                com.twitter.android.client.c.a(this.c).c(this.a.get(n).b);
                break;
            }
            case 1: {
                com.twitter.android.client.c.a(this.c).b(this.a.get(n).b);
                break;
            }
        }
        this.b(n);
    }
    
    public void a(final Bundle bundle) {
        final HashMap a = (HashMap)bundle.getSerializable("state_action_prompts");
        if (a != null) {
            this.a = a;
        }
        final HashMap b = (HashMap)bundle.getSerializable("state_action_prompt_ids");
        if (b != null) {
            this.b = b;
        }
    }
    
    @Override
    public void a(final Prompt prompt) {
        if (prompt.n <= 0L) {
            if (this.d != null) {
                new com.twitter.android.util.c(this.c, this, this.d).execute((Object[])new Prompt[] { prompt });
            }
            return;
        }
        this.b(prompt);
    }
    
    public Bundle b() {
        final Bundle bundle = new Bundle();
        if (this.a != null) {
            bundle.putSerializable("state_action_prompts", (Serializable)this.a);
        }
        if (this.b != null) {
            bundle.putSerializable("state_action_prompt_ids", (Serializable)this.b);
        }
        return bundle;
    }
    
    public void b(final long n) {
        final Prompt prompt = this.a.remove(n);
        if (prompt != null) {
            this.b.remove(prompt.b);
        }
    }
    
    public void b(final Prompt prompt) {
        if (prompt.n > 0L) {
            final Prompt prompt2 = this.a.get(prompt.n);
            if (prompt2 == null) {
                final Prompt prompt3 = this.b.remove(prompt.b);
                if (prompt3 != null) {
                    this.a.remove(prompt3.n);
                }
                prompt.a(false);
                this.a.put(prompt.n, prompt);
                this.b.put(prompt.b, prompt);
                this.e.notifyDataSetChanged();
            }
            else if (prompt2.b == prompt.b) {
                prompt.a(false);
            }
        }
    }
}
