package com.criptdestroyer.mymoviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMovieActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle;
    TextView tvYear;
    TextView tvDescription;
    TextView tvTrTitle;
    TextView tvTrYear;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        tvTitle = findViewById(R.id.tv_detail_title);
        tvYear = findViewById(R.id.tv_detail_year);
        tvDescription = findViewById(R.id.tv_detail_description);
        tvTrTitle = findViewById(R.id.tr_tv_title);
        tvTrYear = findViewById(R.id.tr_tv_year);
        imgPhoto = findViewById(R.id.img_detail_photo);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        tvTitle.setText(movie.getTitle());
        tvYear.setText(movie.getYear());
        tvDescription.setText(movie.getDescription());
        tvTrTitle.setText(movie.getTitle());
        tvTrYear.setText(movie.getYear());
        Glide.with(this).load(movie.getPhoto()).into(imgPhoto);
    }
}
