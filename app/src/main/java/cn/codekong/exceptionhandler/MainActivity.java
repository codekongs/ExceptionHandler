package cn.codekong.exceptionhandler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String string = null;
        if (string.equals("Android")){
            Log.d(TAG, "onCreate: ");
        }

        //当前时间
//        long curTime = System.currentTimeMillis();
//        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.SIMPLIFIED_CHINESE).format(new Date());
//        //组装文件名
//        String fileName = "crash-" + time + "-" + curTime + ".log";
//
//        //写错误信息到文件
//        FileOutputStream fos = null;
//        try {
//            fos = openFileOutput(fileName, Context.MODE_PRIVATE);
//            fos.write("我是loglogloglogloglogloglogloglogloglog".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fos != null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
