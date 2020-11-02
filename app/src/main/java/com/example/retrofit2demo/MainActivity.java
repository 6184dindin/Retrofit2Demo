package com.example.retrofit2demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.retrofit2demo.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    JsonPlaceHolderProductAPI jsonPlaceHolderProductAPI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        jsonPlaceHolderProductAPI = RetrofitClient.getClient("http://14.248.83.116:6060/HoTroVN/SupportNews/")
                                    .create(JsonPlaceHolderProductAPI.class);
        binding.tvT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<Poco> call = jsonPlaceHolderProductAPI.getlistshortnewsrq(
                        new post(0,0,0,0,0,0,
                                61846184,"46A53A93-2D14-477D-9818-07ADDDFF2E7C"));
                Log.d("Main", call.request().toString());
                call.enqueue(new Callback<Poco>() {
                    @Override
                    public void onResponse(Call<Poco> call, Response<Poco> response) {
                        Log.d("MAin", "s");
                    }

                    @Override
                    public void onFailure(Call<Poco> call, Throwable t) {
                        Log.d("Test", t.getMessage());
                    }
                });
            }
        });
    }
}