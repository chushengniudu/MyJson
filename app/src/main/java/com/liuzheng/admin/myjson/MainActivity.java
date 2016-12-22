package com.liuzheng.admin.myjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Android开发：JSON简介及最全面解析方法(Gson、AS自带org.json、Jackson解析)
 * 网址：http://www.jianshu.com/p/b87fee2f7a23
 * 因为Android Studio自带org.json 比较消耗时间和内存,解析速度和效率慢 比Gson和Jackson解析都差 这里不予解析
 * <p>
 * Gson解析：GSON可按需解析，即创建的JavaBean类不一定完全涵盖所要解析的JSON数据，按需创建属性
 * Jackson解析：Jackson解析对应的JavaBean必须把Json数据里面的所有key都有所对应，即必须把JSON内的数据所有解析出来，无法按需解析。但Jackson的解析速度和效率都要比GSON高
 * <p>
 * 在这里你可以尝试将VRConfig对象去除（private List<RootEntity> root;） 会发现Gson解析是成功的，但是Jackson解析是失败的，项目自己用哪一种看个人的喜好
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;

    private VRConfig vrConfig;
    private String line;

    private StringBuilder stringBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        try {
            //从assets获取json文件
            InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("assets/" + "VRConfig.json"), "utf-8");
            //字节流转字符流
            BufferedReader bfr = new BufferedReader(isr);
            stringBuilder = new StringBuilder();
            //将JSON数据转化为字符串
            while ((line = bfr.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Gson gson = new Gson();
                vrConfig = gson.fromJson(stringBuilder.toString(), VRConfig.class);
                Log.d("MainActivity", "Gson解析" + vrConfig.getSuccess());
                break;
            case R.id.button2:
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    //将Json字符串转换为对象（反序列化）
                    vrConfig = objectMapper.readValue(stringBuilder.toString(), VRConfig.class);
                    Log.d("MainActivity", "Jackson解析" + vrConfig.getSuccess());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
