package com.example.hello;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by kanazawm on 2016/02/25.
 */
public class SamplePlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args,
                           CallbackContext callbackContext) throws JSONException {

        // callbackContext.success();
        callbackContext.success("A message from java");
        android.widget.Toast.makeText(
                this.cordova.getActivity(), args.getString(0), Toast.LENGTH_LONG).show();
        return true;
    }
}
