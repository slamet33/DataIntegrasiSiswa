package id.idn.dataintegrasisiswa.activity;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import id.idn.dataintegrasisiswa.R;
import id.idn.dataintegrasisiswa.fragment.FirstPage;
import id.idn.dataintegrasisiswa.fragment.FourthPage;
import id.idn.dataintegrasisiswa.fragment.SecondPage;
import id.idn.dataintegrasisiswa.fragment.ThirdPage;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton rbFirst, rbSecond, rbThird, rbFourth;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        rbFirst = findViewById(R.id.rbFirst);
        rbSecond = findViewById(R.id.rbSecond);
        rbThird = findViewById(R.id.rbThird);
        rbFourth = findViewById(R.id.rbFourth);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.replaceLayout, new FirstPage());
        transaction.commit();
        rbFirst.isChecked();

        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Fragment selectedFragment = null;
        switch (checkedId) {
            case R.id.rbFirst:
                selectedFragment = new FirstPage();
                break;
            case R.id.rbSecond:
                selectedFragment = new SecondPage();
                break;
            case R.id.rbThird:
                selectedFragment = new ThirdPage();
                break;
            case R.id.rbFourth:
                selectedFragment = new FourthPage();
                break;
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.anim_fadein, R.anim.anim_fadeout);
        transaction.replace(R.id.replaceLayout, selectedFragment);
        transaction.commit();
    }
}
