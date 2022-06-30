package com.example.modul_1_zaniatie_2_dom_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MYLOG", " - DOMASHKA #3 - ");

        int ticketPrice = 10;
        int years = 70;
        int payment = 7;
        int addedPayment = 5;
        int pensionerId = 0; // 1 - YES, 0 - NO
        int needPayment;
        int refund;

        if (years < 18){
            Log.d("MYLOG", "You are child. Ticket is free for you. Please, take your place. 1");
        } else if ((years >= 18) && (years <= 60)){
            Log.d("MYLOG", "You are adult. You need a ticket. Please, make a payment.");
            if (payment == ticketPrice){
                Log.d("MYLOG", "Thank you. Please, take your place. 2");
            } else if (payment < ticketPrice){
                Log.d("MYLOG", "Ticket price is 10, please add money.");
                needPayment = ticketPrice - payment;
                Log.d("MYLOG", "You need to add " + needPayment + " UAH.");

                payment = payment + addedPayment;
                if (payment == ticketPrice){
                    Log.d("MYLOG", "Thank you. Please, take your place. 3");
                } else if (payment > ticketPrice){
                    refund = payment - ticketPrice;
                    Log.d("MYLOG", "Thank you. " + refund + " UAH will be refunded back to you. Please, take your place. 4");
                } else if (payment < ticketPrice){
                    Log.d("MYLOG", "Excuse me. This bus is not for you. Goodbye. 1");
                }
            }
        } else {
            Log.d("MYLOG", "You are pensioner. Do you have pensioner's ID?");
            if (pensionerId == 1){
                Log.d("MYLOG", "Thank you. Please, take your place. 5");
            } else {
                Log.d("MYLOG", "You need a ticket. Please, make a payment.");
                if (payment == ticketPrice){
                    Log.d("MYLOG", "Thank you. Please, take your place. 6");
                } else if (payment < ticketPrice){
                    Log.d("MYLOG", "Ticket price is 10, please add money.");
                    needPayment = ticketPrice - payment;
                    Log.d("MYLOG", "You need to add " + needPayment + " UAH.");

                    payment = payment + addedPayment;
                    if (payment == ticketPrice){
                        Log.d("MYLOG", "Thank you. Please, take your place. 7");
                    } else if (payment < ticketPrice){
                        Log.d("MYLOG", "Excuse me. This bus is not for you. Goodbye. 2");
                    } else if (payment > ticketPrice){
                        refund = payment - ticketPrice;
                        Log.d("MYLOG", "Thank you. " + refund + " UAH will be refunded back to you. Please, take your place. 8");
                    }
                }
            }
        }

    }
}