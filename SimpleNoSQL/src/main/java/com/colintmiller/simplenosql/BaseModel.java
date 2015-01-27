package com.colintmiller.simplenosql;

/**
 * Created by paul on 1/26/15.
 */
public class BaseModel {
    public static final String TAG = BaseModel.class.getCanonicalName();

    private transient String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
