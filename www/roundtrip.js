var PLUGIN = "RoundTrip";

var RoundTrip = {
    roundTripData: function(text, callback) {
        cordova.exec(callback, function(err) {
            callback("error: " + err);
        }, PLUGIN, "roundTrip", [text]);
    }
}