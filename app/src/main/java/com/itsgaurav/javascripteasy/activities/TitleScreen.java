/*
 * MIT License
 *
 * Copyright (c) 2017 Perfect Cube
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.itsgaurav.javascripteasy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.itsgaurav.javascripteasy.R;

/**
 * Launcher screen
 */
public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //For fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_title);
        //initialize this screen
        initScreen();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Finish this activity
        finish();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    /**
     * Initialize this screen.
     */
    private void initScreen() {
        Thread timer = new Thread() {
            public void run() {
                try {
                    //To pause the screen for 2 Seconds
                    sleep(2000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // To launch the MainActivity
                    startActivity(new Intent(TitleScreen.this
                            , MainActivity.class));
                }
            }
        };
        timer.start();

    }
}
