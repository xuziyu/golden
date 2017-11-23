function date(value) {
	var date = new Date(value);// long转换成date
	var year = date.getFullYear().toString();
	var month = (date.getMonth() + 1);
	var day = date.getDate().toString();
	var hour = date.getHours().toString();
	var minute = date.getMinutes().toString();
	var seconds = date.getSeconds().toString();
	if (hour <= 9) {
		hour = "0"+hour;
	}
	if (minute <= 9) {
		minute = "0"+minute;
	}
	if (seconds <= 9) {
		seconds = "0"+seconds;
	}
	return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":"
			+ seconds;
}