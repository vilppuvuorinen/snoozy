/*
 * This file is generated by jOOQ.
 */
package fi.jubic.snoozy.example.db;


import fi.jubic.snoozy.example.db.tables.Todo;
import fi.jubic.snoozy.example.db.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>test.todo</code>.
     */
    public static final Todo TODO = fi.jubic.snoozy.example.db.tables.Todo.TODO;

    /**
     * The table <code>test.user</code>.
     */
    public static final User USER = fi.jubic.snoozy.example.db.tables.User.USER;
}
