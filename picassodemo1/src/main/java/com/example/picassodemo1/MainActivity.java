package com.example.picassodemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.ColorFilterTransformation;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import jp.wasabeef.picasso.transformations.CropSquareTransformation;
import jp.wasabeef.picasso.transformations.CropTransformation;
import jp.wasabeef.picasso.transformations.GrayscaleTransformation;
import jp.wasabeef.picasso.transformations.MaskTransformation;
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);


        Picasso.with(this)
                .load("http://i04.pictn.sogoucdn.com/0fe647ad1fc87f40")
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
//                .resize(400, 400)//设置尺寸
//                .onlyScaleDown()
//                .centerCrop()
//                .rotate(45)//旋转角度
//                .centerInside()

//                .fit()//默认裁剪

//                .transform(new BlurTransformation(this))//模糊

//                .transform(new CropCircleTransformation())//圆形
//                .transform(new CropSquareTransformation())

                .into(img);

    }


}
