package com.example.demo_home_01;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.Response;

import android.os.Bundle;
import android.view.View;

import com.example.demo_home_01.http.BeanCallback_NoDialog;
import com.example.demo_home_01.myview.LineChartView_LEFT;
import com.example.demo_home_01.myview.LineChartView_RIGHT;
import com.example.demo_home_01.myview.LineChartView_RIGHT2;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<String> xlist = new ArrayList<>();
    List<LineChartView_LEFT.Data> chart1Data = new ArrayList<>();
    List<LineChartView_RIGHT.Data> chart2Data = new ArrayList<>();
    List<LineChartView_RIGHT2.Data> chart3Data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LineChartView_LEFT chart1 = findViewById(R.id.line_chart_1);
        final LineChartView_RIGHT chart2 = findViewById(R.id.line_chart_2);
        final LineChartView_RIGHT2 chart3 = findViewById(R.id.line_chart_3);

        OkGo.<YiQingBean>get("http://www.dzyong.top:3005/yiqing/history")
                .tag(this)
                .execute(new BeanCallback_NoDialog<YiQingBean>() {
                    @Override
                    public YiQingBean convertResponse(Response response) throws Throwable {
                        String s = response.body().string();
                        System.out.println("数据xxx  :"+s);
                        YiQingBean yiQingBean = new Gson().fromJson(s, YiQingBean.class);
                        return yiQingBean;
                    }

                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<YiQingBean> response) {
                        super.onSuccess(response);

                        if (response == null) {
                            return;
                        }
                        YiQingBean body = response.body();
                        List<YiQingBean.DataBean> data = body.getData();
                        for (int i = 0; i < data.size(); i++) {
                            YiQingBean.DataBean dataBean = data.get(i);
                            // 确诊
                            chart1Data.add(new LineChartView_LEFT.Data(dataBean.getConfirmedNum()));
                            //死亡
                            chart2Data.add(new LineChartView_RIGHT.Data(dataBean.getDeathsNum()));
                            //治愈
                            chart3Data.add(new LineChartView_RIGHT2.Data(dataBean.getCuresNum()));
                            //日期  2020-02-12
                            String date = dataBean.getDate();
                            String substring = date.substring(date.length() - 4, date.length());
                            substring.replace("-", "");
                            xlist.add(substring);
                        }

                        /************************确诊***********************************/

                        Collections.reverse(xlist);
                        Collections.reverse(chart1Data);
                        chart1.setXlist(xlist);
                        chart1.setData(chart1Data);
                        chart1.setRulerYSpace(10000);
                        //改为动态了
                        //        mViewBinding.lineChartView.setStepSpace(30);
                        //贝塞尔线
                        chart1.setBezierLine(false);
                        //显示表格
                        chart1.setShowTable(true);
                        //设置为圆点
                        chart1.setCubePoint(false);

                        /*************************死亡********************************/


                        Collections.reverse(chart2Data);
                        chart2.setData(chart2Data);
                        chart2.setRulerYSpace(1000);
                        //改为动态了
                        //        mViewBinding.lineChartView.setStepSpace(30);
                        //贝塞尔线
                        chart2.setBezierLine(false);
                        //显示表格
                        chart2.setShowTable(true);
                        //设置为圆点
                        chart2.setCubePoint(false);


                        /**************************治愈*******************************/

                        Collections.reverse(chart3Data);
                        chart3.setData(chart3Data);
                        chart3.setRulerYSpace(1000);
                        //改为动态了
                        //        mViewBinqding.lineChartView.setStepSpace(30);
                        //贝塞尔线
                        chart3.setBezierLine(false);
                        //显示表格
                        chart3.setShowTable(true);
                        //设置为圆点
                        chart3.setCubePoint(false);


                    }
                });

    }
}
