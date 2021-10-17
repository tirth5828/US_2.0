package com.example.us_2_0;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Notification extends AppCompatActivity {
    TextView T1,T2,T3,T4,T5,T6,T7;

    int max_id = 29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        getlength ();


        T1 = findViewById (R.id.textView4);
        getresponse (T1,max_id);

        T2 = findViewById (R.id.textView5);
        getresponse (T2,max_id-1);

        T3 = findViewById (R.id.textView6);
        getresponse (T3,max_id-2);

        T4 = findViewById (R.id.textView7);
        getresponse (T4,max_id-3);

        T5 = findViewById (R.id.textView8);
        getresponse (T5,max_id-4);

        T6 = findViewById (R.id.textView9);
        getresponse (T6,max_id-5);

        T7 = findViewById (R.id.textView10);
        getresponse (T7,max_id-6);

    }

    public void ChangeText(View view) {
        getlength ();

        T1 = findViewById (R.id.textView4);
        getresponse (T1,max_id);

        T2 = findViewById (R.id.textView5);
        getresponse (T2,max_id-1);

        T3 = findViewById (R.id.textView6);
        getresponse (T3,max_id-2);

        T4 = findViewById (R.id.textView7);
        getresponse (T4,max_id-3);

        T5 = findViewById (R.id.textView8);
        getresponse (T5,max_id-4);

        T6 = findViewById (R.id.textView9);
        getresponse (T6,max_id-5);

        T7 = findViewById (R.id.textView10);
        getresponse (T7,max_id-6);
    }

    public void getresponse(TextView T, int id){
        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue (this);

        String url = "https://x8ki-letl-twmt.n7.xano.io/api:WMKQkzzw/Important_Dates/"
                + id;


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest (Request.Method.GET,
                url, null, new Response.Listener<JSONObject> () {
            @Override
            public void onResponse (JSONObject response) {
                try {

                    String Res = response.getString ("Name") + " is scheduled on "
                            + response.getString ("Date") +", "
                            +response.getString ("Day");
                    T.setText (Res);

                } catch (JSONException e) {
                    e.printStackTrace ();
                }
            }
        }, new Response.ErrorListener () {
            @Override
            public void onErrorResponse (VolleyError error) {
                Log.d("My APP","Something Went Wrong");
            }
        });

        requestQueue.add (jsonObjectRequest);
    }


    public void getlength(){
        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue (this);

        String url = "https://x8ki-letl-twmt.n7.xano.io/api:WMKQkzzw/Important_Dates";


        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest (Request.Method.GET,
                url, null, new Response.Listener<JSONArray> () {
            @Override
            public void onResponse (JSONArray response) {

                max_id = response.length ();

            }
        }, new Response.ErrorListener () {
            @Override
            public void onErrorResponse (VolleyError error) {
                Log.d("My APP","Something Went Wrong");
            }
        });

        requestQueue.add (jsonArrayRequest);
    }

}