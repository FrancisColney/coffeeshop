package com.example.justjava;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int quantity=0;
    public void submitOrder(View view) {
        display(quantity);
        displayPrice(quantity * 5);
        if(quantity>5)
            displayMessage("You ordered "+quantity+" coffee \" thank you\"" +
                    "\n Have a nice day");
        else
            displayMessage("");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void Increment(View view) {
        quantity=quantity+1;
        display(quantity);
    }

    public void Decrement(View view){
        quantity=quantity-1;
        display(quantity);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView lastTextView = (TextView) findViewById(R.id.last_text_view);
        lastTextView.setText(message);
    }

}