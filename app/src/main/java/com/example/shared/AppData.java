package com.example.shared;

import android.content.Context;
import android.content.SharedPreferences;

public class AppData {

    SharedPreferences p;

    public AppData(Context context) {
        p = context.getSharedPreferences("app_data",
                Context.MODE_PRIVATE);
    }

    public void saveToken(String userID, String userToken){
        SharedPreferences.Editor e = p.edit();
        e.putString("user_id", userID);
        e.putString("user_token", userToken);
        e.commit();
    }

    public String[] getToken(){
        String[] data = new String[2];
        data[0] = p.getString("user_id", "");
        data[1] = p.getString("user_token", "");
        return data;
    }
}
