package br.com.simplepass.moreclosebutton;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.simplepass.buttonlib.MoreCloseButton;

public class MainActivity extends AppCompatActivity {

    private MoreCloseButton btnMoreClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoreClose = (MoreCloseButton) findViewById(R.id.btn_more_close);
        btnMoreClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                morthToCloseButton();
            }
        });
    }

    private void morthToCloseButton(){
        Log.d("Log", "passou aqui");

        btnMoreClose.morthToCloseButton();

        /*ObjectAnimator cornerAnimation =
                ObjectAnimator.ofFloat(btnMoreClose,
                        "cornerRadius",
                        100f,
                        0f);

        ValueAnimator widthAnimation = ValueAnimator.ofInt(btnMoreClose.getWidth(), 200);
        widthAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int val = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = btnMoreClose.getLayoutParams();
                layoutParams.width = val;
                btnMoreClose.setLayoutParams(layoutParams);
            }
        });

        ValueAnimator heightAnimation = ValueAnimator.ofInt(btnMoreClose.getHeight(), 200);
        heightAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int val = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = btnMoreClose.getLayoutParams();
                layoutParams.height = val;
                btnMoreClose.setLayoutParams(layoutParams);
            }
        });

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(cornerAnimation, widthAnimation, heightAnimation);
        animatorSet.start();*/
    }
}
