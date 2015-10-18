// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import java.util.Collection;
import java.util.HashSet;
import android.widget.AdapterView;
import android.app.ProgressDialog;
import android.app.Dialog;
import java.util.UUID;
import com.twitter.android.commerce.util.i;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.NotificationManager;
import com.twitter.android.commerce.network.c;
import android.net.Uri;
import com.twitter.library.commerce.model.b;
import com.twitter.library.util.InvalidDataException;
import android.view.ViewGroup;
import android.os.Handler;
import com.twitter.library.card.Card;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import com.twitter.library.commerce.model.ProductVariant;
import com.twitter.android.commerce.widget.form.DescriptionHeader;
import android.text.TextUtils;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.j;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.commerce.util.ImageHelper;
import com.twitter.android.commerce.util.a;
import android.app.Activity;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.service.y;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import android.widget.SpinnerAdapter;
import com.twitter.library.commerce.model.CardVariantList$CardVariantListException;
import com.twitter.library.api.PromotedEvent;
import com.twitter.android.commerce.util.e;
import java.util.Iterator;
import java.util.ArrayList;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.commerce.model.ServerErrorType;
import com.twitter.library.commerce.model.ServerError;
import android.os.Bundle;
import java.math.BigDecimal;
import com.twitter.library.commerce.model.TaxType;
import com.twitter.library.commerce.model.ShippingType;
import android.content.res.Resources;
import com.twitter.library.commerce.model.CardVariant;
import com.twitter.library.commerce.model.CreditCard;
import com.twitter.library.commerce.model.Profile;
import com.twitter.android.commerce.util.f;
import android.widget.ImageView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import com.twitter.ui.widget.TwitterButton;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import java.util.List;
import com.twitter.library.provider.Tweet;
import java.util.HashMap;
import com.twitter.library.commerce.model.CardVariantList;
import com.twitter.android.commerce.network.g;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

class ad implements Runnable
{
    final /* synthetic */ ProductSummaryActivity a;
    
    ad(final ProductSummaryActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.z != null) {
            this.a.a(true);
            this.a.f.setText((CharSequence)this.a.getString(2131296690, new Object[] { b("$", this.a.p()) }));
        }
    }
}
