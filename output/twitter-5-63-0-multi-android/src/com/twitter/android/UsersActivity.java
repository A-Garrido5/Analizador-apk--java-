// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.FriendshipCache;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.util.v;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class UsersActivity extends TwitterFragmentActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        return new yn(this, bn);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        final String action = intent.getAction();
        final yn yn = (yn)bn;
        if (bundle == null) {
            final Bundle a = TwitterListFragment.a(intent, yn.a);
            if (!intent.hasExtra("follow")) {
                a.putBoolean("follow", "com.twitter.android.intent.action.FOLLOW".equals(action));
            }
            a.putInt("fast_follow", intent.getIntExtra("fast_followers_count", -1));
            if (action != null && intent.hasExtra("follow_request_sender")) {
                a.putString("follow_request_sender", intent.getStringExtra("follow_request_sender"));
            }
            final UsersFragment usersFragment = new UsersFragment();
            usersFragment.i(!kg.a((Context)this));
            usersFragment.setArguments(a);
            switch (yn.b) {
                case 9:
                case 10:
                case 19:
                case 21: {
                    a.putInt("empty_desc", 2131296942);
                    break;
                }
                case 7: {
                    a.putInt("empty_desc", 2131296930);
                    break;
                }
                case 18: {
                    a.putInt("empty_desc", 2131296932);
                    break;
                }
            }
            this.getSupportFragmentManager().beginTransaction().add(2131886241, usersFragment).commit();
        }
        switch (yn.b) {
            default: {
                this.setTitle(this.getString(2131298076));
            }
            case 0: {
                this.setTitle(this.getString(2131297475));
            }
            case 1: {
                this.setTitle(this.getString(2131297474));
                v.a(this, intent.getLongExtra("owner_id", -1L));
            }
            case 6: {
                this.setTitle(intent.getStringExtra("category_name"));
            }
            case 7: {
                this.setTitle(2131296722);
            }
            case 9:
            case 10:
            case 19:
            case 21:
            case 27: {
                this.setTitle(2131298146);
            }
            case 11: {
                this.setTitle(2131296985);
            }
            case 12: {
                this.setTitle(2131297595);
            }
            case 18: {
                this.setTitle(2131297013);
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        final FriendshipCache y = ((UsersFragment)this.getSupportFragmentManager().findFragmentById(2131886241)).y();
        if (!y.a()) {
            this.setResult(-1, new Intent().putExtra("friendship_cache", (Serializable)y));
        }
        super.onBackPressed();
    }
}
