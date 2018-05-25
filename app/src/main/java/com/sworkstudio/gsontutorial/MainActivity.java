package com.sworkstudio.gsontutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    //Serilzed and deserilized java objects,..using gson

    public static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student = new Student();
        student.setName("AJay");
        student.setAge(25);
        student.setRollno(32);


        Gson gson = new Gson();

        String json = gson.toJson(student);    // converting object that has got diff properties through model class to json data  that you can convert to object by model class again


        Log.d(TAG, ""+json);


        //===================== now lets convert json to object (model class)  =======


        String jsonData = "{\"age\":25,\"name\":\"AJay\",\"rollno\":32}";     // you have to put backslash before every quote otherwise it would think end of  string ...so put that  . now we got the json data copied from log

       Student student1 =  gson.fromJson(jsonData, Student.class);    // json string ,  model class  to set json data for particular object

        Log.d(TAG, "student1 "+ student1.getName() +" "+student1.getAge()+" "+student1.getRollno());


        //=================== getting object from Json using serilizedName anotation

        Student2 student2 =  gson.fromJson(jsonData, Student2.class);  // with model class Student2

        Log.d(TAG, "student2 "+ student2.getmName() +" "+student2.getmAge()+" "+student2.getmRollNo());






        //================================= Nested Json objects  =================================================

        //our student 3 has name,age,rollno and address as well ...let see how to serilize and deserilize

        Address address = new Address();
        address.setmCity("Delhi");
        address.setmCountry("India");


        Student3 student3 = new Student3();

        student3.setmAge("29");
        student3.setmName("Pinku");
        student3.setmRollNo("447");
        student3.setAddress(address);


        String student3Json = gson.toJson(student3);

        Log.d(TAG, "student3 toJSON "+student3Json);


        //now lets convert json to object


        Student3 student3obj =  gson.fromJson(student3Json, Student3.class);  // with model class Student2

        Log.d(TAG, "Student3 "+ student3.getmName() +" "+student3.getmAge()+" "+student3.getmRollNo()+" "+ student3.getAddress().getmCity() +"  "+student3.getAddress().getmCountry());











    }
}
