package com.example.chuyendoinamdl_al;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDoi = (Button)findViewById(R.id.button1);
        btnDoi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText txtNam = (EditText)findViewById(R.id.editnamduonglich);
				int year = Integer.parseInt(txtNam.getText()+"");
				
				String can="",chi="";
				switch(year%10){
					case 0 : can = "Canh";
						break;
					case 1 : can = "Tân";
						break;
					case 2 : can = "Nhâm";
						break;
					case 3 : can = "Quý";
						break;
					case 4 : can = "Giáp";
						break;
					case 5 : can = "Ất";
						break;
					case 6 : can = "Bính";
						break;
					case 7 : can = "Đinh";
						break;
					case 8 : can = "Mậu";
						break;
					case 9 : can = "Kỷ";
						break;
				}
				switch(year%12){
					case 0 : chi = "Thân";
						break;
					case 1 : chi = "Dậu";
						break;
					case 2 : chi = "Tuất";
						break;
					case 3 : chi = "Hợi";
						break;
					case 4 : chi = "Tý";
						break;
					case 5 : chi = "Sửu";
						break;
					case 6 : chi = "Dần";
						break;
					case 7 : chi = "Mão";
						break;
					case 8 : chi = "Thìn";
						break;
					case 9 : chi = "Tỵ";
						break;
					case 10 : chi = "Ngọ";
						break;
					case 11 : chi = "Mùi";
						break;
				}
				
				TextView txtNamAm = (TextView)findViewById(R.id.textView4);
				txtNamAm.setText(can+" "+chi);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
