package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量
    public static final String SQL_CREATE_TODO =
            "CREATE TABLE " + Todonote.TABLE_NAME+"("+
                    Todonote._ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    Todonote.TABLE_DATE+" INTEGER,"+
                    Todonote.TABLE_STATE+" INTEGER,"+
                    Todonote.TABLE_CONTENT+" TEXT,"+
                    Todonote.TABLE_PRIORITY+" INTEGER)";

    public static final String SQL_ADD_PRIORITY=
            "ADD PRIORITY"+Todonote.TABLE_NAME+" ADD"+Todonote.TABLE_PRIORITY+" INTEGER";


    public class Todonote implements BaseColumns{
        public static final String TABLE_NAME = "todo";
        public static final String TABLE_DATE="date";
        public static final String TABLE_CONTENT="content";
        public static final String TABLE_STATE="state";
        public static final String TABLE_PRIORITY="priority";
    }
}
