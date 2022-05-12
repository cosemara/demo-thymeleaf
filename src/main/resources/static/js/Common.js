function fnLoading(selector, message) {
	$(selector).oLoader({
		wholeWindow: true, //makes the loader fit the window size
		lockOverflow: true, //disable scrollbar on body
		backgroundColor: '#000',
		fadeLevel: 0.4,
		style: "<div style='position: absolute;top: 50%;left: 50%;margin-top: -37.5px;margin-left: -37.5px;width:75px; height:75px;'><img style='width:100%; position: relative;top: 32%;left: 15.5%;' src="+ message +"></div>",
		hideAfter: 30000
	});
};

function fnLoadingHide() {
	$('body').oLoader('hide');
}