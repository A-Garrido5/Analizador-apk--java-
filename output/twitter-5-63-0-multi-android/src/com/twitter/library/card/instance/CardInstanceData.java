// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.instance;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import android.net.Uri;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.api.TwitterUser;
import com.twitter.util.l;
import com.twitter.config.b;
import java.util.HashMap;
import java.io.Externalizable;

public class CardInstanceData implements Externalizable
{
    private static final String[] a;
    private static final long serialVersionUID = -3749650258222240164L;
    public String audienceBucket;
    public String audienceName;
    public String cardTypeURL;
    public String forwardAudienceBucket;
    public String forwardAudienceName;
    public String forwardCardTypeURL;
    public String forwardName;
    public HashMap forwardUsers;
    private HashMap mBindingValues;
    private HashMap mForwardBindingValues;
    private vc mNativeCardData;
    public String name;
    public String url;
    public HashMap users;
    
    static {
        a = new String[] { "photo_image", "player_image", "summary_photo_image", "promo_image", "thumbnail_image", "click_to_call_image", "thumbnail" };
    }
    
    public CardInstanceData() {
        this.users = new HashMap();
        this.forwardUsers = new HashMap();
        this.name = "";
        this.url = "";
        this.cardTypeURL = "";
    }
    
    public int a(final float n) {
        final int a = b.a("cards_forward_height", 160);
        Label_0065: {
            if (this.mForwardBindingValues == null) {
                break Label_0065;
            }
            final BindingValue bindingValue = this.mForwardBindingValues.get("_forward_card_height_");
            if (bindingValue == null || !(bindingValue.value instanceof String)) {
                break Label_0065;
            }
            final int n2 = (int)Float.parseFloat((String)bindingValue.value);
            return (int)(n * n2);
        }
        final int n2 = a;
        return (int)(n * n2);
    }
    
    public Object a(final String s, final Class clazz) {
        final BindingValue b = this.b(s);
        if (b != null) {
            final Object value = b.value;
            if (value != null && clazz.isInstance(value)) {
                return clazz.cast(value);
            }
        }
        return null;
    }
    
    public String a(final String s) {
        return (String)this.a(s, String.class);
    }
    
    public String a(final String s, String s2) {
        final String a = this.a(s);
        if (a != null) {
            s2 = a;
        }
        return s2;
    }
    
    public void a(final HashMap mBindingValues) {
        this.mBindingValues = mBindingValues;
        this.mNativeCardData = vc.a(mBindingValues);
    }
    
    public boolean a() {
        return l.a(this.name, "amplify");
    }
    
    public BindingValue b(final String s) {
        if (this.mBindingValues != null) {
            return this.mBindingValues.get(s);
        }
        return null;
    }
    
    public void b(final HashMap mForwardBindingValues) {
        this.mForwardBindingValues = mForwardBindingValues;
    }
    
    public boolean b() {
        final BindingValue bindingValue = this.mBindingValues.get("_omit_link_");
        return bindingValue != null && bindingValue.value instanceof Boolean && (boolean)bindingValue.value;
    }
    
    public TwitterUser c() {
        if (this.users != null) {
            final UserValue userValue = (UserValue)this.a("site", UserValue.class);
            if (userValue != null) {
                return (TwitterUser)this.users.get(userValue.id);
            }
        }
        return null;
    }
    
    public String d() {
        final TwitterUser c = this.c();
        if (c != null) {
            return c.username;
        }
        return null;
    }
    
    public HashMap e() {
        return this.mBindingValues;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof CardInstanceData)) {
                return false;
            }
            final CardInstanceData cardInstanceData = (CardInstanceData)o;
            Label_0051: {
                if (this.audienceBucket != null) {
                    if (this.audienceBucket.equals(cardInstanceData.audienceBucket)) {
                        break Label_0051;
                    }
                }
                else if (cardInstanceData.audienceBucket == null) {
                    break Label_0051;
                }
                return false;
            }
            Label_0081: {
                if (this.audienceName != null) {
                    if (this.audienceName.equals(cardInstanceData.audienceName)) {
                        break Label_0081;
                    }
                }
                else if (cardInstanceData.audienceName == null) {
                    break Label_0081;
                }
                return false;
            }
            Label_0111: {
                if (this.mBindingValues != null) {
                    if (this.mBindingValues.equals(cardInstanceData.e())) {
                        break Label_0111;
                    }
                }
                else if (cardInstanceData.e() == null) {
                    break Label_0111;
                }
                return false;
            }
            if (!this.cardTypeURL.equals(cardInstanceData.cardTypeURL)) {
                return false;
            }
            Label_0157: {
                if (this.forwardAudienceBucket != null) {
                    if (this.forwardAudienceBucket.equals(cardInstanceData.forwardAudienceBucket)) {
                        break Label_0157;
                    }
                }
                else if (cardInstanceData.forwardAudienceBucket == null) {
                    break Label_0157;
                }
                return false;
            }
            Label_0187: {
                if (this.forwardAudienceName != null) {
                    if (this.forwardAudienceName.equals(cardInstanceData.forwardAudienceName)) {
                        break Label_0187;
                    }
                }
                else if (cardInstanceData.forwardAudienceName == null) {
                    break Label_0187;
                }
                return false;
            }
            Label_0217: {
                if (this.mForwardBindingValues != null) {
                    if (this.mForwardBindingValues.equals(cardInstanceData.f())) {
                        break Label_0217;
                    }
                }
                else if (cardInstanceData.f() == null) {
                    break Label_0217;
                }
                return false;
            }
            Label_0247: {
                if (this.forwardCardTypeURL != null) {
                    if (this.forwardCardTypeURL.equals(cardInstanceData.forwardCardTypeURL)) {
                        break Label_0247;
                    }
                }
                else if (cardInstanceData.forwardCardTypeURL == null) {
                    break Label_0247;
                }
                return false;
            }
            Label_0277: {
                if (this.forwardName != null) {
                    if (this.forwardName.equals(cardInstanceData.forwardName)) {
                        break Label_0277;
                    }
                }
                else if (cardInstanceData.forwardName == null) {
                    break Label_0277;
                }
                return false;
            }
            if (!this.forwardUsers.equals(cardInstanceData.forwardUsers)) {
                return false;
            }
            if (!this.name.equals(cardInstanceData.name)) {
                return false;
            }
            if (!this.url.equals(cardInstanceData.url)) {
                return false;
            }
            if (!this.users.equals(cardInstanceData.users)) {
                return false;
            }
        }
        return true;
    }
    
    public HashMap f() {
        return this.mForwardBindingValues;
    }
    
    public String g() {
        String s = this.a("video_source");
        if (s == null) {
            s = this.a("amplify_url_vmap");
        }
        if (s == null) {
            s = this.a("amplify_url");
        }
        return s;
    }
    
    public String h() {
        String s = this.a("video_content_id");
        if (s == null) {
            s = this.a("amplify_content_id");
        }
        return s;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 * this.name.hashCode() + this.url.hashCode()) + this.cardTypeURL.hashCode());
        int hashCode;
        if (this.mBindingValues != null) {
            hashCode = this.mBindingValues.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (31 * (hashCode + n) + this.users.hashCode());
        int hashCode2;
        if (this.forwardName != null) {
            hashCode2 = this.forwardName.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.forwardCardTypeURL != null) {
            hashCode3 = this.forwardCardTypeURL.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.mForwardBindingValues != null) {
            hashCode4 = this.mForwardBindingValues.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (31 * (hashCode4 + n4) + this.forwardUsers.hashCode());
        int hashCode5;
        if (this.audienceName != null) {
            hashCode5 = this.audienceName.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.audienceBucket != null) {
            hashCode6 = this.audienceBucket.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int hashCode7;
        if (this.forwardAudienceName != null) {
            hashCode7 = this.forwardAudienceName.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n8 = 31 * (hashCode7 + n7);
        final String forwardAudienceBucket = this.forwardAudienceBucket;
        int hashCode8 = 0;
        if (forwardAudienceBucket != null) {
            hashCode8 = this.forwardAudienceBucket.hashCode();
        }
        return n8 + hashCode8;
    }
    
    public boolean i() {
        final BindingValue b = this.b("dynamic_ads");
        return (this.a() || this.p()) && b != null && b.value != null && (boolean)b.value;
    }
    
    public ImageSpec j() {
        final String[] a = CardInstanceData.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final ImageSpec imageSpec = (ImageSpec)this.a(a[i], ImageSpec.class);
            if (imageSpec != null) {
                return imageSpec;
            }
        }
        return null;
    }
    
    public boolean k() {
        return "player".equals(this.name) || this.a() || this.n() || this.l();
    }
    
    public boolean l() {
        final String a = this.a("player_url");
        boolean b = false;
        if (a != null) {
            final String host = Uri.parse(a).getHost();
            if (!host.contains("snappytv.com")) {
                final boolean contains = host.contains("espn.go.com");
                b = false;
                if (!contains) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public boolean m() {
        return "photo".equals(this.name);
    }
    
    public boolean n() {
        return "animated_gif".equals(this.name);
    }
    
    public boolean o() {
        return "audio".equals(this.name);
    }
    
    public boolean p() {
        return "video".equals(this.name);
    }
    
    public boolean q() {
        final TwitterUser c = this.c();
        return c != null && c.userId == 586671909L;
    }
    
    public boolean r() {
        final boolean k = this.k();
        boolean b = false;
        if (k) {
            final TwitterUser c = this.c();
            b = false;
            if (c != null) {
                if (c.userId != 19426551L) {
                    final long n = lcmp(c.userId, 2557521L);
                    b = false;
                    if (n != 0) {
                        return b;
                    }
                }
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.name = (String)objectInput.readObject();
        this.url = (String)objectInput.readObject();
        this.cardTypeURL = (String)objectInput.readObject();
        this.a(f.a(String.class, BindingValue.class, objectInput));
        this.users = f.a(String.class, TwitterUser.class, objectInput);
        this.forwardName = (String)objectInput.readObject();
        this.forwardCardTypeURL = (String)objectInput.readObject();
        this.b(f.a(String.class, BindingValue.class, objectInput));
        this.forwardUsers = f.a(String.class, TwitterUser.class, objectInput);
        this.audienceName = (String)objectInput.readObject();
        this.audienceBucket = (String)objectInput.readObject();
        this.forwardAudienceName = (String)objectInput.readObject();
        this.forwardAudienceBucket = (String)objectInput.readObject();
    }
    
    public boolean s() {
        return "promotion".equals(this.name);
    }
    
    public boolean t() {
        return "click_to_call".equals(this.name);
    }
    
    public vc u() {
        return this.mNativeCardData;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(this.cardTypeURL);
        f.a(this.mBindingValues, objectOutput);
        f.a(this.users, objectOutput);
        objectOutput.writeObject(this.forwardName);
        objectOutput.writeObject(this.forwardCardTypeURL);
        f.a(this.mForwardBindingValues, objectOutput);
        f.a(this.forwardUsers, objectOutput);
        objectOutput.writeObject(this.audienceName);
        objectOutput.writeObject(this.audienceBucket);
        objectOutput.writeObject(this.forwardAudienceName);
        objectOutput.writeObject(this.forwardAudienceBucket);
    }
}
