package com.example.lakshyaapubliceyeapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;


import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class OnlinecomplainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editdescription;
    Button submitpost;
    Spinner spinner;
    Spinner spinnercategory;
    Spinner spinnerarea;

    ArrayList<String> list;
    ArrayAdapter<String> arrayAdapter_list;

    ArrayList<String> listtwo;
    ArrayAdapter<String> arrayAdapter_listtwo;

    ArrayList<String> arrayList_select,arrayList_almora,arrayList_bageshwar,arrayList_Champawat,arrayList_Champoli,arrayList_dehradun,arrayList_haridwar,arrayList_Nanital,arrayList_PauriGarhwal,arrayList_Pithoragarh,arrayList_Rudraprayag,arrayList_TehriGarhwal,arrayList_Uttarkashi,arrayList_UdhamSinghNagar;
    ArrayAdapter<String> arrayAdapter_area;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlinecomplain);
        editdescription=findViewById(R.id.dist);
        submitpost=findViewById(R.id.submitbutton);
        spinnerarea=findViewById(R.id.spinnersub);
        submitpost.setOnClickListener((View.OnClickListener) this);





        spinner=(Spinner)findViewById(R.id.spinner);

        list = new ArrayList<>();
        list.add("Select District");
        list.add("Almora");
        list.add("Bageshwar");
        list.add("Champoli");
        list.add("Champawat");
        list.add("Dehradun");
        list.add("Haridwar");
        list.add("Nanital");
        list.add("Pauli Garhawal");
        list.add("Pithoragarh");
        list.add("Rudra Prayag");
        list.add("Tehri Garhwal");
        list.add("Udham Singh Nagar");
        list.add("Uttarkashi");

        arrayAdapter_list = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,list);
        spinner.setAdapter(arrayAdapter_list);

        arrayList_select = new ArrayList<>();
        arrayList_select.add("Select area");

        arrayList_almora = new ArrayList<>();
        arrayList_almora.add("Amdhar");
        arrayList_almora.add("Asgoli");
        arrayList_almora.add("Bagwalipokhar");
        arrayList_almora.add("Bainskhet");
        arrayList_almora.add("Bhagoti");
        arrayList_almora.add("Bhagtola Ed");
        arrayList_almora.add("Bhoolgaon");
        arrayList_almora.add("Bhyari");
        arrayList_almora.add("Daulaghat");
        arrayList_almora.add("Debikhal");
        arrayList_almora.add("Dhaularh");
        arrayList_almora.add("Jaurasi");
        arrayList_almora.add("Jhimar");
        arrayList_almora.add("Khira");
        arrayList_almora.add("Lakhani");
        arrayList_almora.add("Lamgara");
        arrayList_almora.add("Maithani");
        arrayList_almora.add("Manan");
        arrayList_almora.add("Pokhari");
        arrayList_almora.add("Ramara");
        arrayList_almora.add("Rampur");
        arrayList_almora.add("Rasyaragaon");
        arrayList_almora.add("Rotapani");
        arrayList_almora.add("Someshwar");



        arrayList_bageshwar = new ArrayList<>();
        arrayList_bageshwar.add("Ason");
        arrayList_bageshwar.add("Bageshwar");
        arrayList_bageshwar.add("Baghar");
        arrayList_bageshwar.add("Bahuli");
        arrayList_bageshwar.add("Baisani");
        arrayList_bageshwar.add("Bauri");
        arrayList_bageshwar.add("Bhanar");
        arrayList_bageshwar.add("Bhatoli");
        arrayList_bageshwar.add("Bilonasera");
        arrayList_bageshwar.add("Daula");
        arrayList_bageshwar.add("Farsali");
        arrayList_bageshwar.add("Gadera");
        arrayList_bageshwar.add("Harkote");
        arrayList_bageshwar.add("Horali");
        arrayList_bageshwar.add("Jakhani");
        arrayList_bageshwar.add("Kanda");
        arrayList_bageshwar.add("Kapoori");
        arrayList_bageshwar.add("Khankra");
        arrayList_bageshwar.add("Mahruri");
        arrayList_bageshwar.add("Mantoli");
        arrayList_bageshwar.add("Sankot");
        arrayList_bageshwar.add("Simgari");
        arrayList_bageshwar.add("Uprari");

        arrayList_Champoli = new ArrayList<>();
        arrayList_Champoli.add("Adibadri");
        arrayList_Champoli.add("Andrapa");
        arrayList_Champoli.add("Bachher");
        arrayList_Champoli.add("Bagana");
        arrayList_Champoli.add("Bairangana");
        arrayList_Champoli.add("Balan");
        arrayList_Champoli.add("Bansbara");
        arrayList_Champoli.add("Baragaon");
        arrayList_Champoli.add("Bharki");
        arrayList_Champoli.add("Bhatoli");
        arrayList_Champoli.add("Bhikona");
        arrayList_Champoli.add("Chain");
        arrayList_Champoli.add("Cheproun");
        arrayList_Champoli.add("Debal");
        arrayList_Champoli.add("Dhak");
        arrayList_Champoli.add("Garkot");
        arrayList_Champoli.add("Gaul");
        arrayList_Champoli.add("Khal");
        arrayList_Champoli.add("Kimoli");
        arrayList_Champoli.add("Kooni");
        arrayList_Champoli.add("Masoli");
        arrayList_Champoli.add("Trisula");

        arrayList_Champawat = new ArrayList<>();
        arrayList_Champawat.add("Ambari");
        arrayList_Champawat.add("Bagoti");
        arrayList_Champawat.add("Bapru");
        arrayList_Champawat.add("Bhingrara");
        arrayList_Champawat.add("Bhumlai");
        arrayList_Champawat.add("Bibil");
        arrayList_Champawat.add("Birgul");
        arrayList_Champawat.add("Chandani");
        arrayList_Champawat.add("Dhaun");
        arrayList_Champawat.add("Fungar");
        arrayList_Champawat.add("Kotkendri");
        arrayList_Champawat.add("Lohia Head");
        arrayList_Champawat.add("Neer");
        arrayList_Champawat.add("Ramaila");
        arrayList_Champawat.add("Simiyan");
        arrayList_Champawat.add("Tanakpur");

        arrayList_dehradun = new ArrayList<>();
        arrayList_dehradun.add("Ambari");
        arrayList_dehradun.add("Anu");
        arrayList_dehradun.add("Atal");
        arrayList_dehradun.add("Bhagwat");
        arrayList_dehradun.add("Bhandrauli");
        arrayList_dehradun.add("Birmau");
        arrayList_dehradun.add("Birnad");
        arrayList_dehradun.add("Chakrata");
        arrayList_dehradun.add("Chandanwari");
        arrayList_dehradun.add("Chharba");
        arrayList_dehradun.add("Chilhar");
        arrayList_dehradun.add("Dandi");
        arrayList_dehradun.add("Dangutha");
        arrayList_dehradun.add("Dawla");
        arrayList_dehradun.add("Dhakrani");
        arrayList_dehradun.add("Dhalipur");
        arrayList_dehradun.add("Dimau");
        arrayList_dehradun.add("Dobhri");
        arrayList_dehradun.add("Dungiara");
        arrayList_dehradun.add("Gadsar");
        arrayList_dehradun.add("Gumaniwala");
        arrayList_dehradun.add("Haldwari");
        arrayList_dehradun.add("Kainchiwala");
        arrayList_dehradun.add("Kathang");
        arrayList_dehradun.add("Kirar");
        arrayList_dehradun.add("Pashulok");

        arrayList_haridwar = new ArrayList<>();
        arrayList_haridwar.add("Aithal");
        arrayList_haridwar.add("Badshahpur");
        arrayList_haridwar.add("Chandpuri");
        arrayList_haridwar.add("Dhanauri");
        arrayList_haridwar.add("Khanpur");
        arrayList_haridwar.add("Manu Bas");
        arrayList_haridwar.add("Raisi");
        arrayList_haridwar.add("Ransura");
        arrayList_haridwar.add("Roorkee City");
        arrayList_haridwar.add("Sultanpur");

        arrayList_Nanital = new ArrayList<>();
        arrayList_Nanital.add("Bail Parao");
        arrayList_Nanital.add("Bindhukhatta");
        arrayList_Nanital.add("Chhoi");
        arrayList_Nanital.add("Dhikuli");
        arrayList_Nanital.add("Ghangreti");
        arrayList_Nanital.add("Haldiyani");
        arrayList_Nanital.add("Karanpur");
        arrayList_Nanital.add("Khairali");
        arrayList_Nanital.add("Mohan");
        arrayList_Nanital.add("Pandey Gaon");
        arrayList_Nanital.add("Patkote");
        arrayList_Nanital.add("Roorkee City");
        arrayList_Nanital.add("Sethi Belgaon");
        arrayList_Nanital.add("Sunsyari");

        arrayList_PauriGarhwal = new ArrayList<>();
        arrayList_PauriGarhwal.add("Adwani");
        arrayList_PauriGarhwal.add("Ainthi");
        arrayList_PauriGarhwal.add("Amola");
        arrayList_PauriGarhwal.add("Amotha");
        arrayList_PauriGarhwal.add("Asankhet");
        arrayList_PauriGarhwal.add("Bachali");
        arrayList_PauriGarhwal.add("Badun");
        arrayList_PauriGarhwal.add("Bagodgaon");
        arrayList_PauriGarhwal.add("Bagrigar");
        arrayList_PauriGarhwal.add("Baherakhal");
        arrayList_PauriGarhwal.add("Balasaur");
        arrayList_PauriGarhwal.add("Balli");
        arrayList_PauriGarhwal.add("Banani");
        arrayList_PauriGarhwal.add("Banchauri");
        arrayList_PauriGarhwal.add("Bandun");
        arrayList_PauriGarhwal.add("Bangaon Malla");
        arrayList_PauriGarhwal.add("Bangar");
        arrayList_PauriGarhwal.add("Banghat");
        arrayList_PauriGarhwal.add("Barkot");
        arrayList_PauriGarhwal.add("Basola");
        arrayList_PauriGarhwal.add("Baunsal Talla");
        arrayList_PauriGarhwal.add("Bhatwari");
        arrayList_PauriGarhwal.add("Biyasi");
        arrayList_PauriGarhwal.add("Budakot");
        arrayList_PauriGarhwal.add("Bughani");
        arrayList_PauriGarhwal.add("Chamsain");
        arrayList_PauriGarhwal.add("Chandoli Malli");
        arrayList_PauriGarhwal.add("Chaukuri");
        arrayList_PauriGarhwal.add("Dondal");
        arrayList_PauriGarhwal.add("Gaulikhal");
        arrayList_PauriGarhwal.add("Jaletha");
        arrayList_PauriGarhwal.add("Kaliyasaur");
        arrayList_PauriGarhwal.add("Khirarikhal");
        arrayList_PauriGarhwal.add("Khirshu");
        arrayList_PauriGarhwal.add("Kundi");
        arrayList_PauriGarhwal.add("Nainidanda");

        arrayList_Pithoragarh = new ArrayList<>();
        arrayList_Pithoragarh.add("Adichaura");
        arrayList_Pithoragarh.add("Agar");
        arrayList_Pithoragarh.add("Algara");
        arrayList_Pithoragarh.add("Atalgaon");
        arrayList_Pithoragarh.add("Baikote");
        arrayList_Pithoragarh.add("Bajani");
        arrayList_Pithoragarh.add("Balgari");
        arrayList_Pithoragarh.add("Baluwakote");
        arrayList_Pithoragarh.add("Bandarlima");
        arrayList_Pithoragarh.add("Bansbagar");
        arrayList_Pithoragarh.add("Banspatan");
        arrayList_Pithoragarh.add("Baram");
        arrayList_Pithoragarh.add("Barsayat");
        arrayList_Pithoragarh.add("Basaur");
        arrayList_Pithoragarh.add("Berinag");
        arrayList_Pithoragarh.add("Bhainskote");
        arrayList_Pithoragarh.add("Bhandarigaon");
        arrayList_Pithoragarh.add("Bhuwaneshwar");
        arrayList_Pithoragarh.add("Binayak");
        arrayList_Pithoragarh.add("Boyal");
        arrayList_Pithoragarh.add("Chahaj");
        arrayList_Pithoragarh.add("Chalma Chilasu");
        arrayList_Pithoragarh.add("Chaukori");
        arrayList_Pithoragarh.add("Chauna");
        arrayList_Pithoragarh.add("Dashauli");
        arrayList_Pithoragarh.add("Dhamigaon");
        arrayList_Pithoragarh.add("Dor");
        arrayList_Pithoragarh.add("Dungri");
        arrayList_Pithoragarh.add("Fultari");

        arrayList_Rudraprayag = new ArrayList<>();
        arrayList_Rudraprayag.add("Basti");
        arrayList_Rudraprayag.add("Bhatwari");
        arrayList_Rudraprayag.add("Bhiri");
        arrayList_Rudraprayag.add("Biron");
        arrayList_Rudraprayag.add("Byung");
        arrayList_Rudraprayag.add("Dadoli");
        arrayList_Rudraprayag.add("Falasi");
        arrayList_Rudraprayag.add("Kotma");

        arrayList_TehriGarhwal = new ArrayList<>();
        arrayList_TehriGarhwal.add("Akhori");
        arrayList_TehriGarhwal.add("Badon");
        arrayList_TehriGarhwal.add("Bagi");
        arrayList_TehriGarhwal.add("Barkot");
        arrayList_TehriGarhwal.add("Beena");
        arrayList_TehriGarhwal.add("Berni");
        arrayList_TehriGarhwal.add("Bhigun");
        arrayList_TehriGarhwal.add("Chourikhal");
        arrayList_TehriGarhwal.add("Dangi");
        arrayList_TehriGarhwal.add("Dharkot");
        arrayList_TehriGarhwal.add("Jakhand");
        arrayList_TehriGarhwal.add("Kirtinagar");
        arrayList_TehriGarhwal.add("Kundri");
        arrayList_TehriGarhwal.add("Magron");
        arrayList_TehriGarhwal.add("Manjkot");
        arrayList_TehriGarhwal.add("Nagni");
        arrayList_TehriGarhwal.add("Shivpuri");
        arrayList_TehriGarhwal.add("Takoli");
        arrayList_TehriGarhwal.add("Thati Dagar");

        arrayList_UdhamSinghNagar = new ArrayList<>();
        arrayList_UdhamSinghNagar.add("Adarshnagar");
        arrayList_UdhamSinghNagar.add("Anandnagar");
        arrayList_UdhamSinghNagar.add("Bara");
        arrayList_UdhamSinghNagar.add("Barhani");
        arrayList_UdhamSinghNagar.add("Barionwala");
        arrayList_UdhamSinghNagar.add("Beria Majhola");
        arrayList_UdhamSinghNagar.add("Bhajuanagla");
        arrayList_UdhamSinghNagar.add("Bhanga");
        arrayList_UdhamSinghNagar.add("Bidora");
        arrayList_UdhamSinghNagar.add("Bigra Bagh");
        arrayList_UdhamSinghNagar.add("Charubetta");
        arrayList_UdhamSinghNagar.add("Chattarpur");
        arrayList_UdhamSinghNagar.add("Danpur");
        arrayList_UdhamSinghNagar.add("Dhanauri");
        arrayList_UdhamSinghNagar.add("Dharampur");
        arrayList_UdhamSinghNagar.add("Doraha");
        arrayList_UdhamSinghNagar.add("Gadarpura");
        arrayList_UdhamSinghNagar.add("Jamaur");
        arrayList_UdhamSinghNagar.add("Jhagarpuri");
        arrayList_UdhamSinghNagar.add("Jogipura");
        arrayList_UdhamSinghNagar.add("Karanpur");
        arrayList_UdhamSinghNagar.add("Khatima");
        arrayList_UdhamSinghNagar.add("Nakulia");
        arrayList_UdhamSinghNagar.add("Nausar");
        arrayList_UdhamSinghNagar.add("Pandari");

        arrayList_Uttarkashi = new ArrayList<>();
        arrayList_Uttarkashi.add("Arakot");
        arrayList_Uttarkashi.add("Bagasu");
        arrayList_Uttarkashi.add("Bhutanu");
        arrayList_Uttarkashi.add("Burkot");
        arrayList_Uttarkashi.add("Devjani");
        arrayList_Uttarkashi.add("Dewal");
        arrayList_Uttarkashi.add("Dhatmeer");
        arrayList_Uttarkashi.add("Fitari");
        arrayList_Uttarkashi.add("Gaddugaad");
        arrayList_Uttarkashi.add("Gangani");
        arrayList_Uttarkashi.add("Jakholi");
        arrayList_Uttarkashi.add("Kantari");
        arrayList_Uttarkashi.add("Kotiyalgaon");
        arrayList_Uttarkashi.add("Pounthi");
        arrayList_Uttarkashi.add("Rajgarhi");




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_select);

                }
                if(position==1){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_almora);

                }
                if(position==2){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_bageshwar);

                }
                if(position==3){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_Champoli);

                }
                if(position==4){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_Champawat);

                }
                if(position==5){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_dehradun);

                }
                if(position==6){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_haridwar);

                }
                if(position==7){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_Nanital);

                }
                if(position==8){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_PauriGarhwal);

                }
                if(position==9){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_Pithoragarh);

                }
                if(position==10){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_Rudraprayag);

                }
                if(position==11){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_TehriGarhwal);

                }
                if(position==12){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_UdhamSinghNagar);

                }
                if(position==13){
                    arrayAdapter_area = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_Uttarkashi);

                }






                spinnerarea.setAdapter(arrayAdapter_area);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





        spinnercategory=(Spinner)findViewById(R.id.spinnernew);
        List<String> listtwo =new ArrayList<String>();
        listtwo.add("Select Category");
        listtwo.add("Abetment of Suicide");
        listtwo.add("Affray");
        listtwo.add("Arms Act");
        listtwo.add("Assault on Women with Intent to Outrage her Modesty");
        listtwo.add("Causing Death By Negligence");
        listtwo.add("Dowry Harassment");
        listtwo.add("Grevious Hurt");
        listtwo.add("Kidnapping and Abduction");
        listtwo.add("Miscellaneous IPC Crimes");
        listtwo.add("Murder");
        listtwo.add("NDPS Act");
        listtwo.add("Offence against Property");
        listtwo.add("Prostitution");
        listtwo.add("Rash Driving");
        listtwo.add("Sexual Harassment");
        listtwo.add("Simple Hurt");
        listtwo.add("Stalking");
        listtwo.add("Suicide");
        listtwo.add("Unnatural Offences");
        listtwo.add("Voyeurism");
        listtwo.add("Women Harassment");
        listtwo.add("Wrongful Restraint /Confinement");


        arrayAdapter_listtwo = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,listtwo);
        spinnercategory.setAdapter(arrayAdapter_listtwo);



    }
    private void   addItemToSheet() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String description = editdescription.getText().toString().trim();
        final String district = spinner.getSelectedItem().toString().trim();
        final String area= spinnerarea.getSelectedItem().toString().trim();
        final String category= spinnercategory.getSelectedItem().toString().trim();




        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwkJ_wRhy7I4fmQ3pyF_uSdB2lembjqXvEmJpDunnvV7Nzt-NOf5qh5ALypfQhyZDMm/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(OnlinecomplainActivity.this,response,Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem");
                parmas.put("description",description);
                parmas.put("district",district);
                parmas.put("area",area);
                parmas.put("category",category);



                return parmas;
            }
        };
        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }



    @Override
    public void onClick(View v) {
        if(v==submitpost){
            addItemToSheet();

            //Define what to do when button is clicked
        }


    }

}