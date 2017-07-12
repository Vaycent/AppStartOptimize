package vaycent.appstartoptimize;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean mIsExit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {


        if (keyCode == KeyEvent.KEYCODE_BACK) {

            if (mIsExit) {
                this.finish();


            } else {

                Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();

                mIsExit = true;

                new Handler().postDelayed(new Runnable() {

                    @Override

                    public void run() {

                        mIsExit = false;

                    }

                }, 2000);

            }

            return true;

        }
        return super.onKeyDown(keyCode, event);
    }
}
