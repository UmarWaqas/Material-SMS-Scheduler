/*
 Copyright 2016 Kyle Szombathy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.kyleszombathy.sms_scheduler;

import android.provider.BaseColumns;

/**
 * Created by Kyle on 11/30/2015.
 * Creates SQLite table for storing contact information and time to send
 */
public final class SQLContract {



    public SQLContract() {}

    /* Inner class that defines the table contents */
    public static abstract class MessageEntry implements BaseColumns {
        public static final String TABLE_NAME = "scheduledMessage";
        public static final String NAME = "name";
        public static final String PHONE = "phone";
        public static final String MESSAGE = "message";
        public static final String YEAR = "year";
        public static final String MONTH = "month";
        public static final String DAY = "day";
        public static final String HOUR = "hour";
        public static final String MINUTE = "minute";
        public static final String ALARM_NUMBER = "alarmNumber";
        public static final String ARCHIVED = "archived";
        public static final String PHOTO_URI = "photoUri";
        public static final String NULLABLE = "nullable";
        public static final String DATETIME = "dateTime";
        // Notifications Table
        public static final String TABLE_NOTIFICATIONS = "notificationsTable";
        public static final String NAME_LIST = "nameList";
        public static final String SEND_SUCCESS = "sendSuccess";
    }
}