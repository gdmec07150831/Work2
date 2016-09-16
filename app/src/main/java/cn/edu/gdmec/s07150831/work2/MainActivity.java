package cn.edu.gdmec.s07150831.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Work2","onCreate执行啊");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","哈哈我来了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","onResume执行了哦");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work2","onPause执行了欸");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","onStop执行了呀");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work2","onRestart执行啦啦啦");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","onDestrou执行了了了");
    }
}
