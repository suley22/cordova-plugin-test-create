      package test.plugin;

      import org.apache.cordova.CallbackContext;
      import org.apache.cordova.CordovaPlugin;
      import org.json.JSONArray;
      import org.json.JSONException;
      import org.json.JSONObject;

      public class SendAlert extends CordovaPlugin {

        public static final String ACTION_SEND = "send";

        public boolean execute(String action, JSONArray jsonArgs,
            CallbackContext callbackContext) throws JSONException {
          try {
            if (ACTION_SEND.equals(action)) {
              JSONObject args = jsonArgs.getJSONObject(0);
              String msj = args.getString("msj");

			  
			  callbackContext.success(msj);
			  return true;
              //alert(msj);

            }
            callbackContext.success();
            return true;
          } catch (Exception e) {
            callbackContext.error(e.getMessage());
            return false;
          }
        }
      }