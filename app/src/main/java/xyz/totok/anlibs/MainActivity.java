package xyz.totok.anlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xyz.totok.util.LogUtils;
import xyz.totok.util.StringUtils;
import xyz.totok.util.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.d("测试");
    }
}
