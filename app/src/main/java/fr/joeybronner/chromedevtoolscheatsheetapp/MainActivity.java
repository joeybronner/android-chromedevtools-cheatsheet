package fr.joeybronner.chromedevtoolscheatsheetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import fr.joeybronner.chromedevtoolscheatsheetapp.utils.Constants;
import fr.joeybronner.chromedevtoolscheatsheetapp.utils.Utils;

public class MainActivity extends AppCompatActivity {

    ImageView ivWindows, ivMac;
    HTextView hTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivWindows = (ImageView) this.findViewById(R.id.ivWindows);
        ivMac = (ImageView) this.findViewById(R.id.ivMac);

        hTextView = (HTextView) findViewById(R.id.text);
        hTextView.setAnimateType(HTextViewType.TYPER);
        hTextView.animateText(getResources().getString(R.string.app_product_name));

        Utils.overrideFonts(getApplicationContext(), getWindow().getDecorView().getRootView());

        ivWindows.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Constants.PLATFORM = "win";
                launchCategoryActivity();
            }
        });

        ivMac.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Constants.PLATFORM = "mac";
                launchCategoryActivity();
            }
        });
    }

    private void launchCategoryActivity() {
        Intent mainIntent = new Intent(getApplicationContext(), CategoriesActivity.class);
        startActivity(mainIntent);
    }
}
