package br.com.simplepass.moreclosebutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Button;

import br.com.simplepass.buttonlib.MoreCloseButton;

public class MainActivity extends AppCompatActivity {

    private MoreCloseButton btnMoreClose;

    private Boolean pressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressed = false;

        btnMoreClose = (MoreCloseButton) findViewById(R.id.btn_more_close);
        btnMoreClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                morthToCloseButton();
            }
        });
    }

    private void morthToCloseButton(){

        AnimatorSet animatorSet = new AnimatorSet();

        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }
        });

        if(pressed) {
            pressed = false;
            btnMoreClose.morthToMoreButton();
        } else{
            pressed = true;
            btnMoreClose.morthToCloseButton();
        }
    }
}
