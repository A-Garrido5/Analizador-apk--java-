// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.MergeCursor;
import android.database.Cursor;
import android.content.ContentValues;
import android.database.sqlite.SQLiteQueryBuilder;
import android.text.TextUtils;
import android.net.Uri;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.twitter.library.client.App;
import android.content.UriMatcher;
import android.content.ContentProvider;

public class TwitterProvider extends ContentProvider
{
    private static final boolean a;
    private static final UriMatcher b;
    
    static {
        a = (App.l() && Log.isLoggable("TwitterProvider", 3));
        (b = new UriMatcher(-1)).addURI(ae.c, "users", 1);
        TwitterProvider.b.addURI(ae.c, "users/id/#", 2);
        TwitterProvider.b.addURI(ae.c, "user_groups", 60);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/#", 70);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/following/#", 72);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/followers/#", 73);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/verified_followers/#", 99);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/blocked/#", 74);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/members/#", 75);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/subscribers/#", 76);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/people/#", 77);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/search", 78);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/category_users/#", 79);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/contacts/#", 80);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/activity_sources/#", 81);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/favorited/#", 82);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/retweeted/#", 83);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/media_tagged/#", 96);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/activity_targets/#", 84);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/dm_contacts/#", 85);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/device_following/#", 86);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/event", 87);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/incoming_friendships/#", 88);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/welcome_wtf/#", 89);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/find_people/#", 98);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/similar_to/#", 90);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/streamified_wtf/#", 92);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/follow_recommendations/#", 91);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/mutual_follows/#", 94);
        TwitterProvider.b.addURI(ae.c, "user_groups_view/geo_wtf/#", 101);
        TwitterProvider.b.addURI(ae.c, "statuses", 20);
        TwitterProvider.b.addURI(ae.c, "statuses/id/#", 21);
        TwitterProvider.b.addURI(ae.c, "drafts", 40);
        TwitterProvider.b.addURI(ae.c, "drafts/id/#", 41);
        TwitterProvider.b.addURI(ae.c, "status_groups", 110);
        TwitterProvider.b.addURI(ae.c, "status_groups/#", 111);
        TwitterProvider.b.addURI(ae.c, "status_groups_view", 120);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/#", 121);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/ref_id/#", 122);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/id/#", 142);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/timeline/#", 123);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/favorites/#", 124);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/home/#", 125);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/replies/#", 126);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/mentions/#", 128);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/list/#", 132);
        TwitterProvider.b.addURI(ae.c, "category_status_groups_view/category/#", 133);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/conversation/#", 136);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/conversation_older/#", 136);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/conversation_newer/#", 136);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/activity_targets/#", 138);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/activity_target_objects/#", 139);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/activity/#", 137);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/custom_timeline_users", 97);
        TwitterProvider.b.addURI(ae.c, "status_groups_retweets_view/rt_timeline/#", 135);
        TwitterProvider.b.addURI(ae.c, "status_groups_retweets_view/rt_timeline_unlimited/#", 146);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/media/#", 140);
        TwitterProvider.b.addURI(ae.c, "status_groups_retweets_view/rt_media/#", 141);
        TwitterProvider.b.addURI(ae.c, "status_groups_retweets_view/activity/#", 143);
        TwitterProvider.b.addURI(ae.c, "status_groups_retweets_view/#", 144);
        TwitterProvider.b.addURI(ae.c, "status_groups_retweets_view/ref_id/#", 145);
        TwitterProvider.b.addURI(ae.c, "status_groups_view/moments/#", 147);
        TwitterProvider.b.addURI(ae.c, "conversation/*", 202);
        TwitterProvider.b.addURI(ae.c, "dm_inbox", 203);
        TwitterProvider.b.addURI(ae.c, "dm_inbox/*", 204);
        TwitterProvider.b.addURI(ae.c, "conversation_participants", 206);
        TwitterProvider.b.addURI(ae.c, "conversation_participants/*", 207);
        TwitterProvider.b.addURI(ae.c, "dm_unread_count", 208);
        TwitterProvider.b.addURI(ae.c, "lists_view", 300);
        TwitterProvider.b.addURI(ae.c, "lists_view/#", 301);
        TwitterProvider.b.addURI(ae.c, "lists_view/id/#", 302);
        TwitterProvider.b.addURI(ae.c, "timeline_view", 400);
        TwitterProvider.b.addURI(ae.c, "timeline_view/home/#", 401);
        TwitterProvider.b.addURI(ae.c, "timeline_view/user/#", 402);
        TwitterProvider.b.addURI(ae.c, "timeline_view/trends/#", 403);
        TwitterProvider.b.addURI(ae.c, "timeline_view/trendsplus/#", 408);
        TwitterProvider.b.addURI(ae.c, "timeline_view/custom/#", 406);
        TwitterProvider.b.addURI(ae.c, "timeline_view/place/#", 404);
        TwitterProvider.b.addURI(ae.c, "topics_view", 450);
        TwitterProvider.b.addURI(ae.c, "topics_view/id/#", 451);
        TwitterProvider.b.addURI(ae.c, "search_queries", 520);
        TwitterProvider.b.addURI(ae.c, "search_queries/#", 521);
        TwitterProvider.b.addURI(ae.c, "search_results_view", 522);
        TwitterProvider.b.addURI(ae.c, "activities", 700);
        TwitterProvider.b.addURI(ae.c, "discover_view", 800);
        TwitterProvider.b.addURI(ae.c, "discover", 801);
        TwitterProvider.b.addURI(ae.c, "discover_view/wtf/#", 802);
        TwitterProvider.b.addURI(ae.c, "stories_view", 850);
        TwitterProvider.b.addURI(ae.c, "stories/tweets/*", 851);
        TwitterProvider.b.addURI(ae.c, "categories_view", 900);
        TwitterProvider.b.addURI(ae.c, "notifications", 1000);
        TwitterProvider.b.addURI(ae.c, "order_history", 1400);
        TwitterProvider.b.addURI(ae.c, "news", 1500);
        TwitterProvider.b.addURI(ae.c, "news/tweets/#", 1501);
    }
    
    private ab a(final SQLiteDatabase sqLiteDatabase, final Uri uri, final String s, final String s2, final String[] array, final String s3, final String s4) {
        final StringBuilder sb = new StringBuilder();
        if (s != null) {
            sb.append("(").append(s).append(")").append(" AND ");
        }
        sb.append("owner_id").append('=').append(uri.getLastPathSegment());
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            sb.append(" AND ").append(s2);
        }
        final String queryParameter = uri.getQueryParameter("newer");
        if (queryParameter != null) {
            sb.append(" AND ").append("t_updated_at").append('>').append(queryParameter);
        }
        String s5;
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            s5 = s3;
        }
        else {
            s5 = "preview_draft_id DESC, t_updated_at DESC, _id ASC";
        }
        String value;
        if (s4 == null) {
            value = String.valueOf(400);
        }
        else {
            value = s4;
        }
        if (TwitterProvider.a) {
            final SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
            sqLiteQueryBuilder.setTables("timeline_view");
            Log.d("TwitterProvider", "QUERY: " + sqLiteQueryBuilder.buildQuery(cn.a, sb.toString(), (String)null, (String)null, s5, value));
        }
        final ab ab = new ab(sqLiteDatabase.query("timeline_view", cn.a, sb.toString(), array, (String)null, (String)null, s5, value));
        ab.b();
        ab.setNotificationUri(this.getContext().getContentResolver(), uri);
        return ab;
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException("Delete not supported: " + uri);
    }
    
    public String getType(final Uri uri) {
        switch (TwitterProvider.b.match(uri)) {
            default: {
                throw new IllegalArgumentException("Unknown URL " + uri);
            }
            case 1: {
                return "vnd.android.cursor.dir/vnd.twitter.android.users";
            }
            case 2: {
                return "vnd.android.cursor.item/vnd.twitter.android.users";
            }
            case 60:
            case 70:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 96:
            case 97:
            case 98:
            case 99: {
                return "vnd.android.cursor.dir/vnd.twitter.android.users.groups";
            }
            case 20: {
                return "vnd.android.cursor.dir/vnd.twitter.android.statuses";
            }
            case 21: {
                return "vnd.android.cursor.item/vnd.twitter.android.statuses";
            }
            case 40: {
                return "vnd.android.cursor.dir/vnd.twitter.android.drafts";
            }
            case 41: {
                return "vnd.android.cursor.item/vnd.twitter.android.drafts";
            }
            case 121:
            case 122:
            case 142:
            case 144:
            case 145: {
                return "vnd.android.cursor.item/vnd.twitter.android.statuses";
            }
            case 120:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case 132:
            case 133:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 146:
            case 147: {
                return "vnd.android.cursor.dir/vnd.twitter.android.statuses";
            }
            case 110: {
                return "vnd.android.cursor.dir/vnd.twitter.android.statuses.groups";
            }
            case 111: {
                return "vnd.android.cursor.item/vnd.twitter.android.statuses.groups";
            }
            case 300: {
                return "vnd.android.cursor.dir/vnd.twitter.android.lists";
            }
            case 301:
            case 302: {
                return "vnd.android.cursor.item/vnd.twitter.android.lists";
            }
            case 400:
            case 401:
            case 402:
            case 403:
            case 404:
            case 406: {
                return "vnd.android.cursor.item/vnd.twitter.android.timeline";
            }
            case 450:
            case 451: {
                return "vnd.android.cursor.dir/vnd.twitter.android.topics";
            }
            case 520: {
                return "vnd.android.cursor.dir/vnd.twitter.android.search.queries";
            }
            case 521: {
                return "vnd.android.cursor.item/vnd.twitter.android.search.queries";
            }
            case 522: {
                return "vnd.android.cursor.item/vnd.twitter.android.search.results";
            }
            case 700: {
                return "vnd.android.cursor.dir/vnd.twitter.android.activities";
            }
            case 800:
            case 802: {
                return "vnd.android.cursor.dir/vnd.twitter.android.discover";
            }
            case 801: {
                return "vnd.android.cursor.dir/vnd.twitter.android.raw_discover";
            }
            case 850: {
                return "vnd.android.cursor.dir/vnd.twitter.android.stories";
            }
            case 851: {
                return "vnd.android.cursor.dir/vnd.twitter.android.statuses";
            }
            case 900: {
                return "vnd.android.cursor.dir/vnd.twitter.android.search.queries";
            }
            case 1000: {
                return "vnd.android.cursor.dir/vnd.twitter.android.notifications";
            }
            case 1400: {
                return "vnd.android.cursor.dir/vnd.twitter.android.orderhistory";
            }
            case 1500: {
                return "vnd.android.cursor.dir/vnd.twitter.android.news.news";
            }
        }
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported " + uri);
    }
    
    public boolean onCreate() {
        return true;
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        final String queryParameter = uri.getQueryParameter("limit");
        final String queryParameter2 = uri.getQueryParameter("ownerId");
        final SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        if (TwitterProvider.a) {
            Log.d("TwitterProvider", "QUERY uri: " + uri + " -> " + TwitterProvider.b.match(uri));
        }
        final int match = TwitterProvider.b.match(uri);
        long long1;
        if (TextUtils.isEmpty((CharSequence)queryParameter2)) {
            long1 = 0L;
        }
        else {
            long1 = Long.parseLong(queryParameter2);
        }
        SQLiteDatabase sqLiteDatabase;
        if (match == 41 || match == 40) {
            sqLiteDatabase = f.a(this.getContext(), long1).getReadableDatabase();
        }
        else {
            sqLiteDatabase = bg.a(this.getContext(), long1).getReadableDatabase();
        }
        while (true) {
            String s6 = null;
            Label_6211: {
                Label_6201: {
                    String s3 = null;
                    String s4 = null;
                    String s5 = null;
                    switch (match) {
                        default: {
                            throw new IllegalArgumentException("Unknown URL " + uri);
                        }
                        case 1:
                        case 2: {
                            sqLiteQueryBuilder.setTables("users");
                            if (match == 2) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)("user_id=" + uri.getLastPathSegment()));
                            }
                            s3 = "profile_created DESC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 60: {
                            sqLiteQueryBuilder.setTables("user_groups");
                            s3 = "rank ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 70: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment()));
                            s3 = "_id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 72: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 0));
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 73: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 1));
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 99: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 29));
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 74: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=2");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 75: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=4");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 76: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=5");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 78: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=3");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 77: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + " IN (" + 1 + "," + 29 + "," + 0 + "," + 15 + "," + -1 + ")"));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 79: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment()));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 80: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 7));
                            s3 = "_id ASC";
                            s4 = queryParameter;
                            s5 = "user_id";
                            break;
                        }
                        case 97: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s6 = "username";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 81: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + "=" + 8));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 84: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + "=" + 13));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 85: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND (" + "friendship" + '&' + 8 + '=' + 8 + " OR " + "type" + '=' + 1 + ')'));
                            s3 = "friendship DESC, LOWER(name) ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 86: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 16));
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 87: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=17");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 82: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 11));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 83: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 12));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 96: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 25));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 88: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 18));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 89: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=19");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 98: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("type=19 OR (owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 7 + ")"));
                            s3 = "_id ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 92: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=21");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 90: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 10));
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 91: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 20));
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 94: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "friendship" + "&(" + 1 + '|' + 2 + ')' + '=' + 1 + '|' + 2));
                            s3 = "graph_weight DESC, LOWER(name) ASC";
                            s6 = "user_id";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = s6;
                                break;
                            }
                            break Label_6211;
                        }
                        case 101: {
                            sqLiteQueryBuilder.setTables("user_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"type=33");
                            s3 = "_id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 20:
                        case 21: {
                            sqLiteQueryBuilder.setTables("statuses");
                            if (match == 21) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)("status_id=" + uri.getLastPathSegment()));
                            }
                            s3 = "created DESC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 40:
                        case 41: {
                            sqLiteQueryBuilder.setTables("drafts");
                            if (match == 41) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)("_id=" + uri.getLastPathSegment()));
                            }
                            s3 = "updated_at DESC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 110:
                        case 111: {
                            sqLiteQueryBuilder.setTables("status_groups");
                            if (match == 111) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)("_id=" + uri.getLastPathSegment()));
                            }
                            s3 = "type DESC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 120: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 121: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 122: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("ref_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = "1";
                            s5 = null;
                            break;
                        }
                        case 142: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("g_status_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = "1";
                            s5 = null;
                            break;
                        }
                        case 123: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 1));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 135:
                        case 146: {
                            sqLiteQueryBuilder.setTables("status_groups_retweets_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 1));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (135 == match && queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 144: {
                            sqLiteQueryBuilder.setTables("status_groups_retweets_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("g_status_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = "1";
                            s5 = null;
                            break;
                        }
                        case 145: {
                            sqLiteQueryBuilder.setTables("status_groups_retweets_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("ref_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = "1";
                            s5 = null;
                            break;
                        }
                        case 124: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 2));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 125: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 0));
                            final String queryParameter3 = uri.getQueryParameter("newer");
                            if (queryParameter3 != null) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)(" AND updated_at>" + queryParameter3));
                            }
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 126: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 3));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 128: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 132: {
                            sqLiteQueryBuilder.setTables("status_groups_retweets_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 9));
                            s3 = null;
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s3 = null;
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 133: {
                            sqLiteQueryBuilder.setTables("category_status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 8));
                            s3 = null;
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s3 = null;
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 136: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("type=21 AND tag=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at ASC, _id DESC";
                            if (queryParameter == null) {
                                s4 = String.valueOf(400);
                                s5 = null;
                                break;
                            }
                            break Label_6201;
                        }
                        case 138: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 12));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 139: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 14));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 137: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 143: {
                            sqLiteQueryBuilder.setTables("status_groups_retweets_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 140: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND (" + "type" + '=' + 17 + " )"));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 141: {
                            sqLiteQueryBuilder.setTables("status_groups_retweets_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("owner_id=" + uri.getLastPathSegment() + " AND " + "type" + '=' + 17));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 147: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("type=33 AND tag=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 400: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, null, array2, s2, queryParameter);
                        }
                        case 401: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, "t_type=0 AND (t_data_type_group=0 OR t_data_type_group IS NULL)", array2, s2, queryParameter);
                        }
                        case 402: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, "t_type=1 AND (t_data_type_group=1 OR t_data_type_group IS NULL)", array2, s2, queryParameter);
                        }
                        case 403: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, "t_type=2 AND (t_data_type_group=16 OR t_data_type_group IS NULL)", array2, s2, queryParameter);
                        }
                        case 408: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, "t_type=6 AND (t_data_type_group=28 OR t_data_type_group IS NULL)", array2, s2, queryParameter);
                        }
                        case 406: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, "t_type=5 AND (t_data_type_group=27 OR t_data_type_group IS NULL)", array2, s2, queryParameter);
                        }
                        case 404: {
                            return (Cursor)this.a(sqLiteDatabase, uri, s, "t_type=3 AND (t_data_type_group=30 OR t_data_type_group IS NULL)", array2, s2, queryParameter);
                        }
                        case 450:
                        case 451: {
                            sqLiteQueryBuilder.setTables("topics_view");
                            if (match == 451) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)("ev_id=" + uri.getLastPathSegment()));
                            }
                            s3 = "_id ASC ";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 300: {
                            sqLiteQueryBuilder.setTables("lists_view");
                            s3 = "ev_query ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 301: {
                            sqLiteQueryBuilder.setTables("lists_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("_id=" + uri.getLastPathSegment()));
                            s3 = "ev_query ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 302: {
                            sqLiteQueryBuilder.setTables("lists_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("ev_id=" + uri.getLastPathSegment()));
                            s3 = "ev_query ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 202: {
                            sqLiteQueryBuilder.setTables("conversation");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("conversation_id=\"" + uri.getLastPathSegment() + '\"' + " AND " + "entry_type" + bg.a((Iterable)aj.c)));
                            s3 = "sort_entry_id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 203: {
                            sqLiteQueryBuilder.setTables("dm_inbox");
                            s3 = "sort_event_id DESC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 204: {
                            sqLiteQueryBuilder.setTables("dm_inbox");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("conversation_id=\"" + uri.getLastPathSegment() + '\"'));
                            s3 = "sort_event_id DESC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 206: {
                            sqLiteQueryBuilder.setTables("conversation_participants");
                            s3 = "participant_type,join_time ASC,CAST(user_id AS INT)";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 207: {
                            sqLiteQueryBuilder.setTables("conversation_participants");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("conversation_id=\"" + uri.getLastPathSegment() + '\"'));
                            s3 = "participant_type,join_time ASC,CAST(user_id AS INT)";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 208: {
                            final Cursor rawQuery = sqLiteDatabase.rawQuery("SELECT COUNT(*) FROM conversations WHERE last_readable_event_id > last_read_event_id AND last_readable_event_id > (SELECT COALESCE((SELECT CAST(next as int) AS last_seen_event_id FROM cursors WHERE kind=14 AND type=0 ORDER BY last_seen_event_id DESC LIMIT 1), 0));", (String[])null);
                            rawQuery.setNotificationUri(this.getContext().getContentResolver(), uri);
                            return rawQuery;
                        }
                        case 520: {
                            sqLiteQueryBuilder.setTables("search_queries");
                            final String queryParameter4 = uri.getQueryParameter("like");
                            if (queryParameter4 != null && queryParameter4.length() > 0) {
                                sqLiteQueryBuilder.appendWhere((CharSequence)"name LIKE ");
                                sqLiteQueryBuilder.appendWhereEscapeString(queryParameter4 + "%");
                            }
                            s3 = "name ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 521: {
                            sqLiteQueryBuilder.setTables("search_queries");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("_id=" + uri.getLastPathSegment()));
                            s3 = "name ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 522: {
                            sqLiteQueryBuilder.setTables("search_results_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"polled=0");
                            s3 = "type_id ASC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 700: {
                            sqLiteQueryBuilder.setTables("activities");
                            s3 = "max_position DESC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 800: {
                            final d d = new d(sqLiteDatabase.query("discover_view", bq.a, (String)null, (String[])null, (String)null, (String)null, "d_page ASC,_id ASC", (String)null));
                            d.b();
                            d.setNotificationUri(this.getContext().getContentResolver(), uri);
                            return (Cursor)d;
                        }
                        case 802: {
                            sqLiteQueryBuilder.setTables("discover_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)"d_type=2");
                            s3 = "d_page ASC,_id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 801: {
                            sqLiteQueryBuilder.setTables("discover");
                            s3 = "_id ASC ";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 850: {
                            sqLiteQueryBuilder.setTables("stories_view");
                            if (!TextUtils.isEmpty((CharSequence)s2)) {
                                s3 = s2;
                            }
                            else {
                                s3 = "story_order DESC, _id ASC";
                            }
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 851: {
                            final String lastPathSegment = uri.getLastPathSegment();
                            final String queryParameter5 = uri.getQueryParameter("search_id");
                            final String[] a = cm.a;
                            final String[] array3 = { lastPathSegment, String.valueOf(4) };
                            String s7;
                            if (TextUtils.isEmpty((CharSequence)s2)) {
                                s7 = "story_order DESC, _id ASC";
                            }
                            else {
                                s7 = s2;
                            }
                            final Cursor query = sqLiteDatabase.query("stories_view", a, "story_id=? AND data_type=?", array3, (String)null, (String)null, s7);
                            query.setNotificationUri(this.getContext().getContentResolver(), uri);
                            final StringBuilder sb = new StringBuilder();
                            if (query.moveToFirst()) {
                                sb.append(" AND ").append("g_status_id").append(" NOT IN (");
                                sb.append(query.getLong(1));
                                while (query.moveToNext()) {
                                    sb.append(',').append(query.getLong(1));
                                }
                                sb.append(')');
                            }
                            final String[] a2 = cc.a;
                            final String string = "search_id=?" + (Object)sb;
                            final String[] array4 = { queryParameter5 };
                            String s8;
                            if (TextUtils.isEmpty((CharSequence)s2)) {
                                s8 = "type_id ASC, _id ASC";
                            }
                            else {
                                s8 = s2;
                            }
                            final Cursor query2 = sqLiteDatabase.query("search_results_view", a2, string, array4, (String)null, (String)null, s8);
                            query2.setNotificationUri(this.getContext().getContentResolver(), uri);
                            return (Cursor)new MergeCursor(new Cursor[] { query, query2 });
                        }
                        case 900: {
                            sqLiteQueryBuilder.setTables("categories_view");
                            String s9;
                            if (TextUtils.isEmpty((CharSequence)s2)) {
                                s9 = "rank ASC ";
                            }
                            else {
                                s9 = s2;
                            }
                            final a a3 = new a(sqLiteQueryBuilder.query(sqLiteDatabase, array, s, array2, (String)null, (String)null, s9, (String)null));
                            a3.b();
                            a3.setNotificationUri(this.getContext().getContentResolver(), uri);
                            return (Cursor)a3;
                        }
                        case 1000: {
                            sqLiteQueryBuilder.setTables("notifications");
                            s3 = "notif_id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 1400: {
                            sqLiteQueryBuilder.setTables("order_history");
                            s3 = "ordered_at DESC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 1500: {
                            sqLiteQueryBuilder.setTables("news");
                            s3 = "_id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                        case 1501: {
                            sqLiteQueryBuilder.setTables("status_groups_view");
                            sqLiteQueryBuilder.appendWhere((CharSequence)("type=32 AND tag=" + uri.getLastPathSegment()));
                            s3 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                            s4 = queryParameter;
                            s5 = null;
                            break;
                        }
                    }
                    String s10;
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        s10 = s2;
                    }
                    else {
                        s10 = s3;
                    }
                    if (TwitterProvider.a) {
                        Log.d("TwitterProvider", "QUERY: " + sqLiteQueryBuilder.buildQuery(array, s, (String)null, (String)null, s2, s4));
                    }
                    final Cursor query3 = sqLiteQueryBuilder.query(sqLiteDatabase, array, s, array2, s5, (String)null, s10, s4);
                    if (TwitterProvider.a) {
                        Log.d("TwitterProvider", "QUERY results: " + query3.getCount());
                    }
                    query3.setNotificationUri(this.getContext().getContentResolver(), uri);
                    return query3;
                }
                String s4 = queryParameter;
                String s5 = null;
                continue;
            }
            String s4 = queryParameter;
            String s5 = s6;
            continue;
        }
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("Update not supported: " + uri);
    }
}
