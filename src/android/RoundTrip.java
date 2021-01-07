package com.chrisruckman.cordova.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RoundTrip extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if(action.equals("roundTrip")) {
            String text = args.getString(0);
            this.roundTrip(text, callbackContext);
            return true;
        }
        return false;
    }

    private void roundTrip(String text, CallbackContext callbackContext) {
        if (text != null && text.length() > 0) {
            callbackContext.success(text);
        } else {
            callbackContext.error("no string passed in");
        }
    }
}