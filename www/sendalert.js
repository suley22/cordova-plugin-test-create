var SendAlert = function() {};

SendAlert.prototype.send = function(successCallback, errorCallback,msj) {
	cordova.exec(successCallback, errorCallback, "SendAlert","send", ["msj":msj]);
};

var helloWorld = new SendAlert();
module.exports = helloWorld;