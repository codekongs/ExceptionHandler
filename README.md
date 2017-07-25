### Android异常处理类
主要实现在程序异常或者崩溃时对于异常的捕获，并且将其记录入文件。

`使用方法`

注意:由于记录Crash日志需要读写SD卡权限，所以必须在使用前申请权限，Android6.0及以上还需要动态申请权限，可参考 http://blog.csdn.net/bingjianit/article/details/54632872

1. 将 [项目目录]/app/src/main/java/cn/codekong/exceptionhandler/exception 下的CrashHandler.java拷贝到项目中。

2. 新疆App类继承自Application,重写其中的onCreate()方法

3. 按照下列代码初始化

```
public class CrashApp extends Application {

    private CrashHandler mCrashHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        //通过单例模式获得独享
        mCrashHandler = CrashHandler.getInstance();
        //初始化
        mCrashHandler.init(this);
    }
}
```

4. 在AndroidMainfest.xml文件中的Application标签中添加name属性值为CrashApp

```
<application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:name=".app.CrashApp"
        android:theme="@style/AppTheme">
```
即可使用

当程序崩溃时可以将崩溃信息写入SD卡根目录的crash文件夹中
