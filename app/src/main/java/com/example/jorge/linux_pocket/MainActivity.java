package com.example.jorge.linux_pocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int IMAGES[] = {R.drawable.imagen1,R.drawable.imagen2,R.drawable.imagen3, R.drawable.imagen4};

    String NAMES[] = {"1. 400 Comandos indispensables", "2. Comandos básicos", "3. Cambiar modo ficheros", "4. dpkg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listado);

        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, muestraPagina.class);
                intent.putExtra("posicion",position);
                startActivity(intent);



            }
        });


    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount(){
            return IMAGES.length;
        }
        @Override
        public Object getItem(int i){
            return null;
        }
        @Override
        public long getItemId(int i){
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup){
            view= getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imagen);
            TextView textView_name=(TextView)view.findViewById(R.id.nombre);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);

            return view;

        }


    }



}
