package com.calatrava_spike;

import android.app.Activity;
import android.os.Bundle;

import com.calatrava.bridge.CalatravaApplication;

public class Calatrava_spike extends CalatravaApplication
{
  @Override
  public void onCreate()
  {
    // Call this to start Calatrava
    bootCalatrava("com.calatrava_spike");
  }
}
