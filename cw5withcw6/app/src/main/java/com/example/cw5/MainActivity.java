package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;

import java.io.ByteArrayOutputStream;
import java.text.BreakIterator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();
    //s1,s2,s3,s4
    //0,1,,2,4
    int fatema = 0;
    private Object ChangeStudentBtn;
    private BreakIterator studentName;
    private ThreadLocal<String> studentAge;
    private ImageSwitcher studentPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed1 = findViewById(R.id.mm4);
        EditText ed2 = findViewById(R.id.mm5);

        Button b3 = findViewById(R.id.button);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ed1.getText().toString().equals("")) {
                } else if (ed2.getText().toString().equals("")) {
                } else{

                    Intent intent = new Intent(MainActivity.this, Page2Activity.class);

                    String Fatema = ed1.getText().toString();
                    int nationalID = Integer.parseInt(ed2.getText().toString());


                intent.putExtra("name", Fatema);
                intent.putExtra("nationalID", nationalID);


                startActivity(intent);
            }
            }
        });


    Student s1 = new Student("ماجد",14,R.drawable.);
    Student s2 = new Student("سلمان",13,R.drawable.);
    Student s3 = new Student("محمد", 13,R.drawable.wlpic);

    Student.add(s1);
    Student.add(s2);
    Student.add(s3);


       
        studentName.setText(students.get(fatema).getStudentName());
        studentAge.set(String.valueOf(students.get(fatema).getStudentAge()));
        studentPhoto.setImageResource(students.get(fatema).getStudentPhoto());

 ChangeStudentBtn.set(new View){
     fatema++;
            if (fatema==studentArrayList.size() ){
     fatema=0;
 }
            studentAge.setText(String.valueOf(students.get(fatema).getStudentAge());
     studentName.setText(students.get(fatema).getStudentName());
    studentPhoto.setImageResource(students.get(fatema).getStudentPhoto());
    

    }
        {