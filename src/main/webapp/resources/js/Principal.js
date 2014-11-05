var map;
var locais;

$(document).ready(function() {
	getLocais();

	google.maps.event.addDomListener(window, 'load', initialize);
});

function getLocais() {
	console.log("entrou");
	$.ajax({
        url: "getLocais",
        type: "POST",
//        data: JSON.stringify(json),
         
        beforeSend: function(xhr) {
            xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
        },
        success: function(Locais) {
            console.log(Locais);
        }
    });
}

function initialize() {
	var mapOptions = {
		zoom : 8
	};
	map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

	// Try HTML5 geolocation
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(function(position) {
			var pos = new google.maps.LatLng(position.coords.latitude,
					position.coords.longitude);

			var infowindow = new google.maps.InfoWindow({
				map : map,
				position : pos,
				content : 'Location found using HTML5.'
			});

			map.setCenter(pos);
			map.setZoom(15);

		}, function() {
			handleNoGeolocation(true);
		});
	} else {
		// Browser doesn't support Geolocation
		handleNoGeolocation(false);
	}
}

function handleNoGeolocation(errorFlag) {
	if (errorFlag) {
		var content = 'Error: The Geolocation service failed.';
	} else {
		var content = 'Error: Your browser doesn\'t support geolocation.';
	}

	var options = {
		map : map,
		position : new google.maps.LatLng(60, 105),
		content : content
	};

	var infowindow = new google.maps.InfoWindow(options);
	map.setCenter(options.position);
}