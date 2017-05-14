package com.example.johnnate.vantashop;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by JohnNate on 5/14/17.
 */

public class CRUD {

    static FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference ref = db.getReference();

    public void write ()
    {
        ref.setValue("Hello, World");
    }
}
