// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.app.ProgressDialog;
import android.app.Dialog;
import java.util.Collection;
import com.twitter.library.commerce.model.Address;
import java.io.Serializable;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.commerce.util.i;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.os.Parcelable;
import android.net.Uri;
import java.util.UUID;
import com.twitter.android.commerce.network.ProfileSaveCallback;
import com.twitter.android.commerce.network.ProfileSaveCallback$RequestType;
import com.twitter.library.util.InvalidDataException;
import android.text.TextUtils;
import com.twitter.library.api.PromotedEvent;
import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.j;
import com.twitter.library.commerce.model.ServerErrorType;
import com.twitter.library.commerce.model.ServerError;
import java.util.ArrayList;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.android.commerce.util.ImageHelper;
import com.twitter.android.commerce.util.a;
import com.twitter.library.commerce.model.CreditCard;
import com.twitter.android.commerce.util.e;
import com.twitter.library.commerce.model.OfferDetails;
import android.os.Bundle;
import android.widget.Toast;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.NotificationManager;
import com.twitter.library.provider.ae;
import com.twitter.library.client.az;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.TweetActivity;
import android.os.Handler;
import com.twitter.library.provider.Tweet;
import java.util.HashMap;
import com.twitter.android.commerce.widget.creditcard.CardEntryContainer;
import com.twitter.android.commerce.util.f;
import android.widget.ImageView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.twitter.ui.widget.TwitterButton;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.commerce.model.OfferDetails$OfferStatus;
import java.util.List;
import com.twitter.library.commerce.model.ClientCreditCard;
import com.twitter.library.commerce.model.Profile;
import com.twitter.android.commerce.network.h;
import com.twitter.android.commerce.network.g;
import com.twitter.android.commerce.network.b;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.commerce.model.Email;

class o implements l
{
    final /* synthetic */ OfferSummaryActivity a;
    
    o(final OfferSummaryActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.removeDialog(2);
        this.a.h.setEnabled(true);
    }
    
    @Override
    public void a(final Email email) {
        this.a.a(email);
    }
}
