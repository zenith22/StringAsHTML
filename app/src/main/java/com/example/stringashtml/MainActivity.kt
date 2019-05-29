package com.example.stringashtml

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.view.View
import android.webkit.CookieManager
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings = webview.settings
        settings.javaScriptEnabled
        settings.domStorageEnabled = true
        settings.databaseEnabled = true
        settings.setAppCacheEnabled(true)
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        settings.allowFileAccess = true
        settings.allowFileAccessFromFileURLs = true
        settings.allowContentAccess = true
        settings.allowUniversalAccessFromFileURLs = true


        launchURL()
    }

    fun launchURL() {
        val str = "History\n" +
                "            Riots and political conflicts of the 1960s\n" +
                "\n" +
                "\n" +
                "--------Line Feed1----------------\n" +
                "\n" +
                "\n" +
                "              The LAPD Metropolitan Division's \"D\" Platoon is one of the world's most prominent SWAT units and was the second SWAT team established in the United States, after that of the Philadelphia Police Department in 1964.[2]\n" +
                "According to the Historical Dictionary of Law Enforcement, the term \"SWAT\" was used as an acronym for the \"Special Weapons and Tactics\" established as a 100-man specialized unit in 1964 by the Philadelphia Police Department in response to an alarming increase in bank robberies. \n" +
                "\n" +
                "--------Line Feed2----------------\n" +
                "\n" +
                "\n" +
                "                  The purpose of this unit was to react quickly and decisively to bank robberies while they were in progress, by utilizing a large number of specially trained officers who had at their disposal a great amount of firepower. The tactic worked and was later soon to resolve other types of incidents involving heavily armed criminals.[2][3] Los Angeles Police Department (LAPD) Inspector Daryl Gates has said that he first envisioned \"SWAT\" as an acronym for \"Special Weapons Attack Team\" in 1967, but later accepted \"Special Weapons and Tactics\" on the advice of his deputy chief, Edward M. Davis.[4]\n" +
                "\n" +
                "" +
                "<p>&#160;</p>\n" +
                "<p><span><img src=\"https://upload.wikimedia.org/wikipedia/commons/1/19/Flag_of_Andorra.svg\" border=\"0\" alt=\"\" /></span></p>\n" +
                "<p>&#160;</p>"


//        webview.loadDataWithBaseURL(null, str, "text/html", "utf-8", null)

//        webview.loadDataWithBaseURL(null, Html.toHtml(SpannableString(str)), "text/html", "utf-8", null)

        webview.loadDataWithBaseURL(null, str.replace("\n","<br/>"), "text/html", "utf-8", null)
    }
}
