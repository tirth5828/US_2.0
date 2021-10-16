package com.example.us_2_0;



import static com.example.us_2_0.CalendarUtils.daysInWeekArray;
import static com.example.us_2_0.CalendarUtils.formattedTime;
import static com.example.us_2_0.CalendarUtils.monthYearFromDate;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class WeekViewActivity extends AppCompatActivity implements CalendarAdapter.OnItemListener
{
    private TextView monthYearText;
    private RecyclerView calendarRecyclerView;
    private ListView eventListView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_view);
        initWidgets();
        CalendarUtils.selectedDate = LocalDate.now();
        setWeekView();


        eventListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MjQwNjEwNzU0NzIy/a/MjQwNjEyNjY5NTQ2/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                } else if (position==1){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MjQyNTk1MjQwOTYw/a/MTg2MjQ0NzYzOTk2/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                } else if (position==2){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MzEzNjcyNjMzNjM0/a/MzI3MTkxOTA0MDQy/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==3){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MjQwNjEwNzU0NzIy/a/MjQzNjQ4NTQyMjUy/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==4){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MzEzNjcyNjMzNjM0/a/MzI5NDQzOTQ4NTI2/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==5){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MjQyNTk1MjQwOTYw/a/MjQ4NzI3NjgyOTk0/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==6){
                    Uri uri = Uri.parse("https://classroom.google.com/c/MjQwNjEwNzU0NzIy/a/MTg2MzIxMjAxODM0/details");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==7){
                    Uri uri = Uri.parse("https://betamoodle.iiitvadodara.ac.in/login/index.php");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==8){
                    Uri uri = Uri.parse("https://betamoodle.iiitvadodara.ac.in/login/index.php");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==9){
                    Uri uri = Uri.parse("https://betamoodle.iiitvadodara.ac.in/login/index.php");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==10){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==11){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==12){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==13){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==14){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==15){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==16){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==17){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==18){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==19){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==20){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }else if (position==21){
                    Uri uri = Uri.parse("https://meet.google.com/trp-rnxf-uzm");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "This is just a demo link", Toast.LENGTH_SHORT).show();
                }



            }
        });

        Event sampleEvent = new Event("Maths Assignment 1",LocalDate.of(2021,10,16), LocalTime.of(12,00,00));
        Event.eventsList.add(sampleEvent);


        Event sampleEvent1 = new Event("Physics Assignment 2",LocalDate.of(2021,10,16), LocalTime.of(12,00,00));
        Event.eventsList.add(sampleEvent1);


        Event sampleEvent2 = new Event("Electronics Assignment 2",LocalDate.of(2021,10,16), LocalTime.of(12,00,00));
        Event.eventsList.add(sampleEvent2);


        Event sampleEvent3 = new Event("Maths Assignment 2",LocalDate.of(2021,10,18), LocalTime.of(12,00,00));
        Event.eventsList.add(sampleEvent3);


        Event sampleEvent4 = new Event("Electronics Assignment 3",LocalDate.of(2021,10,20), LocalTime.of(12,00,00));
        Event.eventsList.add(sampleEvent4);


        Event sampleEvent5 = new Event("Physics Assignment 3",LocalDate.of(2021,10,17), LocalTime.of(20,00,00));
        Event.eventsList.add(sampleEvent5);


        Event sampleEvent6 = new Event("Maths Assignment 3",LocalDate.of(2021,10,24), LocalTime.of(12,00,00));
        Event.eventsList.add(sampleEvent6);


        Event sampleEvent7 = new Event("Electronics Quiz 1",LocalDate.of(2021,10,23), LocalTime.of(10,00,00));
        Event.eventsList.add(sampleEvent7);


        Event sampleEvent8 = new Event("Physics Quiz 1",LocalDate.of(2021,10,21), LocalTime.of(10,00,00));
        Event.eventsList.add(sampleEvent8);


        Event sampleEvent9 = new Event("Maths Quiz 1",LocalDate.of(2021,10,22), LocalTime.of(10,00,00));
        Event.eventsList.add(sampleEvent9);


        Event sampleEvent10 = new Event("Maths lecture",LocalDate.of(2021,10,14), LocalTime.of(8,00,00));
        Event.eventsList.add(sampleEvent10);

        Event sampleEvent11 = new Event("Electronics lecture",LocalDate.of(2021,10,14), LocalTime.of(10,00,10));
        Event.eventsList.add(sampleEvent11);


        Event sampleEvent12 = new Event("Physics lecture",LocalDate.of(2021,10,15), LocalTime.of(14,30,00));
        Event.eventsList.add(sampleEvent12);


        Event sampleEvent13 = new Event("Maths lecture",LocalDate.of(2021,10,15), LocalTime.of(16,00,00));
        Event.eventsList.add(sampleEvent13);

        Event sampleEvent14 = new Event("Electronics lecture",LocalDate.of(2021,10,13), LocalTime.of(8,30,00));
        Event.eventsList.add(sampleEvent14);


        Event sampleEvent15 = new Event("Physics lecture",LocalDate.of(2021,10,13), LocalTime.of(10,00,00));
        Event.eventsList.add(sampleEvent15);


        Event sampleEvent16 = new Event("Maths lecture",LocalDate.of(2021,10,24), LocalTime.of(10,10,10));
        Event.eventsList.add(sampleEvent16);

        Event sampleEvent17 = new Event("Electronics lecture",LocalDate.of(2021,10,24), LocalTime.of(10,10,10));
        Event.eventsList.add(sampleEvent17);


        Event sampleEvent18 = new Event("Physics lecture",LocalDate.of(2021,10,12), LocalTime.of(8,30,00));
        Event.eventsList.add(sampleEvent18);


        Event sampleEvent19 = new Event("Maths lecture",LocalDate.of(2021,10,12), LocalTime.of(10,00,00));
        Event.eventsList.add(sampleEvent19);

        Event sampleEvent20 = new Event("Electronics lecture",LocalDate.of(2021,10,19), LocalTime.of(10,10,10));
        Event.eventsList.add(sampleEvent20);


        Event sampleEvent21 = new Event("Physics lecture",LocalDate.of(2021,10,19), LocalTime.of(10,10,10));
        Event.eventsList.add(sampleEvent21);


    }

    private void initWidgets()
    {
        calendarRecyclerView = findViewById(R.id.calendarRecyclerView);
        monthYearText = findViewById(R.id.monthYearTV);
        eventListView = findViewById(R.id.eventListView);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setWeekView()
    {
        monthYearText.setText(monthYearFromDate(CalendarUtils.selectedDate));
        ArrayList<LocalDate> days = daysInWeekArray(CalendarUtils.selectedDate);

        CalendarAdapter calendarAdapter = new CalendarAdapter(days, this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 7);
        calendarRecyclerView.setLayoutManager(layoutManager);
        calendarRecyclerView.setAdapter(calendarAdapter);
        setEventAdpater();
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public void previousWeekAction(View view)
    {
        CalendarUtils.selectedDate = CalendarUtils.selectedDate.minusWeeks(1);
        setWeekView();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void nextWeekAction(View view)
    {
        CalendarUtils.selectedDate = CalendarUtils.selectedDate.plusWeeks(1);
        setWeekView();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onItemClick(int position, LocalDate date)
    {
        CalendarUtils.selectedDate = date;
        setWeekView();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setEventAdpater();
    }

    private void setEventAdpater()
    {
        ArrayList<Event> dailyEvents = Event.eventsForDate(CalendarUtils.selectedDate);
        EventAdapter eventAdapter = new EventAdapter(getApplicationContext(), dailyEvents);
        eventListView.setAdapter(eventAdapter);
    }

    public void newEventAction(View view)
    {
        startActivity(new Intent(this, EventEditActivity.class));
    }



}