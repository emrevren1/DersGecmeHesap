package com.work.soru2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

lateinit var VizeAG : EditText;
lateinit var OdevAG : EditText;
lateinit var YılSonuAG : EditText;
lateinit var not1 : EditText;
lateinit var not2 : EditText;
lateinit var not3 : EditText;
lateinit var btn : Button;
lateinit var snc :TextView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        VizeAG = findViewById<EditText>(R.id.VizeAG1);
        OdevAG = findViewById<EditText>(R.id.OdevAG1);
        YılSonuAG = findViewById<EditText>(R.id.YilAG1);
        not1 = findViewById<EditText>(R.id.VizeNot1);
        not2 = findViewById<EditText>(R.id.OdevNot1);
        not3 = findViewById<EditText>(R.id.YilNOT1);
        btn = findViewById<Button>(R.id.button);
        snc = findViewById<TextView>(R.id.snc);

        VizeAG.setText("20");
        OdevAG.setText("20");
        YılSonuAG.setText("60");

        btn.setOnClickListener {
            val vizAg=VizeAG.text.toString().toIntOrNull() ?: 0;
            val odevAg=OdevAG.text.toString().toIntOrNull() ?: 0;
            val yilSonAg=YılSonuAG.text.toString().toIntOrNull() ?: 0;
                val ag = vizAg + odevAg + yilSonAg;
                if (ag == 100 && vizAg>0 && vizAg<99 && odevAg>0 && odevAg<99 && yilSonAg>0 && yilSonAg<99) {
                        var vize: Int = not1.text.toString().toIntOrNull() ?: 0;
                        var odev: Int = not2.text.toString().toIntOrNull() ?: 0;
                        var yilSonu: Int = not3.text.toString().toIntOrNull() ?: 0;
                        var gecmeNotu : Double;
                        var harf: String
                        if (vize > 0 && vize < 100 && odev > 0 && odev < 100 && yilSonu > 0 && yilSonu < 100) {
                            gecmeNotu = ((vize * ((VizeAG.text.toString().toDouble())/100))+(odev * ((OdevAG.text.toString().toDouble())/100))+(yilSonu * ((YılSonuAG.text.toString().toDouble())/100)))

                            when {
                                gecmeNotu >= 90 -> harf = "AA"
                                gecmeNotu >= 85 -> harf = "BA"
                                gecmeNotu >= 80 -> harf = "BB"
                                gecmeNotu >= 75 -> harf = "CB"
                                gecmeNotu >= 70 -> harf = "CC"
                                gecmeNotu >= 65 -> harf = "DC"
                                gecmeNotu >= 60 -> harf = "DD"
                                gecmeNotu >= 50 -> harf = "FD"
                                else -> harf = "FF"
                            }

                            snc.setText("Geçme Notu :" + gecmeNotu + " " + "Harf :" + harf);

                        } else {
                            Toast.makeText(
                                this,
                                "Her Not 0 ile 100 arasında bir not olmalı ve boş olmamalıdır.",
                                Toast.LENGTH_SHORT
                            ).show();
                        }


                    } else {
                        Toast.makeText(this, "Ağırlık toplamı 100 ve boş bırakılmamalı.", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        }







