package com.example.user.glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList imageUrlList = prepareData();
        DataAdapter dataAdapter = new DataAdapter(getApplicationContext(), imageUrlList);
        recyclerView.setAdapter(dataAdapter);
    }

    private ArrayList prepareData() {

// here you should give your image URLs and that can be a link from the Internet
        String imageUrls[] = {
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgl2dBcAmcEJqclaMB24Hw69inyTmlDcTZ4mEUvT7Y1gwkXrEf",
                "https://i.pinimg.com/564x/32/cd/dc/32cddc2e3d5fc8b41dae8edbebae48ae--google-search-future-car.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsd9gdGlUHbiD0_CuZCVya__sPpIlMBv8sGSEfioA2L8xt5mBEKQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSw7iCFAwlZajcOlAYBZe3r4uG-QpRmgSXb3_Fqg1cH7aiu0GwlxQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrnyRabyfwye0UAAUnT5Av-RvyYB3SbCc_q22_P8E2vXSuFBHpUA",
                "https://bouqs-production-weblinc.netdna-ssl.com/product_images/roses-sunflowers-chrysanthemums/Deluxe/5baa65be6170700f37002420/large_thumb.jpg?c=1537893822",
                "http://thenewswheel.com/wp-content/uploads/2017/03/10-Famous-New-Yorkers-with-Incredibly-Cool-Cars-Feature.jpg",
                "http://beverlyhillsmagazine.com/wp-content/uploads/Ferrrari-LaFerrari-1.jpeg",
                "https://i.pinimg.com/736x/51/22/24/512224b7565c4adf4cd66bba6184bf78--most-expensive-expensive-cars.jpg",
                "http://beverlyhillsmagazine.com/wp-content/uploads/Bentley-Aston-Martin-Dream-Cars-Maybach-Doge-Charger-Cool-Cars-Race-Car-Magazine-VIP-Style-cars-Supercars-Beverly-Hills-Magazine-3-e1492551913276.jpg",
                "https://lh6.ggpht.com/78tnPMNVWns7NsmTjO3C9QQz-jRxLIjL1yE8VtJC_Epv24r4AKjW4e14BojEKbcMPCdr%3Dh310",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIkrQ-IDXoUVWyeC4FMkGfGabB1-bbrnGx3Z9jEBUlMokElYH9",
                "https://s-media-cache-ak0.pinimg.com/originals/80/69/92/806992aaf90fcb40065a600ae485002a.jpg"};


        ArrayList imageUrlList = new ArrayList<>();
        for (int i = 0; i < imageUrls.length; i++) {
            ImageUrl imageUrl = new ImageUrl();
            imageUrl.setImageUrl(imageUrls[i]);
            imageUrlList.add(imageUrl);
        }
        Log.d("MainActivity", "List count: " + imageUrlList.size());
        return imageUrlList;
    }
}