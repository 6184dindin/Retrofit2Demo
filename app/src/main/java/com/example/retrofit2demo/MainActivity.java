package com.example.retrofit2demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

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
        jsonPlaceHolderProductAPI = RetrofitClient.getClient("https://demo3806855.mockable.io/")
                                    .create(JsonPlaceHolderProductAPI.class);
//        jsonPlaceHolderProductAPI.saveProduct("a","s");
//        Call<Product> call = jsonPlaceHolderProductAPI.saveProduct("a","s");
//                call.enqueue(new Callback<Product>() {
//                    @Override
//                    public void onResponse(Call<Product> call, Response<Product> response) {
//                        if(response.isSuccessful()) {
//                            binding.tvT.setText(response.body().toString());
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<Product> call, Throwable t) {
//
//                    }
//                });
        Call<List<Product>> call = jsonPlaceHolderProductAPI.getRices();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if(response.isSuccessful()){
                    binding.tvT.setText(response.body().get(0).getName());
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {

            }
        });
    }
}