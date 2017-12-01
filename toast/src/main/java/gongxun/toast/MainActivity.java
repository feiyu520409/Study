package gongxun.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showToastShort, showToastLong, showToastImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToastShort = findViewById(R.id.showToastShort);
        showToastLong = findViewById(R.id.showToastLong);
        showToastImage = findViewById(R.id.showToastImage);

        showToastShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast aShortToast = Toast.makeText(MainActivity.this, "显示一个简短的Toast", Toast.LENGTH_SHORT);
                aShortToast.setGravity(Gravity.CENTER, 0, 0);
                aShortToast.show();
            }
        });
        showToastLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "显示一个长的Toast", Toast.LENGTH_LONG).show();
            }
        });
        showToastImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast imgToast = Toast.makeText(MainActivity.this, "显示一个带图片的Toast", Toast.LENGTH_LONG);

                ImageView imageView = new ImageView(MainActivity.this);

                imageView.setImageResource(R.mipmap.ic_launcher);

                imgToast.setView(imageView);

                imgToast.show();
            }
        });

    }
}
