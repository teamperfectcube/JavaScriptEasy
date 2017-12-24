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

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.itsgaurav.javascripteasy.R;

import static com.itsgaurav.javascripteasy.AppConstants.EXTRA_CHAPTER_NUMBER;

public class ChapterActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        //Obtain view reference
        WebView webView = findViewById(R.id.webView);
        AdView mAdView = findViewById(R.id.adView);
        //Retrieve data from intent
        int chapterNumber = getIntent()
                .getExtras()
                .getInt(EXTRA_CHAPTER_NUMBER) + 1;
        // To set title text
        setTitle(getTitle(chapterNumber));

        //Load content from assets folder
        webView.loadUrl("file:///android_asset/" + "c" + chapterNumber + ".html");

        //For banner ads
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    /**
     * Method to return title of the actionbar
     *
     * @param number chapter number
     */
    private String getTitle(int number) {

        String title = null;
        switch (number) {
            case 1:
                title = "Js Overview";
                break;
            case 2:
                title = "JS Placement";
                break;
            case 3:
                title = "JS Output";
                break;
            case 4:
                title = "JS Syntax";
                break;
            case 5:
                title = "JS Statements";
                break;
            case 6:
                title = "JS Comments";
                break;
            case 7:
                title = "JS Variables";
                break;
            case 8:
                title = "JS Operators";
                break;
            case 9:
                title = "JS Arithmetic";
                break;
            case 10:
                title = "JS Assignment";
                break;
            case 11:
                title = "JS Data Types";
                break;
            case 12:
                title = "JS Function";
                break;
            case 13:
                title = "JS Objects";
                break;
            case 14:
                title = "JS Scope";
                break;
            case 15:
                title = "Js Events";
                break;
            case 16:
                title = "Js Strings";
                break;
            case 17:
                title = "JS String Methods";
                break;
            case 18:
                title = "JS Numbers";
                break;
            case 19:
                title = "JS Number Methods";
                break;
            case 20:
                title = "JS Maths";
                break;
            case 21:
                title = "JS Dates";
                break;
            case 22:
                title = "JS Date Formats";
                break;
            case 23:
                title = "JS Date Methods";
                break;
            case 24:
                title = "JS Array";
                break;
            case 25:
                title = "JS Arrays Methods";
                break;
            case 26:
                title = "JS Booleans";
                break;
            case 27:
                title = "JS Comparisons";
                break;
            case 28:
                title = "JS Conditions";
                break;
            case 29:
                title = "JS Switch";
                break;
            case 30:
                title = "JS Loop For";
                break;
            case 31:
                title = "JS Loop While";
                break;
            case 32:
                title = "JS Breaks";
                break;
            case 33:
                title = "JS Type Conversion";
                break;
            case 34:
                title = "JS RegExp";
                break;
            case 35:
                title = "JS Errors";
                break;
            case 36:
                title = "JS Debugging";
                break;
            case 37:
                title = "JS Hosting";
                break;
            case 38:
                title = "JS Strict Mode";
                break;
            case 39:
                title = "JS Best Practice";
                break;
            case 40:
                title = "JS Mistakes";
                break;
            case 41:
                title = "JS Performance";
                break;
            case 42:
                title = "JS Reserved Words";
                break;
            case 43:
                title = "JS JSON";
                break;
            case 44:
                title = "Forms Validation";
                break;
            case 45:
                title = "Forms API";
                break;
            case 46:
                title = "Object Definitions";
                break;
            case 47:
                title = "Object Properties";
                break;
            case 48:
                title = "Object Methods";
                break;
            case 49:
                title = "Object Prototypes";
                break;
            case 50:
                title = "Function Definitions";
                break;
            case 51:
                title = "Function Parameters";
                break;
            case 52:
                title = "Function Invocation";
                break;
            case 53:
                title = "Function Closures";
                break;
            case 54:
                title = "DOM Intro";
                break;
            case 55:
                title = "DOM Methods";
                break;
            case 56:
                title = "DOM Documents";
                break;
            case 57:
                title = "DOM Elements";
                break;
            case 58:
                title = "DOM HTML";
                break;
            case 59:
                title = "DOM CSS";
                break;
            case 60:
                title = "DOM Events";
                break;
            case 61:
                title = "DOM EventListener";
                break;
            case 62:
                title = "DOM Navigation";
                break;
            case 63:
                title = "DOM Nodes";
                break;
            case 64:
                title = "DOM NodeList";
                break;
            case 65:
                title = "JS  Window";
                break;
            case 66:
                title = "JS Screen";
                break;
            case 67:
                title = "JS Location";
                break;
            case 68:
                title = "JS History";
                break;
            case 69:
                title = "JS Navigator";
                break;
            case 70:
                title = "JS Popup Alert";
                break;
            case 71:
                title = "JS Timing";
                break;
            case 72:
                title = "JS Cookies";
                break;
            case 73:
                title = "JS Libraries";
                break;
            case 74:
                title = "JS JQuery";
                break;
            case 75:
                title = "JS Prototype";
                break;
            default:
                //Do nothing
        }
        return title;
    }

}

