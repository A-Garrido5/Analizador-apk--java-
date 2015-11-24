// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import com.twitter.library.client.k;
import com.twitter.library.client.az;
import android.annotation.TargetApi;
import java.util.Iterator;
import java.util.ArrayList;
import android.database.DatabaseUtils;
import android.content.ContentValues;
import java.util.HashMap;
import java.util.List;
import android.provider.ContactsContract$Data;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.database.Cursor;
import android.content.Context;

public class o implements m
{
    private static boolean a;
    private static String b;
    private final Context c;
    
    o(final Context context) {
        this.c = context.getApplicationContext();
    }
    
    @Override
    public Cursor a() {
        final HashSet<String> set = new HashSet<String>(Arrays.asList("mimetype", "lookup", "data2", "data3", "is_primary", "data1", "data1", "data2", "data3", "is_primary", "data1", "data2", "data3"));
        if (Build$VERSION.SDK_INT >= 16) {
            set.add("data4");
        }
        final String[] array = set.toArray(new String[set.size()]);
        try {
            return this.c.getContentResolver().query(ContactsContract$Data.CONTENT_URI, array, "mimetype='vnd.android.cursor.item/phone_v2' OR mimetype='vnd.android.cursor.item/email_v2' OR mimetype='vnd.android.cursor.item/name'", (String[])null, (String)null);
        }
        catch (SecurityException ex) {}
        catch (IllegalArgumentException ex2) {
            goto Label_0142;
        }
    }
    
    @TargetApi(16)
    @Override
    public List a(final Cursor cursor) {
        final int columnIndex = cursor.getColumnIndex("mimetype");
        final int columnIndex2 = cursor.getColumnIndex("lookup");
        final int columnIndex3 = cursor.getColumnIndex("data4");
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        while (cursor.moveToNext()) {
            final String string = cursor.getString(columnIndex);
            final ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", string);
            switch (string) {
                default: {
                    continue;
                }
                case "vnd.android.cursor.item/phone_v2": {
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "is_primary");
                    if (Build$VERSION.SDK_INT >= 16 && !cursor.isNull(columnIndex3)) {
                        contentValues.put("data1", cursor.getString(columnIndex3));
                        break;
                    }
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                    break;
                }
                case "vnd.android.cursor.item/email_v2": {
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "data2");
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentValues, "is_primary");
                    break;
                }
                case "vnd.android.cursor.item/name": {
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data1");
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data2");
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentValues, "data3");
                    break;
                }
            }
            final String string2 = cursor.getString(columnIndex2);
            List<ContentValues> list = hashMap.get(string2);
            if (list == null) {
                list = new ArrayList<ContentValues>();
                hashMap.put(string2, list);
            }
            list.add(contentValues);
        }
        final HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
        final b b = new b(-1073741823, "UTF-8");
        final ArrayList<String> list2 = new ArrayList<String>();
        for (final List<ContentValues> list3 : hashMap.values()) {
            hashMap2.clear();
            b.a();
            final Iterator<ContentValues> iterator2 = list3.iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final ContentValues contentValues2 = iterator2.next();
                final String asString = contentValues2.getAsString("mimetype");
                int n3;
                if (asString.equals("vnd.android.cursor.item/phone_v2") || asString.equals("vnd.android.cursor.item/email_v2")) {
                    n3 = 1;
                }
                else {
                    n3 = n2;
                }
                List<?> list4 = hashMap2.get(asString);
                if (list4 == null) {
                    list4 = new ArrayList<Object>();
                    hashMap2.put(asString, list4);
                }
                list4.add(contentValues2);
                n2 = n3;
            }
            if (n2 != 0) {
                b.a(hashMap2.get("vnd.android.cursor.item/name")).a(hashMap2.get("vnd.android.cursor.item/phone_v2"), null).b(hashMap2.get("vnd.android.cursor.item/email_v2"));
                list2.add(b.toString());
            }
        }
        return list2;
    }
    
    @Override
    public boolean b() {
        final String e = az.a(this.c).b().e();
        if (o.b != null && o.b.equals(e)) {
            return o.a;
        }
        o.a = new k(this.c, e, "ContactLoaderHelper").getBoolean("contacts_uploaded", false);
        o.b = e;
        return o.a;
    }
    
    @Override
    public void c() {
        final String e = az.a(this.c).b().e();
        if (new k(this.c, e, "ContactLoaderHelper").a().a("contacts_uploaded", true).commit()) {
            o.a = true;
            o.b = e;
        }
    }
}
