package com.calatrava_spike;

import android.app.Activity;
import android.os.Bundle;

import com.calatrava.bridge.CalatravaApplication;

public class Bootstrap extends Activity
{
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    ((CalatravaApplication)getApplication()).provideActivityContext(this);

    // And then start your first feature
    launchFlow("example.converter.start");
  }
}
