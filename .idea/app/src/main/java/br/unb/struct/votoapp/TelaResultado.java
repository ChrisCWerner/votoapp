package br.unb.struct.votoapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 30/10/2016.
 */

public class TelaResultado extends AppCompatActivity{

    PieChart pieChart;
    DrawerLayout mainLayout;
    Button bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaresultado);

       // mainLayout = (RelativeLayout) findViewById(R.id.tela);
        pieChart = new PieChart(this);

        setContentView(pieChart);
        pieChart.setUsePercentValues(true);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleRadius(10);
        pieChart.setTransparentCircleRadius(10);
        pieChart.setRotationAngle(0);
        pieChart.setRotationEnabled(true);
        addData();
        Legend l = pieChart.getLegend();
        l.setPosition(Legend.LegendPosition.LEFT_OF_CHART);
        l.setXEntrySpace(7);
        l.setYEntrySpace(5);

    }

   private void addData(){

       List<PieEntry> entries = new ArrayList<>();
       Singleton singleton = Singleton.getINSTANCE();

       entries.add(new PieEntry(singleton.getLista().get(0).getVotos(),"Opção 1"));
       entries.add(new PieEntry(singleton.getLista().get(1).getVotos(),"Opção 2"));
       PieDataSet dataSet = new PieDataSet(entries, "Refeições");
       dataSet.setSliceSpace(3);
       dataSet.setSelectionShift(5);

       ArrayList<Integer> colors = new ArrayList<>();

       for(int c : ColorTemplate.COLORFUL_COLORS)
           colors.add(c);
        for(int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
       for(int c : ColorTemplate.PASTEL_COLORS)
           colors.add(c);

       colors.add(ColorTemplate.getHoloBlue());
       dataSet.setColors(colors);
       PieData data = new PieData(dataSet);
       data.setValueFormatter(new PercentFormatter());
       data.setValueTextSize(15f);
       data.setValueTextColor(Color.WHITE);

       pieChart.setData(data);
       pieChart.highlightValues(null);
       pieChart.invalidate();
   }


}
